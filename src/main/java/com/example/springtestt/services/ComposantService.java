package com.example.springtestt.services;

import com.example.springtestt.entities.Composant;
import com.example.springtestt.repositories.ComposantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ComposantService implements IComposantService {

    private  ComposantRepository composantRepository;


    @Override
    public List<Composant> retrieveAllComposants() {
        return composantRepository.findAll();
    }

    @Override
    public Composant addComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public Composant updateComposant(Composant e) {
        return composantRepository.save(e);
    }

    @Override
    public List<Composant> retrieveComposant(Long idComposant) {
        Optional<Composant> composant = composantRepository.findById(idComposant);
        return composant.map(List::of).orElse(null);  // Si le composant existe, le retourne dans une liste
    }

    @Override
    public void removeComposant(Long idComposant) {
        composantRepository.deleteById(idComposant);
    }

    @Override
    public List<Composant> addComposants(List<Composant> composants) {
        return composantRepository.saveAll(composants);
    }
}

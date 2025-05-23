package com.example.springtestt.services;

import com.example.springtestt.entities.ChaineRestauration;
import com.example.springtestt.repositories.ChaineRestaurationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
@AllArgsConstructor
public class ChaineRestaurationService implements IChaineRestaurationService {

    private ChaineRestaurationRepository chaineRestaurationRepository;


    @Override
    public List<ChaineRestauration> retrieveAllChaines() {
        return chaineRestaurationRepository.findAll();
    }

    @Override
    public ChaineRestauration addChaine(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public ChaineRestauration updateChaine(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public List<ChaineRestauration> retrieveChaine(Long idChaine) {
        Optional<ChaineRestauration> chaine = chaineRestaurationRepository.findById(idChaine);
        return chaine.map(List::of).orElse(null);
    }

    @Override
    public void removeChaine(Long idChaine) {
        chaineRestaurationRepository.deleteById(idChaine);
    }

    @Override
    public List<ChaineRestauration> addChaines(List<ChaineRestauration> chaines) {
        return chaineRestaurationRepository.saveAll(chaines);
    }
}

package com.example.springtestt.repositories;

import com.example.springtestt.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

    //List<Restaurant> findByChaineRestaurationLibelle(String l);

    List<Restaurant> findByChaineRestaurationLibelleAndChaineRestaurationDateCreation(String libelle, LocalDate dateCreation);

    Restaurant findByNom(String nom);

    // 1.5 Liste des restaurants ayant une capacité > 100 et dont la chaîne a été créée avant 2020
    List<Restaurant> findByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationBefore(Long capacite, LocalDate date);

}

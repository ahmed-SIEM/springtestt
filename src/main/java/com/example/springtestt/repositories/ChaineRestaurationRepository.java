package com.example.springtestt.repositories;

import com.example.springtestt.entities.ChaineRestauration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChaineRestaurationRepository extends JpaRepository<ChaineRestauration, Long> {
    ChaineRestauration findByLibelle(String libelle);

}

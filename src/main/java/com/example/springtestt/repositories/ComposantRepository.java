package com.example.springtestt.repositories;

import com.example.springtestt.entities.Composant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComposantRepository extends JpaRepository<Composant, Long> {
}

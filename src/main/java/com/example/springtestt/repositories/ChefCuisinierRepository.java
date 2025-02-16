package com.example.springtestt.repositories;

import com.example.springtestt.entities.ChefCuisinier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChefCuisinierRepository extends JpaRepository<ChefCuisinier, Long> {
}

package com.example.springtestt.repositories;

import com.example.springtestt.entities.Client;
import com.example.springtestt.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {

}

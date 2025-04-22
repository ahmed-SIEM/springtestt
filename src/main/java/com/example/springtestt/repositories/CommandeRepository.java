package com.example.springtestt.repositories;

import com.example.springtestt.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
    // 1.1 Liste des commandes d'un client
    List<Commande> findByClientIdClient(Long idClient);

    // 1.2 Liste des commandes d'un client dont la date commande est entre deux dates
    List<Commande> findByClientIdClientAndDateCommandeBetween(Long idClient, LocalDate startDate, LocalDate endDate);
    // 1.3 Liste des commandes dont la date commande est entre deux dates ordonnées par prix croissant
    List<Commande> findByDateCommandeBetweenOrderByTotalCommandeAsc(LocalDate startDate, LocalDate endDate);

    @Query("SELECT c FROM Commande c WHERE YEAR(c.dateCommande) = YEAR(CURRENT_DATE) ORDER BY c.note DESC")
    List<Commande> findCommandesCurrentYearOrderByNoteDesc();

    @Query("SELECT c.menu.libelleMenu, COUNT(c) FROM Commande c GROUP BY c.menu.libelleMenu ORDER BY COUNT(c) DESC")
    List<Object[]> findMostOrderedMenu();



}

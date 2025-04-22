package com.example.springtestt.services;

import com.example.springtestt.entities.Commande;

import java.util.List;

public interface ICommandeService {
    List<Commande> retrieveAllCommandes();
    Commande addCommande(Commande e);
    Commande updateCommande(Commande e);
    Commande retrieveCommande(Long idCommande);
    void removeCommande(Long idCommande);
    List<Commande> addCommandes(List<Commande> commandes);

    void menuPlusCommande();

}

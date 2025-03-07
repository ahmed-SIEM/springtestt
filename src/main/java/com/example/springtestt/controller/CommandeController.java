package com.example.springtestt.controller;


import com.example.springtestt.entities.Client;
import com.example.springtestt.entities.Commande;
import com.example.springtestt.services.ICommandeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/commande")
public class CommandeController {
    ICommandeService commandeService;

    @GetMapping("/retrieve-all-commandes")
    public List<Commande> getCommandes() {
        List<Commande> listCommandes = commandeService.retrieveAllCommandes();
        return listCommandes;
    }
    @GetMapping("/retrieve-commande/{commande-id}")
    public Commande retrieveCommande(@PathVariable("commande-id") Long idCommande) {
        return (Commande) commandeService.retrieveCommande(idCommande);
    }

    @PostMapping("/add-commande")
    public Commande addCommande(@RequestBody Commande c) {
        Commande commande = commandeService.addCommande(c);
        return commande;
    }

    @DeleteMapping("/remove-commande/{commande-id}")
    public void removeCommande(@PathVariable("commande-id") Long idCommande) {
        commandeService.removeCommande(idCommande);
    }

    @PutMapping("/update-commande")
    public Commande updateClient(@RequestBody Commande c) {
        Commande commande= commandeService.updateCommande(c);
        return commande;
    }

}

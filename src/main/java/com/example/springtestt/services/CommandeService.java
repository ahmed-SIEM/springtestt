package com.example.springtestt.services;

import com.example.springtestt.entities.Commande;
import com.example.springtestt.repositories.CommandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;


@Service

@Slf4j
@AllArgsConstructor
public class CommandeService implements ICommandeService {

    private  CommandeRepository commandeRepository;


    @Override
    public List<Commande> retrieveAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande addCommande(Commande e) {
        return commandeRepository.save(e);
    }

    @Override
    public Commande updateCommande(Commande e) {
        return commandeRepository.save(e);
    }

    @Override
    public Commande retrieveCommande(Long idCommande) {
        Optional<Commande> commande = commandeRepository.findById(idCommande);
        return commande.orElse(null);
    }

    @Override
    public void removeCommande(Long idCommande) {
        commandeRepository.deleteById(idCommande);
    }

    @Override
    public List<Commande> addCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }



   // @Scheduled(cron = "*/15 * * * * *")
    public void findCurrentYearCommandesOrderByNote() {
        List<Commande> commandes = commandeRepository.findCommandesCurrentYearOrderByNoteDesc();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (Commande c : commandes) {
            String date = c.getDateCommande().format(formatter);
            float montant = c.getTotalCommande();
            Long note = c.getNote();

            log.info("La commande faite le");
            log.info("{} d'un montant global de {} a une note de {}", date, montant, note);
        }
    }

   // @Scheduled(cron = "0 0 13 * * *")
    public void menuPlusCommande() {
        List<Object[]> result = commandeRepository.findMostOrderedMenu();

        if (!result.isEmpty()) {
            Object[] row = result.get(0);
            String menuName = (String) row[0];
            Long count = (Long) row[1];

            log.info("Le menu le plus commandé dans votre restaurant est {} commandé {} fois", menuName, count);
        } else {
            log.info("Aucune commande trouvée.");
        }
    }



}

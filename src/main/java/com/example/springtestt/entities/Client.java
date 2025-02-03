package com.example.springtestt.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long idClient;
    private String identifiant;
    private LocalDate datePremiereVisite;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;
}
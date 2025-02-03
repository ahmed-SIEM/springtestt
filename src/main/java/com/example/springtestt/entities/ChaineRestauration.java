package com.example.springtestt.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ChaineRestauration {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;

    @OneToMany(mappedBy = "chaineRestauration",fetch = FetchType.LAZY)
    private List<Restaurant> restaurants;
}
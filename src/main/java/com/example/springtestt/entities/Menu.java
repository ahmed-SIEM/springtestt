package com.example.springtestt.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;

    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    private float prixTotal;

    @OneToMany(mappedBy = "menu")
    private Set<Commande> commandes;

    @OneToMany(mappedBy = "menu")
    private Set<Composant> composants;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ChefCuisinier> chefs;

}
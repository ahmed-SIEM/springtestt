package com.example.springtestt.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Restaurant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nom;
    private Long nbPlacesMax;

    @ManyToOne
    private ChaineRestauration chaineRestauration;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Menu> menus;


}
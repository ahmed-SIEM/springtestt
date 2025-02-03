package com.example.springtestt.entities;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Composant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;
    private String nomComposant;
    private Float prix;

    @ManyToOne
    private Menu menu;

    @OneToOne
    private DetailComposant DetailComposant;

}


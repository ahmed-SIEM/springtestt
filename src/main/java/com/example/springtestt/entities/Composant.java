package com.example.springtestt.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Composant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;
    private String nomComposant;
    private Float prix;

    @ManyToOne
    private Menu menu;

    @OneToOne
    private DetailComposant detailComposant;

}


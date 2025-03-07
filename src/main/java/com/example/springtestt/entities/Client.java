package com.example.springtestt.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
     Long idClient;
     String identifiant;
     LocalDate datePremiereVisite;
    @OneToMany(mappedBy = "client")
     List<Commande> commandes;



}
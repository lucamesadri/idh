package br.edu.univille.poo.idh.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double idh;
    private String bandeiraUrl;
    @ManyToOne
    private Continente continente;
}

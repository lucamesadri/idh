package br.edu.univille.poo.idh.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Continente {
    private long id;
    private String nome;
}
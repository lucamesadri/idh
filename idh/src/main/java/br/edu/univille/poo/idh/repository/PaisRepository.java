package br.edu.univille.poo.idh.repository;

import br.edu.univille.poo.idh.entity.Continente;
import br.edu.univille.poo.idh.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaisRepository extends JpaRepository<Pais, Long> {
    List<Pais> findAllByContinente(Continente continente);
}

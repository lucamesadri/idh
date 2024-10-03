package br.edu.univille.poo.idh.service;

import br.edu.univille.poo.idh.entity.Pais;
import br.edu.univille.poo.idh.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServico {
    @Autowired
    private PaisRepository repository;
    public List<Pais> obterTodos(){
        return repository.findAll();
    }

}

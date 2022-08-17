package br.com.matt.exercicioSpring.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.matt.exercicioSpring.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}

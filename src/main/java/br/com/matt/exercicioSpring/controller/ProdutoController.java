package br.com.matt.exercicioSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.matt.exercicioSpring.model.entities.Produto;
import br.com.matt.exercicioSpring.model.repositories.ProdutoRepository;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@PostMapping
	public Produto novoProduto(Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
}

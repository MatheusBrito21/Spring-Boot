package br.com.matt.exercicioSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculadora")
public class Calculadora {
	
	@GetMapping	
	public String imprimirMensagem() {
		return "Bem vindo à minha calculadora!";
	}
	
	@GetMapping(path = "/soma/{a}/{b}")
	public int soma(@PathVariable int a, @PathVariable int b) {
		return a+b;
	}
	
	@GetMapping(path = "/sub")
	public int subtracao(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		return a-b;
	}
	
}

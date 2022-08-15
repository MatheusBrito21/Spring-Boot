package br.com.matt.exercicioSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloUser {
	@GetMapping
	public String hello(@RequestParam(value = "name", defaultValue = "World")String name) {
		return String.format("Hello %s!", name);
	}
}

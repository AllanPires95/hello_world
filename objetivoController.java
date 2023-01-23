package org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class objetivoController {

	@RestController // Informa que é um controller
	@RequestMapping("/objetivos") //Informa o endereço da web

	public class objetivosController {
		@GetMapping //Pega informação do método e exibe
		public String hello() {
			return "Aprender a utilizar o STS, entender como funcionam os comandos"
					+ "e trabalhar no projeto integrador.";	
				}
	}
}

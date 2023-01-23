package org.generation.hello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Informa que é um controller
@RequestMapping("/helloworld")//Informa o endereço da web 

public class helloController {
		
	@GetMapping //pega informação do método e exibe
	public String hello() {
		return "Hellor World! Seja bem vindos ao Spring!";}
		

		
	}


	

//MODEL, VIEW, CONTROLLER (MVC)
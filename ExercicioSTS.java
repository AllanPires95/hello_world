package org.generation.hello.controller;

public class ExercicioSTS {

	package org.generation.hello.controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController //Informa que é um controller
	@RequestMapping("/helloworld")//Informa o endereço da web 

	public class ExercicioSTS {
			
		@GetMapping //pega informação do método e exibe
		public String hello() {
			return "Hellor World! Seja bem vindos ao Spring!";}
			

			
	}

//}
//public class metodosController {

	
//	String ment [] = { "Comunicação","Mentalidade De Crescimento","Orientação Ao Detalhe", "Orientação Ao Futuro",
//			"Trabalho Em Equipe","Responsabilidade Pessoal","Persistência","Proatividade"},saida="";
	
//	@GetMapping //Pega informação do método e exibe
//	public String mentalidade() {
//		for(String mentalidade : ment) {
//			saida += mentalidade+"<br/>";
//		}
//			return saida;
//		}
//}

//*public class objetivoController {

	//@RestController // Informa que é um controller
//	@RequestMapping("/objetivos") //Informa o endereço da web

//	public class objetivosController {
//		@GetMapping //Pega informação do método e exibe
//		public String hello() {
//			return "Aprender a utilizar o STS, entender como funcionam os comandos"
	//				+ "e trabalhar no projeto integrador.";	
	//			}
//	}
//*}


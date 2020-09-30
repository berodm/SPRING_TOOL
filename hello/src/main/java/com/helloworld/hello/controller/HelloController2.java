package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello1")
public class HelloController2 {

	@GetMapping("/get1")
	public String hello1() {
		return "Hello World Ex.2!\nMeus Objetivos de aprendizagem essa semana são:\n Aprender e me aprofundar em Spring e entender sua conexão com o backend.";
	}
	@GetMapping("/get2")
	public String hello2() {
		return "Hello World Ex.2!\nMeus Objetivos de aprendizagem essa semana são:\n Aprender e me aprofundar em Spring e entender sua conexão com o backend.";
	}
	//duplicado somente para aplicação e consulta futura do conceito "get" 
}

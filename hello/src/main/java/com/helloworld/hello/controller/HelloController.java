package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World!\nUtilizei as seguintes habilidades e mentalidades: Foco, Persistência, Mentalidade de Crescimento";
	}
}

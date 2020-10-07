package com.minhaEscola.alunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaEscola.alunos.model.Alunos;
import com.minhaEscola.alunos.repository.AlunoRepository;



@RestController
@RequestMapping
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping("/cadastro")
	public ResponseEntity<List<Alunos>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/cadastro/{id}")    
	public ResponseEntity<Alunos> GetById(@PathVariable long id){        
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))    
				.orElse(ResponseEntity.notFound().build());      }

	
	@PostMapping("/cadastro")
	public ResponseEntity<Alunos> criar(@RequestBody Alunos aluno) {
		return ResponseEntity.ok(repository.save(aluno));
	}
	
	@PutMapping("/alunos/{id}")
	public Alunos atualizar(@PathVariable Long id, @RequestBody Alunos aluno) {
		aluno.setId(id);
		repository.save(aluno);
		return aluno;}
	
	
	@DeleteMapping("/cadastro/{id}")
	public String remover(@PathVariable Long id) {
		repository.deleteById(id);
		return "sucesso";
}
}

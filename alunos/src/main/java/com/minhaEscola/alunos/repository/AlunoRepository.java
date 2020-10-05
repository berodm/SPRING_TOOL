package com.minhaEscola.alunos.repository;

import java.util.List;

import com.minhaEscola.alunos.model.Alunos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository <Alunos, Long>{
	public List<Alunos> findByNome (String nome);


}




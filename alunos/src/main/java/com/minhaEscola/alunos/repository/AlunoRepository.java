<<<<<<< HEAD
package com.minhaEscola.alunos.repository;

import java.util.List;

import com.minhaEscola.alunos.model.Alunos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository <Alunos, Long>{
	public List<Alunos> findByNome (String nome);


}



=======
package com.minhaEscola.alunos.repository;

import java.util.List;

import com.minhaEscola.alunos.model.Alunos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository <Alunos, Long>{
	public List<Alunos> findByNome (String nome);


}



>>>>>>> a53ae3f54395233c72b71855ad887638918b0d41

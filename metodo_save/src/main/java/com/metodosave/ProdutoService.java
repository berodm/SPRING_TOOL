package com.metodosave;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public void save(TableProduto produto) {
		repo.save(produto);
	}
}

package org.agenciaDeEmprego.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.agenciaDeEmprego.modelo.Produto;
import org.springframework.stereotype.Repository;

@Repository
public class ProdutoRepositorio {
	
	@PersistenceContext
	private EntityManager manager;

	public void inserir(Produto produto) {
		manager.persist(produto);
	}
	
	public void atualizar(Produto produto) {
		manager.merge(produto);
	}
	
	public void excluir(Produto produto) {
		manager.remove(produto);
	}
	
	public Produto getProduto(int codigo) {
		return manager.find(Produto.class, codigo);
	}
	
	public List<Produto> getProdutos() {
		TypedQuery<Produto> query = manager.createQuery("select p from Produto p", Produto.class);
		return query.getResultList();
	}

}

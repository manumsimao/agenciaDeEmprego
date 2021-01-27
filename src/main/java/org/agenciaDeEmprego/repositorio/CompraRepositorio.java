package org.agenciaDeEmprego.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.agenciaDeEmprego.modelo.Compra;
import org.agenciaDeEmprego.modelo.Item;
import org.agenciaDeEmprego.modelo.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class CompraRepositorio {
	
	@PersistenceContext
	private EntityManager manager;

	public Compra finalizar(Usuario usuario, List<Item> itens) {
		Compra compra = new Compra();
		for(Item item:itens) {
			manager.persist(item);
		}
		compra.setItens(itens);
		compra.setUsuario(usuario);
		manager.persist(compra);
		return compra;
	}

}

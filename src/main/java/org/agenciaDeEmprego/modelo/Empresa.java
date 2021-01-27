package org.agenciaDeEmprego.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Empresa {
	@Id
	private int codigo;
	private String nome;
	
	private List<Oferta> vagas;

	public Empresa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Oferta> getVagas() {
		return vagas;
	}

	public void setVagas(List<Oferta> vagas) {
		this.vagas = vagas;
	}
	
	
}

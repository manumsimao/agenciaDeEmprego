package org.agenciaDeEmprego.modelo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Entity
public class Candidato{
	@Id
	private String cpf;
	private String nome;
	private LocalDate dataNasc;
	
	private int codigoCS;
	private String nomeCS;
	
	private List<Cargo> experiencia;

	public Candidato(String cpf, String nome, LocalDate dataNasc) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getCodigoCS() {
		return codigoCS;
	}

	public void setCodigoCS(int codigoCS) {
		this.codigoCS = codigoCS;
	}

	public String getNomeCS() {
		return nomeCS;
	}

	public void setNomeCS(String nomeCS) {
		this.nomeCS = nomeCS;
	}

	public List<Cargo> getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(List<Cargo> experiencia) {
		this.experiencia = experiencia;
	}

	
	
	
}

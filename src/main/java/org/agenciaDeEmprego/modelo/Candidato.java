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
}

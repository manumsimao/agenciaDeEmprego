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
}

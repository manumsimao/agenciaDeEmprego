package org.agenciaDeEmprego.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Oferta {
	@Id
	@GeneratedValue
	int codigo;
	@OneToOne
	Cargo cargo;
	Empresa empresa;
	
	private float salario;
	private int horas;
}

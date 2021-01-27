package org.agenciaDeEmprego.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cargo {
	@Id
	private int codigo;
	private String descricao;

}

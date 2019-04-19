package br.com.sraap.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Administrador extends Usuario {
	private static final long serialVersionUID = 1L;

	public Administrador() {

	}

	public Administrador(Integer id, String nomeCompleto, String email, String senha) {
		super(id, nomeCompleto, email, senha);
		// TODO Auto-generated constructor stub
	}

}

package br.com.sraap.models;

import javax.persistence.Entity;

@Entity
public final class Professor extends Usuario {
	private static final long serialVersionUID = 1L;

	public Professor() {
		super();

	}

	public Professor(Integer id, String nomeCompleto, String email, String senha) {
		super(id, nomeCompleto, email, senha);
		// TODO Auto-generated constructor stub
	}
}

package br.com.sraap.models;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("administrador")
public class Administrador extends Usuario {
	private static final long serialVersionUID = 1L;

	public Administrador() {

	}

	public Administrador(Integer id, String nome, String email, String senha) {
		super(id, nome, email, senha);
	}

}

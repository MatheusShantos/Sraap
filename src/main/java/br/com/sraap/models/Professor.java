package br.com.sraap.models;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("professor")
public final class Professor extends Usuario {
	private static final long serialVersionUID = 1L;

	public Professor() {
		super();

	}

	public Professor(Integer id, String nome, String email, String senha) {
		super(id, nome, email, senha);

	}

}
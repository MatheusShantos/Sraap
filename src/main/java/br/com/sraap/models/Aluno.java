package br.com.sraap.models;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

@Entity
@JsonTypeName("aluno")
public class Aluno extends Usuario {
	private static final long serialVersionUID = 1L;

	private String perfil;

	public Aluno() {
	}

	public Aluno(Integer id, String nome, String email, String senha) {
		super(id, nome, email, senha);

	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}

package br.com.sraap.models;

import javax.persistence.Entity;

@Entity
public class Aluno extends Usuario {
	private static final long serialVersionUID = 1L;

	private Perfil perfil;

	public Aluno() {
	}

	public Aluno(Integer id, String nomeCompleto, String email, String senha) {
		super(id, nomeCompleto, email, senha);
		// TODO Auto-generated constructor stub
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}

package br.com.sraap.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public final class Professor extends Usuario {
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	private List<Turma> turmas;
	
	@OneToMany
	private List<Atividade> atividades;
	
	public Professor() {
		super();

	}

	public Professor(Integer id, String nomeCompleto, String email, String senha) {
		super(id, nomeCompleto, email, senha);
		// TODO Auto-generated constructor stub
	}
}

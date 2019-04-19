package br.com.sraap.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Aluno extends Usuario {
	private static final long serialVersionUID = 1L;

	private String perfil;

	@OneToMany
	private List<Turma> turmas;
	
//	@OneToMany
//	private List<Atividade> recomendacoesAtividades;

	public Aluno() {
	}

	public Aluno(Integer id, String nomeCompleto, String email, String senha) {
		super(id, nomeCompleto, email, senha);
		// TODO Auto-generated constructor stub
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

}

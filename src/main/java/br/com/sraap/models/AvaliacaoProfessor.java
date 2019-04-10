package br.com.sraap.models;

import java.util.Date;

public class AvaliacaoProfessor extends Avaliacao {
	private static final long serialVersionUID = 1L;

	public AvaliacaoProfessor() {
		super();

	}

	public AvaliacaoProfessor(Integer id, Aluno alunoId, int nota, Date data, String comentario) {
		super(id, alunoId, nota, data, comentario);

	}

}

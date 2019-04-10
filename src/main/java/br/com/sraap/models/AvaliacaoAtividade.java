package br.com.sraap.models;

import java.util.Date;

public class AvaliacaoAtividade extends Avaliacao {
	private static final long serialVersionUID = 1L;

	public AvaliacaoAtividade() {
		super();

	}

	public AvaliacaoAtividade(Integer id, Aluno alunoId, int nota, Date data, String comentario) {
		super(id, alunoId, nota, data, comentario);

	}

}

package br.com.sraap.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class AvaliacaoAtividade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Aluno alunoId;
	private int nota;
	private Date data;
	private String comentario;

	public AvaliacaoAtividade() {

	}

	public AvaliacaoAtividade(Integer id, Aluno alunoId, int nota, Date data, String comentario) {
		super();
		this.id = id;
		this.alunoId = alunoId;
		this.nota = nota;
		this.data = data;
		this.comentario = comentario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Aluno getAlunoId() {
		return alunoId;
	}

	public void setAlunoId(Aluno alunoId) {
		this.alunoId = alunoId;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

}

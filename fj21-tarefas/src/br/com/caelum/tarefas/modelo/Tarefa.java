package br.com.caelum.tarefas.modelo;

import java.util.Calendar;

import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Tarefa {
	private Long id;
	
	@Size(min=5)//ben Validation
	private String descricao;
	private boolean finalizado;
	@DateTimeFormat(pattern="dd/MM/yyyy") //Necessario pq o Spring nao reconhece do nosso padrao
	private Calendar dataFinalizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}

}

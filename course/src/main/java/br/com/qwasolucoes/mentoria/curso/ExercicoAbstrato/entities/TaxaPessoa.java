package br.com.qwasolucoes.mentoria.curso.ExercicoAbstrato.entities;

public abstract class TaxaPessoa {

	private String nome;
	private Double rendaAnual;

	public TaxaPessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	public abstract Double tax();

	}


package br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoEnumeracoesComposicao.etities;

public class Produto {

	private String nmProd;
	private Double preco;
	
	public Produto() {
		
	}

	public Produto(String nmProd, Double preco) {
		this.nmProd = nmProd;
		this.preco = preco;
	}

	public String getNmProd() {
		return nmProd;
	}

	public void setNmProd(String nmProd) {
		this.nmProd = nmProd;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}

package br.com.qwasolucoes.mentoria.curso.ExercicoAbstrato.entities;

public class Individual extends TaxaPessoa {

	private Double despesaSaude;

	public Individual(String nome, Double rendaAnual, Double despesaSaude) {
		super(nome, rendaAnual);
		this.despesaSaude = despesaSaude;
	}

	public Double getRendaAnual() {
		return despesaSaude;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.despesaSaude = rendaAnual;
	}

	@Override
	public Double tax() {
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - despesaSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - despesaSaude * 0.5;
		}
	}
}
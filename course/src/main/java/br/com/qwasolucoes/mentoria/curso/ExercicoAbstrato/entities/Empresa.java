package br.com.qwasolucoes.mentoria.curso.ExercicoAbstrato.entities;

public class Empresa extends TaxaPessoa {

	private Integer numerosEmpregados;

	public Empresa(String nome, Double rendaAnual, Integer numerosEmpregados) {
		super(nome, rendaAnual);
		this.numerosEmpregados = numerosEmpregados;
	}

	public Integer getNumerosEmpregados() {
		return numerosEmpregados;
	}

	public void setNumerosEmpregados(Integer numerosEmpregados) {
		this.numerosEmpregados = numerosEmpregados;
	}

	@Override
	public Double tax() {
		if (numerosEmpregados > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}
}

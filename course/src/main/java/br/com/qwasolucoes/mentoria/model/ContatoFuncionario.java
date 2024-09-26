package br.com.qwasolucoes.mentoria.model;

public class ContatoFuncionario {

	/**
	 * 0 - telefone 1 - celular 2 - email
	 */
	private int tipo;

	private String valor;
	private String telefone;

	public int getTipo() {
		return tipo;
	}

	public String getValor() {
		return valor;
	}

	public ContatoFuncionario(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "ContatoFuncionario" + "telefone='" + telefone + '\'';
	}
}

package br.com.qwasolucoes.mentoria.modelagem_dados;

import java.time.LocalDate;
import java.util.List;

public class Escolaridade {

	private String cpf;
	private String codigo;
	private boolean concluido;
	private LocalDate dataTermino;
	private String semestreAtual;

	public Escolaridade(String cpf, String codigo, boolean concluido, LocalDate dataTermino, String semestreAtual) {
		this.codigo = codigo;
		this.cpf = cpf;
		this.concluido = concluido;
		this.dataTermino = dataTermino;
		this.semestreAtual = semestreAtual;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public boolean isConcluido() {
		return concluido;
	}

	public void setConcluido(boolean concluido) {
		this.concluido = concluido;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getSemestreAtual() {
		return semestreAtual;
	}

	public void setSemestreAtual(String semestreAtual) {
		this.semestreAtual = semestreAtual;
	}

	@Override
	public String toString() {
		return "Escolaridade{" + "cpf='" + cpf + '\'' + ", codigo=" + codigo + ", concluido=" + concluido
				+ ", dataTermino=" + dataTermino + ", semestreAtual='" + semestreAtual + '\'' + '}';
	}
}

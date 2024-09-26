package br.com.qwasolucoes.mentoria.modelagem_dados;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table( name = "profissao")
public class Profissao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codigo;
	
	private String nome;
	private String areaDeAtuacao;
	private BigDecimal salarioBase;

	public Profissao(String codigo, String nome, String areaDeAtuacao, BigDecimal salarioBase) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.areaDeAtuacao = areaDeAtuacao;
		this.salarioBase = salarioBase;
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

	public BigDecimal getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(BigDecimal salarioBase) {
		this.salarioBase = salarioBase;
	}
	@Override
	public String toString() {
		return "Profissao [codigo=" + codigo + ", nome=" + nome + ", areaDeAtuacao=" + areaDeAtuacao + ", salarioBase="
				+ salarioBase + "]";
	}

}

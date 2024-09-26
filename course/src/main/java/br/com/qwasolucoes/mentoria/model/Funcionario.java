package br.com.qwasolucoes.mentoria.model;

import java.math.BigDecimal;
import java.util.Date;

public class Funcionario {
	
	private String nome;
	
	private String sobrenome;
	
	private Date dataNascimento;
	
	private Integer idade;
	
	private String sexo;
	
	private String profissao;
	
	private String cpfCnpj;
	
	private String escolaridade;
	
	private BigDecimal salario;
	
	private boolean maiorIdade;
	
	private BigDecimal taxa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public boolean isMaiorIdade() {
		return maiorIdade;
	}

	public void setMaiorIdade(boolean maiorIdade) {
		this.maiorIdade = maiorIdade;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}

	public BigDecimal getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(BigDecimal salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	private BigDecimal salarioLiquido;
	
	public Funcionario(String nome, String sobrenome, Date dataNascimento, Integer idade, String sexo, String profissao, String escolaridade, String cpfCnpj, BigDecimal salario, boolean maiorIdade, BigDecimal taxa, BigDecimal salarioLiquido) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
        this.cpfCnpj = cpfCnpj;
        this.escolaridade = escolaridade;
        this.salario = salario;
        this.maiorIdade = maiorIdade;
        this.taxa = taxa;
        this.salarioLiquido = salarioLiquido;
    }

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		  return "Funcionario{" +
                "cpfCnpj='" + cpfCnpj + '\'' +
                '}';
	}
	
}
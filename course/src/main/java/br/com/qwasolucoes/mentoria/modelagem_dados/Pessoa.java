package br.com.qwasolucoes.mentoria.modelagem_dados;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")
public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String dataNascimento;
	private String sexo;
	private String cpf;
	private String estadoCivil;
	@OneToOne
	@JoinColumn(name = "conjuge_id")
	private String conjuge;
	
	private Empresa empresa;
	
	@OneToMany(mappedBy = "cpf")
	private List<Endereco> enderecos;
	@OneToMany(mappedBy = "cpf")
	private List<Contato> contatos;
	@OneToMany(mappedBy = "cpf")
	private List<Escolaridade> formacoes;
	private List<Profissao> profissao;
	@OneToMany(mappedBy = "")
	private List<InstituicaoEnsino> instituicao;

	public List<InstituicaoEnsino> getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(List<InstituicaoEnsino> instituicao) {
		this.instituicao = instituicao;
	}

	public Pessoa(String nome, String sobrenome, String dataNascimento, String sexo, String cpf, String estadoCivil,
			String conjuge, Empresa empresa, List<Endereco> enderecos, List<Contato> contatos,
			List<Escolaridade> formacoes, List<Profissao> profissao) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
		this.conjuge = conjuge;
		this.empresa = empresa;
		this.enderecos = enderecos;
		this.contatos = contatos;
		this.formacoes = formacoes;
		this.profissao = profissao;
	}


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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public List<Escolaridade> getFormacoes() {
		return formacoes;
	}

	public void setFormacoes(List<Escolaridade> formacoes) {
		this.formacoes = formacoes;
	}

	public List<Profissao> getProfissao() {
		return profissao;
	}

	public void setProfissao(List<Profissao> profissao) {
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "Pessoa{" + "nome='" + nome + '\'' + ", sobrenome='" + sobrenome + '\'' + ", dataNascimento='"
				+ dataNascimento + '\'' + ", sexo='" + sexo + '\'' + ", cpf='" + cpf + '\'' + ", estadoCivil='"
				+ estadoCivil + '\'' + ", conjuge=" + conjuge + ", empresa=" + empresa + ", enderecos=" + enderecos
				+ ", contatos=" + contatos + ", formacoes=" + formacoes + ", profissoes=" + profissao + '}';
	}
}

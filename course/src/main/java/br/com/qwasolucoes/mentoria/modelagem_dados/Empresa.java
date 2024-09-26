package br.com.qwasolucoes.mentoria.modelagem_dados;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table (name = "empresa")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	@OneToOne
	@JoinColumn(name = "cpf_id")
	private String cpf;
	
	@OneToMany(mappedBy = "nome")
	private List<Profissao> profissoes;


	public Empresa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Profissao> getProfissoes() {
		return profissoes;
	}

	public void setProfissoes(List<Profissao> profissoes) {
		this.profissoes = profissoes != null ? profissoes : new ArrayList<>();
	}

	public void addProfissao(Profissao profissao) {
		if (profissao != null) {
			profissoes.add(profissao);
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", cpf=" + cpf + ", profissoes=" + profissoes + "]";
	}

}

package br.com.qwasolucoes.mentoria.modelagem_dados;

import java.util.List;

import javax.persistence.OneToMany;

public class InstituicaoEnsino {
    private String codigo;
    private String nomeInstituicao;
    private String areaDeAtuacao;
    private String quantidadeSemestres;
    @OneToMany(mappedBy = "nome")
    private List<Escolaridade> formacoes;

    public InstituicaoEnsino(String codigo, String nome, String areaDeAtuacao, String quantidadeSemestres, List<Escolaridade> formacoes) {
        this.codigo = codigo;
        this.nomeInstituicao = nome;
        this.areaDeAtuacao = areaDeAtuacao;
        this.quantidadeSemestres = quantidadeSemestres;
        this.formacoes = formacoes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nomeInstituicao;
    }

    public void setNome(String nome) {
        this.nomeInstituicao = nome;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
    }

    public String getQuantidadeSemestres() {
        return quantidadeSemestres;
    }

    public void setQuantidadeSemestres(String quantidadeSemestres) {
        this.quantidadeSemestres = quantidadeSemestres;
    }

    public List<Escolaridade> getFormacoes() {
        return formacoes;
    }

    public void setFormacoes(List<Escolaridade> formacoes) {
        this.formacoes = formacoes;
    }

    @Override
    public String toString() {
        return "InstituicaoEnsino{" +
               "codigo=" + codigo +
               ", nome='" + nomeInstituicao + '\'' +
               ", areaDeAtuacao='" + areaDeAtuacao + '\'' +
               ", quantidadeSemestres=" + quantidadeSemestres +
               ", formacoes=" + formacoes +
               '}';
    }
}

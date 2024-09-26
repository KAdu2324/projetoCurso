package br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.services;

public interface PagamentoOnline {
	
	double taxaPagamento(double quantia);
	double juros(double quantia, int meses);
	

}

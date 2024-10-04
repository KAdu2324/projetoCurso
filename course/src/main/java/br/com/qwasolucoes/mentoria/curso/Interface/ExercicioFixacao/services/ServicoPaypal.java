package br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.services;

public class ServicoPaypal implements PagamentoOnline{

	@Override
	public double taxaPagamento(double quantia) {
		// TODO Auto-generated method stub
		return quantia * 0.02;
	}

	@Override
	public double juros(double quantia, int meses) {
		// TODO Auto-generated method stub
		return quantia * 0.01 * meses;
	}

	
}

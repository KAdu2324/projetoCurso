package br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.services;

import java.time.LocalDate;

import br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.entities.Contrato;
import br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.entities.Parcela;

public class ServicoContratado {
	
	private PagamentoOnline pagamentoOnline;

	public ServicoContratado(PagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}
	
	public void contratoProcesso(Contrato contrato, int meses) {
		
	for (int i=1; i< meses; i++) {
		double basicQuota = contrato.getTotalValor() / meses;
		
		LocalDate dataVencimento = contrato.getData().plusMonths(i);
		
		double  juros = pagamentoOnline.juros(basicQuota, i);
		double taxa = pagamentoOnline.taxaPagamento(basicQuota + juros);
		double cota = basicQuota + juros + taxa;
		
		contrato.getParcela().add(new Parcela(dataVencimento, cota));
	}
		
	}
}

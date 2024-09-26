package br.com.qwasolucoes.mentoria.implementacoes.algoritmos;

public class RecursaoProvider {

	public int recursao(int valor, int limite) {

		if (valor >= limite) {
			return limite;
		}
		System.out.print(valor + " ");
		return recursao(valor + 1, limite);

	}

	public int recursaoSoma(int valor, int limite) {

		if (valor > limite) {
			return 0;
		}
		return valor + recursaoSoma(valor + 1, limite);
	}

	public int recursaoFibonacci(int valor, int limite) {

		int posicaoUm = 0;
		int posicaoDois = 1;
		int posicaoTres = 0;

		for (int i = 2; i <= valor; i++) {
			posicaoTres = posicaoUm + posicaoDois;
			posicaoUm = posicaoDois;
			posicaoDois = posicaoTres;
		}

		return posicaoDois;
	}

	public int iterativoFibonacci(int valor, int limite) {

		if (valor == 0 || valor == 1) {
			return valor;
		}
		return iterativoFibonacci(valor - 1, valor) + iterativoFibonacci(valor - 2, limite);
	}
}

package br.com.qwasolucoes.mentoria.implementacoes.algoritmos;

import java.util.List;

public class Cenario {

	public static <T> void main(String[] args) {
		arvoreBinaria();
//		fila();
//		pilha();
//		listaEncadeada();
//		particaoPositivosNegativos();
//		bubbleSort();
//		quicksort();
//		mergesort();
//		ordenar();
//		recursao();
//		recursaoSoma();
//		recursaoFibonaccirecursaoFibonacciRecursiva();
//		recursaoFibonacciInterativa();
	}

	public static <T> void arvoreBinaria() {
		ArvoreBinariaProvide arvore = new ArvoreBinariaProvide();

		arvore.inserir(50);
		arvore.inserir(30);
		arvore.inserir(20);
		arvore.inserir(40);
		arvore.inserir(70);
		arvore.inserir(60);
		arvore.inserir(80);

		int[] elementosOrdenados = arvore.todosOrdenado();
		elementosOrdenados.toString();
		int primeiro = arvore.primeiro();
		int ultimo = arvore.ultimo();
		return;
	}



	public static <T> void fila() {
		
		FilaProvider<String> fila = new FilaProvider<>();

        fila.adicionar("Teste 1");
        fila.adicionar("Teste 2");
        fila.adicionar("Teste 3");

        List<String> todosElementos = fila.todos();
        todosElementos.toString();
        fila.remover();
        fila.todos().toString();
        
        return;
        
        
	}

	public static <T> void pilha() {
		PilhaProvider<String> pilha = new PilhaProvider<>();

		pilha.empilhar("Teste 1");
		pilha.empilhar("Teste 2");
		pilha.empilhar("Teste 3");

		List<String> todosElementos = pilha.obterTodos();
		String retiradoDaPilha = pilha.desempilhar();
		todosElementos = pilha.obterTodos();
		todosElementos.toString();
		retiradoDaPilha.toString();
		return;
	}

	public static <T> void listaEncadeada() {
		ListaEncadeadaProvider<String> lista = new ListaEncadeadaProvider<>();
		lista.adicionar("Primeiro");
		lista.adicionar("Segundo");
		lista.adicionar("Terceiro");
		lista.remover();

		return;

	}

	public static int[] particaoPositivosNegativos() {
		OrdenacaoProvider ordenacao = new OrdenacaoProvider();
		int[] valores = { 2, -1, -3, 4, -5, 6, -7, 8, -9 };
		int[] resultado = ordenacao.particaoPositivosNegativos(valores);
		return ordenacao.particaoPositivosNegativos(resultado);
	}

	public static int[] bubbleSort() {

		OrdenacaoProvider ordenacao = new OrdenacaoProvider();
		int[] valores = { 60, 25, 50, 45, 30, 20, 10 };

		return ordenacao.bubbleSort(valores);
	}

	public static int[] mergesort() {
		OrdenacaoProvider ordenacao = new OrdenacaoProvider();
		int[] valores = { 10, 9, 5, 6, 4, 8, 3, 1, 7, 2 };
		return ordenacao.mergesort(valores);
	}

	public static int[] quicksort() {
		OrdenacaoProvider ordenacao = new OrdenacaoProvider();
		int[] valores = { 11, 6, 4, 7, 8, 10, 2, 5, 7, 1 };
		return ordenacao.ordenarQuicksort(valores);

	}

	public static int[] ordenar() {

		OrdenacaoProvider ordenacao = new OrdenacaoProvider();
		int[] valores = { 3, 6, 8, 7, 2, 4, 1, 5 };
		return ordenacao.ordenar(valores);
	}

	public static int recursao() {
		RecursaoProvider recursaoProvider = new RecursaoProvider();
		int limite = 10;
		return recursaoProvider.recursao(0, limite);
	}

	public static int recursaoSoma() {
		RecursaoProvider recursaoProvider = new RecursaoProvider();
		int valor = 1;
		int limite = 10;
		int resultado = recursaoProvider.recursaoSoma(valor, limite);
		return recursaoProvider.recursaoSoma(valor, limite);
	}

	public static int recursaoFibonaccirecursaoFibonacciRecursiva() {

		RecursaoProvider recursaoProvider = new RecursaoProvider();
		int valor = 0;
		int limite = 18;
		return recursaoProvider.recursaoFibonacci(valor, limite);
	}

	public static int recursaoFibonacciInterativa() {

		RecursaoProvider recursaoProvider = new RecursaoProvider();
		int IniciaValor = 0;
		int limiteValor = 15;
		return recursaoProvider.iterativoFibonacci(IniciaValor, limiteValor);

	}

}
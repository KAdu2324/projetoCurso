package br.com.qwasolucoes.mentoria.implementacoes.algoritmos;

import java.util.ArrayList;
import java.util.List;

import br.com.qwasolucoes.mentoria.interfaces.algoritmos.ArvoreBinaria;

public class ArvoreBinariaBuscarProvider implements ArvoreBinaria {

	    private class ArvoreNode {
	        int valor;
	        ArvoreNode esquerdo, direito;

	        ArvoreNode(int valor) {
	            this.valor = valor;
	            esquerdo = direito = null;
	        }
	    }

	    private ArvoreNode raiz;

	    @Override
	    public void adicionar(int elemento) {
	        raiz = adicionarRecursivo(raiz, elemento);
	    }

	    private ArvoreNode adicionarRecursivo(ArvoreNode atual, int valor) {
	        if (atual == null) {
	            return new ArvoreNode(valor);
	        }

	        if (valor < atual.valor) {
	            atual.esquerdo = adicionarRecursivo(atual.esquerdo, valor);
	        } else if (valor > atual.valor) {
	            atual.direito = adicionarRecursivo(atual.direito, valor);
	        }

	        return atual;
	    }

	    @Override
	    public int[] todosOrdenado() {
	        List<Integer> lista = new ArrayList<>();
	        emOrdem(raiz, lista);
	        return lista.stream().mapToInt(i -> i).toArray();
	    }

	    private void emOrdem(ArvoreNode no, List<Integer> lista) {
	        if (no != null) {
	            emOrdem(no.esquerdo, lista);
	            lista.add(no.valor);
	            emOrdem(no.direito, lista);
	        }
	    }

	    @Override
	    public int primeiro() {
	        if (raiz == null) {
	            throw new IllegalStateException("A árvore está vazia");
	        }
	        return encontrarMenor(raiz).valor;
	    }

	    private ArvoreNode encontrarMenor(ArvoreNode no) {
	        return no.esquerdo == null ? no : encontrarMenor(no.esquerdo);
	    }

	    @Override
	    public int ultimo() {
	        if (raiz == null) {
	            throw new IllegalStateException("A árvore está vazia");
	        }
	        return encontrarMaior(raiz).valor;
	    }

	    private ArvoreNode encontrarMaior(ArvoreNode no) {
	        return no.direito == null ? no : encontrarMaior(no.direito);
	    }
	}
package br.com.qwasolucoes.mentoria.implementacoes.algoritmos;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import br.com.qwasolucoes.mentoria.interfaces.algoritmos.Fila;

public class FilaProvider<T> implements Fila<T> {
	private LinkedList<T> lista = new LinkedList<>();

	@Override
	public void remover() {

		if (lista.isEmpty()) {
			throw new NoSuchElementException("A fila está vazia.");
		}
		lista.removeFirst();
	}

	@Override
	public void adicionar(T elemento) {
		lista.addLast(elemento);

	}

	@Override
	public List<T> todos() {
		return new LinkedList<>(lista);
	}

	@Override
	public T obter(int indice) {
		if (indice < 0 || indice >= lista.size()) {
			throw new IndexOutOfBoundsException("Índice fora dos limites da fila.");
		}
		return lista.get(indice);
	}
}

package br.com.qwasolucoes.mentoria.implementacoes.algoritmos;

import java.util.ArrayList;
import java.util.List;

import br.com.qwasolucoes.mentoria.interfaces.algoritmos.ListaEncadeada;

public class ListaEncadeadaProvider<T> implements ListaEncadeada<T> {
	private Node<T> comeco;

	public ListaEncadeadaProvider() {
		this.comeco = null;
	}

	@Override
	public void remover() {
		if (comeco != null) {
			comeco = comeco.next;
		}
	}

	@Override
	public void adicionar(T elemento) {
		Node<T> newNode = new Node<>(elemento);
		if (comeco == null) {
			comeco = newNode;
		} else {
			Node<T> current = comeco;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	@Override
	public List<T> todos() {
		List<T> elementos = new ArrayList<>();
		Node<T> current = comeco;
		while (current != null) {
			elementos.add(current.data);
			current = current.next;
		}
		return elementos;
	}

	@Override
	public T obter(int indice) {
		Node<T> current = comeco;
		int count = 0;
		while (current != null) {
			if (count == indice) {
				return current.data;
			}
			count++;
			current = current.next;
		}
		throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
	}
}

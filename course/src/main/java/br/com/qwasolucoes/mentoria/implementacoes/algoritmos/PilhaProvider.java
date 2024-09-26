package br.com.qwasolucoes.mentoria.implementacoes.algoritmos;

import java.util.ArrayList;
import java.util.List;

import br.com.qwasolucoes.mentoria.interfaces.algoritmos.Pilha;

public class PilhaProvider<T> implements Pilha<T> {
    private List<T> elementos = new ArrayList<>();

    @Override
    public void empilhar(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public T desempilhar() {
        if (elementos.isEmpty()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return elementos.remove(elementos.size() - 1);
    }

    @Override
    public List<T> obterTodos() {
        return new ArrayList<>(elementos);
    }
}

package br.com.qwasolucoes.mentoria.curso.MapExemplos.ultil;

import java.util.function.Function;

import br.com.qwasolucoes.mentoria.curso.MapExemplos.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		// TODO Auto-generated method stub
		return p.getName().toUpperCase();	}

}

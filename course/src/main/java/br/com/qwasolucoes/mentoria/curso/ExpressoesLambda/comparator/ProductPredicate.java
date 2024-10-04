package br.com.qwasolucoes.mentoria.curso.ExpressoesLambda.comparator;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		// TODO Auto-generated method stub
		return p.getPrice() >= 100.0;
	}
	
}

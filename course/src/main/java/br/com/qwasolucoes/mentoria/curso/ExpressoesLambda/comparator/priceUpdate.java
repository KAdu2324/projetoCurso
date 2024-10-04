package br.com.qwasolucoes.mentoria.curso.ExpressoesLambda.comparator;

import java.util.function.Consumer;

public class priceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice()* 1.1);
	}

}

package br.com.qwasolucoes.mentoria.curso.Consumer.ultil;

import java.util.function.Consumer;

import br.com.qwasolucoes.mentoria.curso.Consumer.entities.Product;

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
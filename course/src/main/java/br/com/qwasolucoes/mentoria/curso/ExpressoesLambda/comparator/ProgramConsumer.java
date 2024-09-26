package br.com.qwasolucoes.mentoria.curso.ExpressoesLambda.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramConsumer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));
		
		list.forEach(new priceUpdate());
		
		list.forEach(System.out :: println);
	}

}

package br.com.qwasolucoes.mentoria.curso.ExpressoesLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.qwasolucoes.mentoria.curso.ExpressoesLambda.comparator.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 400.0));

		//4 - Predicate<Product> pred = p -> p.getPrice() >= 100.00;	
		
		double min = 100.00;
		list.removeIf(p -> p.getPrice() >= min);
		
		//4- list.removeIf(pred);
		//3- list.removeIf(Product :: naoStaticProductPredicate);
		//2 -list.removeIf(p -> p.getPrice() >= 100);
		//1 -list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}

	}
}

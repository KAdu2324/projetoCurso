package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

import br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.entites.Product;

public class ExercicioUmProduct {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter product data");
	System.out.println("Name: ");
	String name = sc.nextLine();
	System.out.print("Price: ");
	Double price = sc.nextDouble();
	

	Product product = new Product(name, price);
	
	product.setName("Computer");
	System.out.println("Updated name: " + product.getName());
	product.setPrice(1200.00);
	System.out.println("Updated price: " + product.getPrice());
	
	// product.toString()
	
	System.out.println();
	System.out.println("Product data: " + product);
	
	

	System.out.println();
	System.out.println("Enter the numer of products to be added in stock: ");
	int quantity = sc.nextInt();
	product.addProducts(quantity);

	System.out.println();
	System.out.println("Update data: " + product);

	System.out.println();
	System.out.println("Enter the numer of products to be removed in stock: ");
	quantity = sc.nextInt();
	product.removeProducts(quantity);

	System.out.println();
	System.out.println("Update data: " + product);

	sc.close();

	}

}

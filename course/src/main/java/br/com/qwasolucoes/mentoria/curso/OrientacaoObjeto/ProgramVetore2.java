package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.entites.ProductVetor;

public class ProgramVetore2 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ProductVetor[] vect = new ProductVetor[n];
		
		for ( int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVetor(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
		

	}

}

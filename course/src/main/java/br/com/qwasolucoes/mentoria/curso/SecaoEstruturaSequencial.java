package br.com.qwasolucoes.mentoria.curso;

import java.util.Locale;

public class SecaoEstruturaSequencial {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println(y);
		System.out.println("Bom dia!");
		System.out.println("RESULTADOS = "+ x + "METROS");
		System.out.printf("RESULTADOS = %.2f metros%n", x);
		
		double x1 = 10.35784;
		String nome = "Maria ";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}

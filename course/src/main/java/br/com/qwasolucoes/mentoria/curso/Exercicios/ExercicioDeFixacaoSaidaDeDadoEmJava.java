package br.com.qwasolucoes.mentoria.curso.Exercicios;

import java.util.Locale;

public class ExercicioDeFixacaoSaidaDeDadoEmJava {

	public static void main(String[] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de Trabalho";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double medir = 53.234567;
		
		System.out.println("Produtos:");
		System.out.println(produto1 +", cujo preço é R$" + price1);
		System.out.println(produto2 +", cujo preço é R$" + price2);
		System.out.println("");
		System.out.println("Registro:");
		System.out.println(idade +" anos,"+"codigo: " + codigo + " genero: " + genero);
		System.out.println("");
		System.out.printf("Medida com oito casas decimais " + "%.8f%n", + medir);
		System.out.printf("\r\n"
				+ "(três casas decimais): " + "%.3f%n", + medir);
		Locale.setDefault(Locale.US);
		System.out.printf("Com vírgula decimal: " + "%.2f%n", + medir);

	}

}

package br.com.qwasolucoes.mentoria.curso;

import java.util.Scanner;

public class EstruturasRepetitivas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7:
			dia = "Sabado";
		default:
			dia = "Valor invalido";
		}
		System.out.println("Dia da semana: " + dia);

		sc.close();

	}

	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * double preco = 34.5; double desconto = (preco < 20.0) ? preco * 0.1 : preco *
	 * 0.05;
	 * 
	 * System.out.println(desconto);
	 * 
	 * sc.close();
	 * 
	 * // Calcular valor terreno Locale.setDefault(Locale.US); Scanner sc = new
	 * Scanner(System.in);
	 * 
	 * double largura = sc.nextDouble(); double comprimento = sc.nextDouble();
	 * double metroQuadrado = sc.nextDouble();
	 * 
	 * double area = largura * comprimento; double preco = area * metroQuadrado;
	 * 
	 * System.out.printf("AREA = %.2f%n",area);System.out.printf("PRECO = %.2f%n"
	 * ,preco);
	 * 
	 * sc.close();
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * int x = sc.nextInt();
	 * 
	 * while(x!=0) { x = sc.nextInt(); }
	 * 
	 * sc.close();
	 */
}

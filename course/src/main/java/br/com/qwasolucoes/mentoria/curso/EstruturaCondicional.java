package br.com.qwasolucoes.mentoria.curso;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Risco Alto ");
		} else {
			if (hora < 18) {
				System.out.println("Boa tarde");

			} else {
				System.out.println("Boa noite");
			}

		}

		sc.close();

	}

}

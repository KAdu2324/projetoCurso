package br.com.qwasolucoes.mentoria.curso;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int mask = 0b100000;

		if ((n & mask) != 0) {
			System.err.println("6th bit is true!");
		} else {
			System.err.println("6th bit is false!");
		}
		sc.close();

	}

}

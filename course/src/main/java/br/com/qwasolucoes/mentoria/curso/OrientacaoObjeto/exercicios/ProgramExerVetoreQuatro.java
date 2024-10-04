package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExerVetoreQuatro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, numerosPares;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		
		
		numerosPares = 0;
		System.out.print("\nNumeros pares:  ");
		
		
		for (int i=0; i<n; i++) {
			if(vect[i] % 2 == 0) {
				System.out.printf("%d ", vect[i]);
				numerosPares++;
			}		
		}	
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", numerosPares);
		sc.close();

	}

}

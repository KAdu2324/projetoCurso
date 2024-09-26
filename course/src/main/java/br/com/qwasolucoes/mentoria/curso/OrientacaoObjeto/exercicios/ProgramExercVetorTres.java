package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExercVetorTres {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n , nmmenores;
		
		double alturaTotal, alturaMedia, percentualMenores;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nome = new String[n];
	    int[] idade = new int[n];
	    double[] altura = new double[n];
	    
	    
		 for (int i=0; i<n; i++) {
		    	System.out.printf("Dados da %da pessoa:\n", i + 1);
		    	System.out.print("Nome: ");
		        nome[i] = sc.next();
		        System.out.print("Idade: ");
		        idade[i] = sc.nextInt();
		        System.out.print("Altura: ");
		        altura[i] = sc.nextDouble();
		    }

			nmmenores = 0;
			alturaTotal = 0;
			
		    for (int i=0; i<n; i++) {
		        if (idade[i] < 16) {
		        	nmmenores++;
		        }
		        alturaTotal = alturaTotal + altura[i];
		    }

		    alturaMedia = alturaTotal / n;
		    percentualMenores = ((double)nmmenores / n) * 100.0;

		    System.out.printf("\nAltura media = %.2f\n", alturaMedia);
		    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

		    for(int i=0; i<n; i++) {
		        if (idade[i] < 16) {
		        	System.out.printf("%s\n", nome[i]);
		        }
		    }
		sc.close();	
	}

}

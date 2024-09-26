package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

import br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.entites.Student;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student sdt = new Student();
		System.out.println("Name: ");
		sdt.name = sc.nextLine();
		System.out.println("Grade:  ");
		sdt.grade1 = sc.nextDouble();
		System.out.println("Grade:  ");
		sdt.grade2 = sc.nextDouble();
		System.out.println("Grade:  ");
		sdt.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", sdt.finalGrade());
		
		if (sdt.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", sdt.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		
	}

}

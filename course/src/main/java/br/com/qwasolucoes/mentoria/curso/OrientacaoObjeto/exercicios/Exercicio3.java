package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.exercicios;

import java.util.Locale;
import java.util.Scanner;

import br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.entites.Funcionario;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		System.out.println("Name: ");
		func.name = sc.nextLine();
		System.out.println("Grossy salary: ");
		func.grossSalary = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Employee: " + func);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		func.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + func);
		sc.close();
		
		
		sc.close();

	}

}

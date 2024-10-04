package br.com.qwasolucoes.mentoria.curso.ExercicoAbstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.qwasolucoes.mentoria.curso.ExercicoAbstrato.entities.Empresa;
import br.com.qwasolucoes.mentoria.curso.ExercicoAbstrato.entities.Individual;
import br.com.qwasolucoes.mentoria.curso.ExercicoAbstrato.entities.TaxaPessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxaPessoa> list = new ArrayList<>();

		System.out.print("Insira o número de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Taxa pessoa #" + i + " dados:");
			System.out.print("Individual ou empresa (i/e)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Rendimento anual: ");
			double rendaAnual = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Despesas com saúde: ");
				double despesaSaude = sc.nextDouble();
				list.add(new Individual(nome, rendaAnual, despesaSaude));
			} else {
				System.out.print("Número de empregados: ");
				int numerosEmpregados = sc.nextInt();
				list.add(new Empresa(nome, rendaAnual, numerosEmpregados));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS: ");
		for (TaxaPessoa t : list) {
			Double tax = t.tax();
			System.out.println(t.getNome() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println("TOTAL TAXAS: $ " + String.format("%.2f", sum));

		sc.close();
	}

}

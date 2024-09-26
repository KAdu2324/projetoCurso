package br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoAbstrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoAbstrato.entities.ImportProduct;
import br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoAbstrato.entities.Product;
import br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoAbstrato.entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Entre com o numeros de contrato: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Produto # " + i + " data: ");
			System.out.print("Comun, Usado, Importado (c/u/i)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			if (type == 'c') {
				list.add(new Product(name, price));
			} else if (type == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY)");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			} else {
				System.out.print("Taxa de importção: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRECO:");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();
	}

}

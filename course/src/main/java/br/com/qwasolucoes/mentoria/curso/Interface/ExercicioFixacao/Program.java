package br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.entities.Contrato;
import br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.entities.Parcela;
import br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.services.ServicoContratado;
import br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.services.ServicoPaypal;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados contrato:");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor Contrato: ");
		double totalValor = sc.nextDouble();
		
		Contrato obj = new Contrato(numero, data, totalValor);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ServicoContratado servicoContratado = new ServicoContratado(new ServicoPaypal());
		 
		servicoContratado.contratoProcesso(obj, n);
		
		System.out.println("Parcelas: ");
		
		for (Parcela parcela : obj.getParcela()) {
			System.out.println(parcela);
		}
		
		sc.close();
		
		
		
	}

}

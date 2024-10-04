package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

import br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.entites.Account;

public class ContaExercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response  == 'y') {
			System.out.println("Enter desoit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder,initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account number");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
;		
		sc.close();
		
	}

}

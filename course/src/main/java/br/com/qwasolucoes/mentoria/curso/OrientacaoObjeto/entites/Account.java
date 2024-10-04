package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.entites;

public class Account {
	
	private int conta;
	private String cliente;
	private double saldo;
	private String holder;
	
	
	public Account(int number, String holder, double initialDeposit) {
		this.conta = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(int number, String holder) {
		this.conta = number;
		this.holder = holder;	
	}

	

	public int getNumber() {
		return conta;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return saldo;
	}
	public void deposit(double amount) {
		saldo += amount;
	}
	public void withdraw(double amount) {
		saldo -= amount + 5.0;
	}
	public String toString() {
		return "Account "
				+conta
				+", Holder: "
				+ holder 
				+ ", Balance: $"
				+ String.format("%.2f", saldo);
	}

}

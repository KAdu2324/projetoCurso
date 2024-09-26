package br.com.qwasolucoes.mentoria.curso.Heranca.entities;

public class Account {
	
	private Integer numero;
	private String holder;
	protected Double balance;
	
	public Account(){
		
	}

	public Account(Integer numero, String holder, Double balance) {
		this.numero = numero;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	public void saque(double quantia) {
		balance -= quantia + 5.0;
		
	}
	public void deposito(double quantia) {
		balance += quantia;
	}
	
}

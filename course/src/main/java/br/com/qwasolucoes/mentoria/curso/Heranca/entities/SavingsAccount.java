package br.com.qwasolucoes.mentoria.curso.Heranca.entities;

public class SavingsAccount extends Account {
	
	private Double  interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer numero, String holder, Double balance, Double interestRate) {
		super(numero, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
		
	}
	@Override
	public void saque(double quantia) {
		balance -= quantia;
	}

}

package br.com.qwasolucoes.mentoria.curso.ClasseAbstratas;

public class BussinessAccount extends Account {
	
	private Double limiteEmprestimo;
	
	public BussinessAccount() {
		super();
	}

	public BussinessAccount(Integer numero, String holder, Double balance, Double limiteEmprestimo) {
		super(numero, holder, balance);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	public void emprestimo(double quantia) {
		if(quantia <= limiteEmprestimo) {
		balance += quantia - 10.0;
	}
  }
	@Override
	public void saque(double quantia) {
		super.saque(quantia);
		balance -= 2.0;
		}
}

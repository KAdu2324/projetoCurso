/*
 * package br.com.qwasolucoes.mentoria.curso.Heranca;
 * 
 * import entities.Account; import entities.BussinessAccount; import
 * entities.SavingsAccount;
 * 
 * public class Program {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * Account acc = new Account(1001, "Alex", 0.0); BussinessAccount bacc = new
 * BussinessAccount(1002, "maria", 0.0, 500.0);
 * 
 * ///Upcatsing
 * 
 * Account acc1 = bacc; Account acc2 = new BussinessAccount(1003, "Bob", 0.0,
 * 200.00); Account acc3 = new SavingsAccount(1004, "Barbie", 0.0, 0.01);
 * 
 * // downcasting
 * 
 * BussinessAccount acc4 = (BussinessAccount)acc2; acc4.emprestimo(100.0);
 * 
 * //BussinessAccount acc5 = (BussinessAccount)acc3; if(acc3 instanceof
 * BussinessAccount) { BussinessAccount acc5 = (BussinessAccount)acc3;
 * acc5.emprestimo(200.00); System.out.println("Emprestimo!"); } if( acc3
 * instanceof SavingsAccount) { SavingsAccount acc5 = ( SavingsAccount)acc3;
 * acc5.updateBalance(); System.out.println("Atualizado!!"); }
 * 
 * 
 * 
 * Account acc1 = new Account(100, "Alex", 1000.0); acc1.saque(200.0);
 * System.out.println(acc1.getBalance());
 * 
 * Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
 * acc2.saque(200.00); System.out.println(acc2.getBalance());
 * 
 * Account acc3 = new BussinessAccount(1003, "Bob", 1000.00, 500.0);
 * acc3.saque(200.00); System.out.println(acc3.getBalance());
 * 
 * 
 * Account x = new Account (100, "Alex", 1000.0); Account y = new
 * SavingsAccount(1002, "Maria", 1000.00, 0.01);
 * 
 * x.saque(50.0); y.saque(50.0);
 * 
 * System.out.println(x.getBalance()); System.out.println(y.getBalance()); }
 * 
 * }
 */
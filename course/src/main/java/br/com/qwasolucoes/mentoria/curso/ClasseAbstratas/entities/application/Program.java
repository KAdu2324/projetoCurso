/*
 * package
 * br.com.qwasolucoes.mentoria.curso.ClasseAbstratas.entities.application;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import entities.Account; import entities.BussinessAccount; import
 * entities.SavingsAccount;
 * 
 * public class Program {
 * 
 * public static void main(String[] args) {
 * 
 * List<Account> list = new ArrayList<>();
 * 
 * list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01)); list.add(new
 * BussinessAccount(1002, "bobo", 1000.00, 400.00)); list.add(new
 * SavingsAccount(1003, "Joao", 300.00, 0.01)); list.add(new
 * BussinessAccount(1004, "anna", 500.00, 500.0));
 * 
 * double sum = 0.0; for (Account acc : list) { sum += acc.getBalance(); }
 * 
 * System.out.printf("Total balance: %.2f%n", sum);
 * 
 * for (Account acc: list) { acc.deposito(10.0); } for (Account acc: list) {
 * System.out.printf("Update balance for account %d: %.2f%n", acc.getNumero(),
 * acc.getBalance()); }
 * 
 * 
 * Account acc1 = new Account(1001,"Alex", 1000.00); Account acc2 = new
 * SavingsAccount(1001, "Maria", 1000.00, 0.01); Account acc3 = new
 * BussinessAccount(1001, "Bob", 1000.00, 500.0);
 * 
 * 
 * } }
 */
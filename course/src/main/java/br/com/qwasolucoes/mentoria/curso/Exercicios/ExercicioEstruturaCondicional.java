package br.com.qwasolucoes.mentoria.curso.Exercicios;

public class ExercicioEstruturaCondicional {
	
	/*
	 * //exercicio 01
	 * 
	 * Scanner sc = new Scanner (System.in);
	 * 
	 * int numero;
	 * 
	 * System.out.println("Informe um numero?");
	 * 
	 * numero = sc.nextInt();
	 * 
	 * if(numero < 0) { System.out.println("NEGATIVO!!");
	 * 
	 * }else { if(numero == 0) { System.out.println("não negativo");
	 * 
	 * }else { System.out.println("POSITIVO"); }
	 * 
	 * }
	 * 
	 * sc.close();
	 * 
	 * //exercicio 2
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * int N = sc.nextInt();
	 * 
	 * if (N % 2 == 0) { System.out.println("PAR"); } else {
	 * System.out.println("IMPAR"); }
	 * 
	 * sc.close();
	 * 
	 * //exercicio 03
	 * 
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * int A = sc.nextInt(); int B = sc.nextInt();
	 * 
	 * if (A % B == 0 || B % A == 0) { System.out.println("Sao Multiplos"); } else {
	 * System.out.println("Nao sao Multiplos"); }
	 * 
	 * sc.close();
	 * 
	 * //Exercicio 4 Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.println("informe dois horarios?"); int inicioTempo = sc.nextInt();
	 * int fimTempo = sc.nextInt();
	 * 
	 * int duracao;
	 * 
	 * if(inicioTempo < fimTempo) {
	 * 
	 * duracao = fimTempo - inicioTempo; } else { duracao = 24 - inicioTempo +
	 * fimTempo; } System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	 * sc.close();
	 * 
	 * 
	 * //exercicio 05 Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.println("informe codigo do seu pedido?");
	 * 
	 * int codigo = sc.nextInt(); int quantidade = sc.nextInt(); double total;
	 * 
	 * if (codigo == 1) { total = quantidade * 4.0; } else if (codigo == 2) { total
	 * = quantidade * 4.5; } else if (codigo == 3) { total = quantidade * 5.0; }
	 * else if (codigo == 4) { total = quantidade * 2.0; } else { total = quantidade
	 * * 1.5; }
	 * 
	 * System.out.printf("Total: R$ %.2f%n", total);
	 * 
	 * sc.close();
	 * 
	 * 
	 * //Exercicio 6
	 * 
	 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
	 * 
	 * double numero = sc.nextDouble();
	 * 
	 * if (numero < 0.0 || numero > 100.0) {
	 * System.out.println("Fora de intervalo"); } else if (numero <= 25.0) {
	 * System.out.println("Intervalo (25,50]"); } else if (numero <= 50.0) {
	 * System.out.println("Intervalo [0,25]"); } else if (numero <= 75.0) {
	 * System.out.println("Intervalo (75,100]"); } else {
	 * System.out.println("Intervalo (50,75]"); }
	 * 
	 * sc.close();
	 * 
	 * 
	 * 
	 * //Exercicio 7
	 * 
	 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
	 * 
	 * double x = sc.nextDouble(); double y = sc.nextDouble();
	 * 
	 * if (x == 0.0 && y == 0.0) { System.out.println("Origem"); } else if (x ==
	 * 0.0) { System.out.println("Eixo Y"); } else if (y == 0.0) {
	 * System.out.println("Eixo X"); } else if (x > 0.0 && y > 0.0) {
	 * System.out.println("Q1"); } else if (x < 0.0 && y > 0.0) {
	 * System.out.println("Q2"); } else if (x < 0.0 && y < 0.0) {
	 * System.out.println("Q3"); } else { System.out.println("Q4"); }
	 * 
	 * sc.close(); //Exercicio 8
	 * 
	 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.println("informe seu salario:");
	 * 
	 * double salario = sc.nextDouble(); double imposto;
	 * 
	 * if (salario <= 2000.0) { imposto = 0.0; } else if (salario <= 3000.0) {
	 * imposto = (salario - 2000.0) * 0.08; } else if (salario <= 4500.0) { imposto
	 * = (salario - 3000.0) * 0.18 + 1000.0 * 0.08; } else { imposto = (salario -
	 * 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08; }
	 * 
	 * if (imposto == 0.0) { System.out.println("Isento"); } else {
	 * System.out.printf("R$ %.2f%n", imposto); }
	 */
}

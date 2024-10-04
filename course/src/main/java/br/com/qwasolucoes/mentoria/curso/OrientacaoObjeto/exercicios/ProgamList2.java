/*
 * package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto.exercicios;
 * 
 * import java.util.Locale; import java.util.Scanner;
 * 
 * import entitiesExercicio.Aluguel;
 * 
 * public class ProgamList2 {
 * 
 * public static void main(String[] args) {
 * 
 * 
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
 * 
 * Aluguel[] quartos = new Aluguel[10];
 * 
 * System.out.print("Quantos quartos serão alugados? "); int n = sc.nextInt();
 * 
 * for (int i=1; i<=n; i++) { System.out.println();
 * System.out.println("Aluguel #" + i + ":"); System.out.print("Nome: ");
 * sc.nextLine(); String name = sc.nextLine(); System.out.print("Email: ");
 * String email = sc.nextLine(); System.out.print("Quarto: "); int nmQuarto =
 * sc.nextInt(); quartos[nmQuarto] = new Aluguel(name, email); }
 * 
 * System.out.println(); System.out.println("Quartos ocupados:"); for (int i=0;
 * i<10; i++) { if (quartos[i] != null) { System.out.println(i + ": " +
 * quartos[i]); }
 * 
 * 
 * sc.close(); }
 * 
 * } }
 */
/*
 * package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto;
 * 
 * import java.util.ArrayList; import java.util.List; import java.util.Locale;
 * import java.util.Scanner;
 * 
 * import entitiesExercicio.Employee;
 * 
 * 
 * public class Program {
 * 
 * public static void main(String[] args) { Locale.setDefault(Locale.US);
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * List<Employee> list = new ArrayList<>();
 * 
 * System.out.print("Quantos funcionários serão cadastrados? "); int n =
 * sc.nextInt();
 * 
 * for (int i=1; i<=n; i++) { System.out.println();
 * System.out.println("Employees #" + i + ":"); System.out.print("Id: "); int id
 * = sc.nextInt(); while(hasId(list, id)) {
 * System.out.print("id errado. Tente novamente: "); id = sc.nextInt(); }
 * System.out.print("Name: "); sc.nextLine(); String name = sc.nextLine();
 * System.out.print("Salario: "); double salary = sc.nextDouble(); list.add(new
 * Employee(id, name, salary)); } System.out.println();
 * System.out.print("Informe o CPF do funcionário que terá aumento salarial: ");
 * int id = sc.nextInt(); Employee emp = list.stream().filter(x -> x.getId() ==
 * id).findFirst().orElse(null); if (emp == null) {
 * System.out.println("Este ID não existe\r\n" + ""); } else {
 * System.out.print("Enter the percentage: "); double percentage =
 * sc.nextDouble(); emp.increaseSalary(percentage); }
 * 
 * System.out.println(); System.out.println("List of employees:"); for (Employee
 * obj : list) { System.out.println(obj); }
 * 
 * sc.close(); }
 * 
 * 
 * public static boolean hasId(List<Employee> list, int id) { Employee emp =
 * list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); return
 * emp != null;
 * 
 * }
 * 
 * }
 */
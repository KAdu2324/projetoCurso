/*
 * package br.com.qwasolucoes.mentoria.curso.ExercicioFunc1.application;
 * 
 * import java.text.ParseException; import java.text.SimpleDateFormat; import
 * java.util.Date; import java.util.Locale; import java.util.Scanner;
 * 
 * import br.com.qwasolucoes.mentoria.curso.ExercicioFunc1.application.entities.
 * WorkerLevel; import entities.Department; import entities.HourContract; import
 * entities.Worker;
 * 
 * public class Program {
 * 
 * public static void main(String[] args) throws ParseException {
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 * 
 * System.out.print("insira o nome do departamento:  "); String departmentName =
 * sc.nextLine(); System.out.println("Digite os dados do Colaborador:");
 * System.out.print("Nome: "); String workerName = sc.nextLine();
 * System.out.print("Nivel: "); String workerLevel = sc.nextLine();
 * System.out.print("Salario base:  "); double baseSalary = sc.nextDouble();
 * Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),
 * baseSalary, new Department(departmentName));
 * 
 * System.out.print("Informe o numeros de contrato? "); int n = sc.nextInt();
 * 
 * for (int i = 1; i <= n; i++) { System.out.println("Contrato #" + i +
 * " data:"); System.out.print("Date (DD/MM/YYYY): "); Date contractDate =
 * sdf.parse(sc.next()); System.out.print("Valor Por Hora:  "); double
 * valuePerHour = sc.nextDouble(); System.out.print("Duração(horas): "); int
 * hours = sc.nextInt(); HourContract contract = new HourContract(contractDate,
 * valuePerHour, hours); worker.addContract(contract); }
 * 
 * System.out.println();
 * System.out.print("Informe data e ano que deseja cacular(MM/YYYY): "); String
 * monthAndYear = sc.next(); int month =
 * Integer.parseInt(monthAndYear.substring(0, 2)); int year =
 * Integer.parseInt(monthAndYear.substring(3)); System.out.println("Nome: " +
 * worker.getNome()); System.out.println("Departamento: " +
 * worker.getDepartment().getName());
 * System.out.println("Qunato ganhou nesse periodo " + monthAndYear + ": " +
 * String.format("%.2f", worker.income(year, month)));
 * 
 * sc.close();
 * 
 * }
 * 
 * }
 */
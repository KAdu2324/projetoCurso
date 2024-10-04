/*
 * package br.com.qwasolucoes.mentoria.curso.OrientacaoObjeto;
 * 
 * import java.util.ArrayList; import java.util.List; import
 * java.util.stream.Collectors;
 * 
 * public class Program2 {
 * 
 * public static void main(String[] args) { List<String> list = new
 * ArrayList<>();
 * 
 * list.add("Maria"); list.add("Joao"); list.add("bob"); list.add("alex");
 * list.add(2, "ana");
 * 
 * System.out.println(list.size());
 * 
 * for (String x : list) { System.out.println(x); }
 * System.out.println("------------------------"); list.remove(1);
 * list.removeIf(x -> x.charAt(0) == 'm'); for(String x : list) {
 * System.out.println(x); }
 * 
 * System.out.println("-------------------");
 * System.out.println("Index of Bob: " + list.indexOf("joao"));
 * System.out.println("Index of Bob: " + list.indexOf("Maria"));
 * System.out.println("-------------------");
 * 
 * List<String> result = list.stream().filter(x -> x.charAt(0) ==
 * 'a').collect(Collectors.toList()); for (String x : result) {
 * System.out.println(x); } System.out.println("-------------------"); String
 * name = list.stream().filter(x-> x.charAt(0) == 'j').findFirst().orElse(null);
 * System.out.println(name);
 * 
 * }
 * 
 * }
 */
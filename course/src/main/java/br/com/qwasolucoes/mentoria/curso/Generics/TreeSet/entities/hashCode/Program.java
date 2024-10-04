package br.com.qwasolucoes.mentoria.curso.Generics.TreeSet.entities.hashCode;

public class Program {

	public static void main(String[] args) {
		

		Client c1 = new Client ("maria", "MAria@gmail.com");
		Client c2 = new Client ("maria", "MAria@gmail.com");
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);

}

}

package br.com.qwasolucoes.mentoria.curso;

public class FuncoesMatematicas {

	public static void main(String[] args) {

		// Funções Matematicas

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz qaudrada de " + x + " = " + A);
		System.out.println("Raiz qaudrada de " + y + " = " + B);
		System.out.println("Raiz qaudrada de 25 =  " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println("elevado a " + y + " = " + A);
		System.out.println("elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadradi =  " + C);

		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + "=" + A);
		System.out.println("Valor absoluto de " + z + "=" + B);
	}

}

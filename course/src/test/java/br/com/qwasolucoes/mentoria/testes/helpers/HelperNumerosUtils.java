package br.com.qwasolucoes.mentoria.testes.helpers;

import java.util.Arrays;
import java.util.List;

public class HelperNumerosUtils {

	public static List<Integer> gerarNumerosParesOuImpares(int limite, List<Integer> list, int count,
			String parOuImpar) {

		if (count > limite) {
			return list;
		}

		if (count % 2 == 0 && parOuImpar.equals("par")) {
			list.add(count);
			count++;
		}

		if (count % 2 != 0 && parOuImpar.equals("impar")) {
			list.add(count);
			count++;
		}

		count++;
		return gerarNumerosParesOuImpares(limite, list, count, parOuImpar);
	}

	public static int[] arrayDeNumerosPares() {

		int[] paresArray = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46,
				48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98,
				100 };
		return paresArray;
	}
	
	public static int[]  arrayDeNumerosImpares() {
		int[] imparesArray = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49,
				51, 53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81, 83, 85, 87, 89, 91, 93, 95, 97, 99 };
		return imparesArray;
	}
	
	public static List<Integer> numerosPrimos() {
		return Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
				73, 79, 83, 89, 97);
	}
}

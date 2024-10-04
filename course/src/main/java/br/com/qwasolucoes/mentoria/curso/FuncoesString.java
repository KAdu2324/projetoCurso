package br.com.qwasolucoes.mentoria.curso;

public class FuncoesString {

	public static void main(String[] args) {
		//funçoes interessantes para String	
		
				String original = "abcde FGHJE ABC abc DEFG   ";
				String s01 = original.toLowerCase();
				String s02 = original.toUpperCase();
				String s03 = original.trim();
				String s04 = original.substring(2);
				String s05 = original.substring(2,9);
				String s06 = original.replace('a', 'x');
				String s07 = original.replace("abc", "xy");
				int i = original.indexOf("bc");
				int j = original.lastIndexOf("bc");
				
				System.out.println("Original: " + original + "-" );
				System.out.println("toLowerCase: " + s01 + "-");
				System.out.println("toUpperCase: " + s02 + "-");
				System.out.println("trim:  -" + s03 + "-");
				System.out.println("Substring (2) : - " + s04 + "-");
				System.out.println("Substring (2, 9) : - " + s05 + "-");
				System.out.println("Replace ('a', 'x'): - " + s06 + "-");
				System.out.println("index of 'ab','xy') : - " + s07 + "-");
				System.out.println("index of 'bc','bc') : - " + i + "-");
				System.out.println("last index of 'bc','bc') : - " + j + "-");
				
				
				//Operação split

				/*
				 * String s = "Potato apple lemon orange";
				 * 
				 * String[] vect = s.split(" "); String word1 = vect[0]; String word2 = vect[1];
				 * String word3 = vect[2];
				 * 
				 * System.out.println(vect[0]); System.out.println(vect[1]);
				 * System.out.println(vect[2]); System.out.println(vect[3]);
				 */

	}

}

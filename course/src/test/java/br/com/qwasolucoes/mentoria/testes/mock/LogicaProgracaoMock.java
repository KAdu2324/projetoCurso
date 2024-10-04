package br.com.qwasolucoes.mentoria.testes.mock;

import java.util.HashMap;
import java.util.Map;

public class LogicaProgracaoMock {
		
	public static int[][] paresImparesPrimosMock(int[] numeros, int numeroDivisaoResto) {
		int[][] mock =  new int[numeros.length][4];
		
		/**Pares*/
        mock[0][0] = 2;
        mock[1][0] = 4;
        mock[3][0] = 10;
        mock[5][0] = 16;
        
        
        /** Ímpares*/
        mock[2][1] = 7;
        mock[4][1]= 15;
        mock[6][1] = 19;
        
        
        /**Números Primos*/
        mock[0][2] = 2;
        mock[2][2] = 7;
        mock[6][2] = 19;
        
        /** Resto da divisão */
        mock[0][3] = 2 % numeroDivisaoResto;
        mock[1][3] = 4 % numeroDivisaoResto;
        mock[2][3] = 7 % numeroDivisaoResto;
        mock[3][3] = 10 % numeroDivisaoResto;
        mock[4][3] = 15 % numeroDivisaoResto;
        mock[5][3] = 16 % numeroDivisaoResto;
        mock[6][3] = 19 % numeroDivisaoResto;
	
		return mock;
	}
	
	public static String[][] arrayMultidimensionalPorPosicoesMock() {
		
		 String[][] matrizDeStrings = {
				 /**      0     1     2     3     4     5     6     7     8     9  /
				 /** 0*/{"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"},
				 /** 1*/{"10", "11", "12", "13", "14", "15", "16", "17", "18", "19"},
				 /** 2*/{"20", "21", "22", "23", "24", "25", "26", "27", "28", "29"},
				 /** 3*/{"30", "31", "32", "33", "34", "35", "36", "37", "38", "39"},
				 /** 4*/{"40", "41", "42", "43", "44", "45", "46", "47", "48", "49"},
				 /** 5*/{"50", "51", "52", "53", "54", "55", "56", "57", "58", "59"},
				 /** 6*/{"60", "61", "62", "63", "64", "65", "66", "67", "68", "69"},
				 /** 7*/{"70", "71", "72", "73", "74", "75", "76", "77", "78", "79"},
				 /** 8*/{"80", "81", "82", "83", "84", "85", "86", "87", "88", "89"},
				 /** 9*/{"90", "91", "92", "93", "94", "95", "96", "97", "98", "99"}
		        };
		
		return matrizDeStrings;
	}
	
	
	public static Map<String, String[]> arrayMultidimensionalPorValor() {
		Map<String, String[]> mapaComCasosarrayMultidimensionalPorValor = new HashMap<>();
		
		// valor 22
		String[] case1 = new String[4];
		case1[0] ="21";
		case1[1] ="23";
		case1[2] ="12";
		case1[3] ="32";
		
		// valor 44
		String[] case2 = new String[4];
		case2[0] ="43";
		case2[1] ="45";
		case2[2] ="34";
		case2[3] ="54";
		
		// valor 77
		String[] case3 = new String[4];
		case3[0] ="76";
		case3[1] ="78";
		case3[2] ="67";
		case3[3] ="87";
		
		// valor 27
		String[] case4 = new String[4];
		case4[0] ="26";
		case4[1] ="28";
		case4[2] ="17";
		case4[3] ="37";
		
		mapaComCasosarrayMultidimensionalPorValor.put("22", case1);
		mapaComCasosarrayMultidimensionalPorValor.put("44", case2);
		mapaComCasosarrayMultidimensionalPorValor.put("77", case3);
		mapaComCasosarrayMultidimensionalPorValor.put("27", case4);
		
		return mapaComCasosarrayMultidimensionalPorValor;
	}
	
	
	
	public static Map<String, String[]> arrayMultidimensionalPorPosicoes() {
		Map<String, String[]> mapaComCasos = new HashMap<>();
		
		//linha 5 coluna 4
		String[] case4 = new String[4];
		case4[0] ="53";
		case4[1] ="55";
		case4[2] ="44";
		case4[3] ="64";
 		
		
		// linha 3 coluna 6 
		String[] case3 = new String[4];
		case3[0] = "35";
		case3[1] = "37";
		case3[2] = "26";
		case3[3] = "46";
				
		
		//linha 7 coluna 1
		String[] case2 = new String[4];
		case2[0] = "70";
		case2[1] = "72";
		case2[2] = "61";
		case2[3] = "81";
		
		//linha 2 coluna 2
		String[] case1 = new String[4];
		case1[0] = "21";
		case1[1] = "23";
		case1[2] = "12";
		case1[3] = "32";
		
		mapaComCasos.put("22", case1);
		mapaComCasos.put("71", case2);
		mapaComCasos.put("36", case3);
		mapaComCasos.put("54", case4);
		
		
		return mapaComCasos;
	}
	
	public static Map<Integer, String[]> antecessorSucessorPor() {
		
		String[] case1 = {"Pedro", "Carlos"};
		String[] case2 = {"João", "Pedro"};
		String[] case3 = {"Juliana", "Laura"};
		String[] case4 = {"Hisoka", "Lyu"};
		String[] case5 = {"Carlos", "Fernando"};
		String[] case6 = {"Amanda", "Juvenal"};
		
		Map<Integer, String[]> mapaComCasos = new HashMap<>();
		
		mapaComCasos.put(3, case1);
		mapaComCasos.put(1, case2);
		mapaComCasos.put(6, case3);
		mapaComCasos.put(11, case4);
		mapaComCasos.put(5, case5);
		mapaComCasos.put(10, case6);
		
		return mapaComCasos;
	}
	
	
	public static  Map<String, String[]> antecessorSucessorPorValorMock() {
		
	
		String[] case1 = {"João","Pedro"};
		String[] case2 = {"Maria","Ana"};
		String[] case3 = {"Carlos","Fernando"};
		String[] case4 = {"Fernando","Rafael"};
		String[] case5 = {"Rafael","Hisoka"};
		String[] case6 = {"Juvenal","Luiz"};
		
		Map<String, String[]> mapaComCasos = new HashMap<>();
		
		mapaComCasos.put("Maria", case1);
		mapaComCasos.put("Pedro", case2);
		mapaComCasos.put("Juliana", case3);
		mapaComCasos.put("Laura", case4);
		mapaComCasos.put("Amanda", case5);
		mapaComCasos.put("Lyu", case6);
		
		return mapaComCasos;
	}
	
	public static String[] antecessorSucessorPorMock() {
	
		String[] nomes = {
	          /**0*/  "João",
	          /**1*/  "Maria",
	          /**2*/  "Pedro",
	          /**3*/  "Ana",
	          /**4*/  "Carlos",
	          /**5*/  "Juliana",
	          /**6*/  "Fernando",
	          /**7*/  "Laura",
	          /**8*/  "Rafael",
	          /**9*/  "Amanda",
	          /**10*/ "Hisoka",
	          /**11*/ "Juvenal",
	          /**12*/ "Lyu",
	          /**13*/ "Luiz",
	          /**14*/ "Gabriel"
	        };
	
		return nomes;
	}
	
	
}

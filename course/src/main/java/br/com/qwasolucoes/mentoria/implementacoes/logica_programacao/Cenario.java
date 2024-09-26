package br.com.qwasolucoes.mentoria.implementacoes.logica_programacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.qwasolucoes.mentoria.model.Funcionario;

public class Cenario {

	public static void main(String[] args) {
		ex31();
		
		
	}
	public static List<Funcionario> ex31(){
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		
	    List<String> dados = Arrays.asList(
                "RWAN                Souza               15061994MANALISTA DESENVOLVEDOR JUNIOR           51979313805   SUPERIOR COMPLETO                       1566560000",
                "LUCAS               Ferreira            29011975MANALISTA DESENVOLVEDOR SENIOR           71979313805   SUPERIOR COMPLETO                       8800000000",
                "JOAN                Silveira            15011991MANALISTA DESENVOLVEDOR PLENO            67979313805   SUPERIOR COMPLETO                       8800000000"
        );
        
       return logicaProgramacaoProvider.conversaoStringParaPessoa(dados);
        
	}
	
	
	
	
	
	public static Funcionario ex30() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		String[] funcionario = new String[8];
		funcionario[0] = "RWAN";
		funcionario[1] = "Souza";
		funcionario[2] = "15061994";
		funcionario[3] = "M";
		funcionario[4] = "ANALISTA DESENVOLVEDOR JUNIOR";
		funcionario[5] = "51979313805";
		funcionario[6] = "SUPERIOR COMPLETO";
		funcionario[7] = "1566560000";
		
		return logicaProgramacaoProvider.conversaoArrayParaPessoa(funcionario);
	}
	
	
	
	public static List<Funcionario> ex29(){
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		String[][] funcionario = {
	            {"RWAN", "Souza", "29011975", "M", "ANALISTA DESENVOLVEDOR JUNIOR", "51979313805", "SUPERIOR COMPLETO", "1566560000"},
	            {"LUCAS", "Ferreira", "29011975", "M", "ANALISTA DESENVOLVEDOR SENIOR", "71979313805", "SUPERIOR COMPLETO", "8800000000"},
	            {"JOAN", "Silveira", "15011991", "M", "ANALISTA DESENVOLVEDOR PLENO", "67979313805", "SUPERIOR COMPLETO", "8800000000"}
	        };
		
		return logicaProgramacaoProvider.conversaoArrayMultidimensionalParaPessoa(funcionario);
	}
	
	
	public static int[][] ex28(){
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] numeros = { 2, 4, 7, 10, 15, 16, 19 };
		return logicaProgramacaoProvider.arrayMultidimensionalParesImparesPrimosResto(numeros,3);
	}
	
	public static int[] ex27() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		return logicaProgramacaoProvider.primeiraUltimaPosicaoArray(20);
	}
	
	public static   int[][] ex26() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		  int[] numeros = {2, 4, 7, 10, 15, 16, 19};
	        int numeroDivisaoResto = 3;
	        
		return logicaProgramacaoProvider.arrayMultidimensionalParesImparesPrimosResto(numeros, numeroDivisaoResto);
		
	}

	public static List<Integer> ex25() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		List<Integer> numeros = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5);

		List<Integer> resultado = logicaProgramacaoProvider.removerInteirosDuplicados(numeros);
		System.out.println(resultado);
		return resultado;
	}

	public static List<BigDecimal> ex24() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<BigDecimal> entrada = Arrays.asList(new BigDecimal("1.00"), new BigDecimal("1.00"), new BigDecimal("2.00"),
				new BigDecimal("2.00"), new BigDecimal("3.01"), new BigDecimal("3.01"));

		List<BigDecimal> resultado = logicaProgramacaoProvider.removerValoresDuplicados(entrada);
		System.out.println(resultado);
		return resultado;
	}

	public static List<String> ex23() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<String> entrada = Arrays.asList("Luz", "Luz", "Jô", "Jô", "Mentorado", "Smith", "Smith", "aaa", "aaa");

		List<String> resultado = logicaProgramacaoProvider.removerTextosDuplicados(entrada);
		System.out.println(resultado);
		return resultado;

	}

	public static Integer ex22() {
		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		List<Integer> numeroDuplicado = new ArrayList<>();

		numeroDuplicado.add(15);
		numeroDuplicado.add(15);
		numeroDuplicado.add(15);
		numeroDuplicado.add(50);
		numeroDuplicado.add(11);
		numeroDuplicado.add(1);
		numeroDuplicado.add(333);
		numeroDuplicado.add(333);
		numeroDuplicado.add(333);
		numeroDuplicado.add(333);
		numeroDuplicado.add(333);
		numeroDuplicado.add(4);
		numeroDuplicado.add(5);
		numeroDuplicado.add(6);

		return logicaProgramacaoProvider.valorInteiroMaiorQtdDuplicados(numeroDuplicado);
	}

	public static String ex21() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		List<String> textos = Arrays.asList("LLL", "LLL", "TTTTT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT",
				"TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT",
				"TT", "TT", "TT", "TT", "TT", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR",
				"gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg");

		return logicaProgramacaoProvider.valorTextoMaiorQtdDuplicados(textos);
	}

	public static List<Integer> ex20() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<Integer> listaDuplicado = new ArrayList<>();

		listaDuplicado.add(10);
		listaDuplicado.add(5);
		listaDuplicado.add(10);
		listaDuplicado.add(8);
		listaDuplicado.add(6);
		listaDuplicado.add(10);

		List<Integer> resultado = logicaProgramacaoProvider.listaInteirosDuplicados(listaDuplicado);
		System.out.println(resultado);
		return resultado;
	}

	public static List<BigDecimal> ex19() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<BigDecimal> numeroDecimal = new ArrayList<>();

		numeroDecimal.add(new BigDecimal("123456.789123456789"));
		numeroDecimal.add(new BigDecimal("0.0000123456789"));
		numeroDecimal.add(new BigDecimal("9876543210.123456789"));
		numeroDecimal.add(new BigDecimal("3.141592653589793238"));
		numeroDecimal.add(new BigDecimal("0.0000123456789"));
		numeroDecimal.add(new BigDecimal("0.0000123456789"));

		List<BigDecimal> resultado = logicaProgramacaoProvider.listaDecimalDuplicados(numeroDecimal);
		System.out.println(resultado);

		return resultado;
	}

	public static List<String> ex18() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();

		List<String> textos = Arrays.asList("TT", "TT", "RR", "RS", "RS", "RR", "LL", "LL", "RU", "RU");

		List<String> resultado = logicaProgramacaoProvider.listaTextoDuplicados(textos);
		System.out.println(resultado);
		return resultado;

	}

	public static Integer ex17() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 1;
		int resultado = logicaProgramacaoProvider.somarValores(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;

	}

	public static Integer ex16() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 1;
		int resultado = logicaProgramacaoProvider.somarValoresPares(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex15() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 100;
		int resultado = logicaProgramacaoProvider.somarValoresImpares(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex14() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 10;
		int resultado = logicaProgramacaoProvider.somarValoresPrimos(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;

	}

	public static Integer ex13() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] limite = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int resultado = logicaProgramacaoProvider.somarValoresPosicoes(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex12() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] limite = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int resultado = logicaProgramacaoProvider.somarValoresParesPosicoes(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex11() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] limite = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int resultado = logicaProgramacaoProvider.somarValoresImparesPosicoes(limite);
		System.out.println(" Resultado = " + resultado);
		return resultado;
	}

	public static Integer ex10() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int[] limite = { 3, 5, 7, 11, 13};
		int resultado = logicaProgramacaoProvider.somarValoresPrimosPosicoes(limite);
		return resultado;
	}

	public static Integer ex9() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int limite = 10;
		int multiplo = 2;
		int resultado = logicaProgramacaoProvider.somarValoresPosicoesParesMultiplosDe(limite, multiplo);
		System.out.println(resultado);
		return resultado;

	}

	public static boolean ex8() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 7;
		boolean resultado = logicaProgramacaoProvider.multiploDeSete(valor);
		System.out.println(resultado);
		return resultado;

	}

	public static String ex7() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 6;
		String resultado = logicaProgramacaoProvider.parOuImpar(valor);
		System.out.println(resultado);
		return resultado;
	}

	public static String ex6() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 0;
		String resultado = logicaProgramacaoProvider.parOuImparOuZero(valor);
		System.out.println(resultado);
		return resultado;
	}

	public static String ex5() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 0;
		String resultado = logicaProgramacaoProvider.parOuImparOuZero(valor);
		System.out.println(resultado);
		return resultado;
	}

	public static int[] ex4() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 5;
		int[] resultado = logicaProgramacaoProvider.obterDobrosAteDobroInformado(valor);
		return resultado;
	}

	public static int[] ex3() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 15;
		int[] resultado = logicaProgramacaoProvider.obterDobrosAteDez(valor);
		return resultado;

	}

	public static int[] ex2() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 10;
		int[] resultado = logicaProgramacaoProvider.obterDobrosAteMil(valor);
		return resultado;

	}

	public static int[][] ex1() {

		LogicaProgramacaoProvider logicaProgramacaoProvider = new LogicaProgramacaoProvider();
		int valor = 2;

		return logicaProgramacaoProvider.tabuada(valor);
	}
}

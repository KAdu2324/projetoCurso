package br.com.qwasolucoes.mentoria.testes.logica_programacao;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import br.com.qwasolucoes.mentoria.implementacoes.logica_programacao.LogicaProgramacaoProvider;
import br.com.qwasolucoes.mentoria.model.Funcionario;
import br.com.qwasolucoes.mentoria.testes.helpers.HelperNumerosUtils;
import br.com.qwasolucoes.mentoria.testes.mock.FuncionarioMock;
import br.com.qwasolucoes.mentoria.testes.mock.LogicaProgracaoMock;

public class LogicaProgramacaoTest {

	private LogicaProgramacaoProvider logicaProgramacao = new LogicaProgramacaoProvider();

	List<Funcionario> funcionarioMockadoCompare = FuncionarioMock.funcionarios();

	@Test
	public void conversaoStringParaPessoaTest() {

		// Lógica implantada pela pessoa mentorada
		List<Funcionario> funcionarios = this.logicaProgramacao
				.conversaoStringParaPessoa(FuncionarioMock.funcionariosMockString());

		Assert.assertEquals(this.funcionarioMockadoCompare, funcionarios);
	}

	@Test
	public void conversaoPessoaParaStringTest() {

		List<String> conversaoPessoaParaString2 = this.logicaProgramacao
				.conversaoPessoaParaString(funcionarioMockadoCompare);

		List<String> funcionariosMockString = FuncionarioMock.funcionariosMockString();

		Assert.assertEquals(funcionariosMockString, conversaoPessoaParaString2);
	}

	@Test
	public void conversaoArrayParaPessoaTest() {
		Funcionario extraindoFuncionarioDeUmaString = this.logicaProgramacao
				.conversaoArrayParaPessoa(FuncionarioMock.funcionarioMockArray());

		Funcionario funcionarioMockadoParaComparar = FuncionarioMock.funcionarios().get(0);

		Assert.assertEquals(extraindoFuncionarioDeUmaString, funcionarioMockadoParaComparar);
	}

	@Test
	public void conversaoArrayMultidimensionalParaPessoaTest() {

		String[][] funcionarioArrayMulti = FuncionarioMock.funcionarioArrayMulti();
		List<Funcionario> conversaoArrayMultidimensionalParaPessoa = this.logicaProgramacao
				.conversaoArrayMultidimensionalParaPessoa(funcionarioArrayMulti);

		Assert.assertEquals(this.funcionarioMockadoCompare, conversaoArrayMultidimensionalParaPessoa);
	}

	@Test
	public void arrayMultidimensionalParesImparesPrimosResto() {
		int[] numeros = { 2, 4, 7, 10, 15, 16, 19 };

		int[][] paresImparesPrimosMock = LogicaProgracaoMock.paresImparesPrimosMock(numeros, 3);

		int[][] arrayMultidimensionalParesImparesPrimosResto = this.logicaProgramacao
				.arrayMultidimensionalParesImparesPrimosResto(numeros, 3);

		Assert.assertArrayEquals(paresImparesPrimosMock, arrayMultidimensionalParesImparesPrimosResto);
	}

	@Test
	public void arrayMultidimensionalPorPosicoes() {

		String[][] arrayMultidimensionalPorPosicoesMock = LogicaProgracaoMock.arrayMultidimensionalPorPosicoesMock();
		Map<String, String[]> casesPorPosicoes = LogicaProgracaoMock.arrayMultidimensionalPorPosicoes();

		for (Map.Entry<String, String[]> cases : casesPorPosicoes.entrySet()) {

			String[] casosMockado = cases.getValue();
			Integer linha = Integer.parseInt(cases.getKey().substring(0, 1));
			Integer coluna = Integer.parseInt(cases.getKey().substring(1));

			String[] retornoPosicoes = this.logicaProgramacao
					.arrayMultidimensionalPorPosicoes(arrayMultidimensionalPorPosicoesMock, coluna, linha);

			Assert.assertArrayEquals(casosMockado, retornoPosicoes);
		}
	}

	@Test
	public void arrayMultidimensionalPorValor() {

		String[][] mock = LogicaProgracaoMock.arrayMultidimensionalPorPosicoesMock();

		Map<String, String[]> casosParaComparacao = LogicaProgracaoMock.arrayMultidimensionalPorValor();

		for (Map.Entry<String, String[]> casoComparacao : casosParaComparacao.entrySet()) {

			String[] casoASerComparado = this.logicaProgramacao.arrayMultidimensionalPorValor(mock,
					casoComparacao.getKey());

			Assert.assertArrayEquals(casoComparacao.getValue(), casoASerComparado);
		}
	}

	@Test
	public void antecessorSucessorPor() {

		String[] antecessorSucessorPorMock = LogicaProgracaoMock.antecessorSucessorPorMock();

		Map<Integer, String[]> casosParaComparacao = LogicaProgracaoMock.antecessorSucessorPor();

		for (Map.Entry<Integer, String[]> casoComparacao : casosParaComparacao.entrySet()) {

			String[] casoASerComparado = this.logicaProgramacao.antecessorSucessorPor(antecessorSucessorPorMock,
					casoComparacao.getKey());

			Assert.assertArrayEquals(casoComparacao.getValue(), casoASerComparado);
		}
	}

	@Test
	public void antecessorSucessorPorValor() {

		String[] mockParaFazeABusca = LogicaProgracaoMock.antecessorSucessorPorMock();
		Map<String, String[]> cases = LogicaProgracaoMock.antecessorSucessorPorValorMock();

		for (Map.Entry<String, String[]> casoComparacao : cases.entrySet()) {

			String[] casoASerComparado = this.logicaProgramacao.antecessorSucessorPor(mockParaFazeABusca,
					casoComparacao.getKey());

			Assert.assertArrayEquals(casoComparacao.getValue(), casoASerComparado);
		}

	}

	@Test
	public void numerosPares() {
		List<Integer> paresCase = new ArrayList<>();
		int contadorRecursivo;

		/** Case 1 até 20 */
		List<Integer> paresCompare20 = HelperNumerosUtils.gerarNumerosParesOuImpares(20, paresCase,
				contadorRecursivo = 0, "par");
		List<Integer> numerosPares20 = this.logicaProgramacao.numerosPares(20);
		Assert.assertEquals(paresCompare20, numerosPares20);
		paresCase.clear();

		/** Case 2 até 100 */
		List<Integer> paresCompare100 = HelperNumerosUtils.gerarNumerosParesOuImpares(100, paresCase,
				contadorRecursivo = 0, "par");
		List<Integer> numerosPares100 = this.logicaProgramacao.numerosPares(100);
		Assert.assertEquals(paresCompare100, numerosPares100);
		paresCase.clear();

		/** Case 3 até 999 */
		List<Integer> paresCompare999 = HelperNumerosUtils.gerarNumerosParesOuImpares(999, paresCase,
				contadorRecursivo = 0, "par");
		List<Integer> numerosPares999 = this.logicaProgramacao.numerosPares(999);
		Assert.assertEquals(paresCompare999, numerosPares999);
	}

	@Test
	public void numerosImpares() {
		List<Integer> imparesCase = new ArrayList<>();
		int contadorRecursivo;

		/** Case 1 até 20 */
		List<Integer> imparesCompare20 = HelperNumerosUtils.gerarNumerosParesOuImpares(20, imparesCase,
				contadorRecursivo = 0, "impar");
		List<Integer> numerosImpares20 = this.logicaProgramacao.numerosImpares(20);
		Assert.assertEquals(imparesCompare20, numerosImpares20);
		imparesCase.clear();

		/** Case 2 até 100 */
		List<Integer> imparesCompare100 = HelperNumerosUtils.gerarNumerosParesOuImpares(100, imparesCase,
				contadorRecursivo = 0, "impar");
		List<Integer> numerosImpares100 = this.logicaProgramacao.numerosImpares(100);
		Assert.assertEquals(imparesCompare100, numerosImpares100);
		imparesCase.clear();

		/** Case 3 até 999 */
		List<Integer> imparesCompare999 = HelperNumerosUtils.gerarNumerosParesOuImpares(999, imparesCase,
				contadorRecursivo = 0, "impar");
		List<Integer> numerosImpares999 = this.logicaProgramacao.numerosImpares(999);
		Assert.assertEquals(imparesCompare999, numerosImpares999);

	}

	@Test
	public void numerosPrimos() {
		List<Integer> resultado = this.logicaProgramacao.numerosPrimos(100);

		Assert.assertEquals(HelperNumerosUtils.numerosPrimos(), resultado);
	}

	@Test
	public void numerosParesArray() {

		int[] numerosParesArray = this.logicaProgramacao.numerosParesArray(100);

		Assert.assertArrayEquals(HelperNumerosUtils.arrayDeNumerosPares(), numerosParesArray);
	}

	@Test
	public void numerosImparesArray() {
		int[] numerosImparesArray = this.logicaProgramacao.numerosImparesArray(99);
		Assert.assertArrayEquals(HelperNumerosUtils.arrayDeNumerosImpares(), numerosImparesArray);
	}

	@Test
	public void numerosPrimosArray() {

		// Teste com limite 20
		int[] esperado20 = { 2, 3, 5, 7, 11, 13, 17, 19 };
		int[] resultado20 = this.logicaProgramacao.numerosPrimosArray(20);
		Assert.assertArrayEquals(esperado20, resultado20);

		// Teste com limite 20
		int[] esperado100 = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
				89, 97 };
		int[] resultado100 = this.logicaProgramacao.numerosPrimosArray(100);
		Assert.assertArrayEquals(esperado100, resultado100);
	}

	@Test
	public void primeiraUltimaPosicaoArray() {
		int[] esperado = { 0, 19 };
		int[] resultado = this.logicaProgramacao.primeiraUltimaPosicaoArray(20);
		Assert.assertArrayEquals(esperado, resultado);

		int[] esperado99 = { 0, 99 };
		int[] resultado99 = this.logicaProgramacao.primeiraUltimaPosicaoArray(100);
		Assert.assertArrayEquals(esperado99, resultado99);
	}

	@Test
	public void quantidadeParesImparesPrimos() {

		// Casos de teste
		List<Integer> teste1 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
		List<Integer> teste2 = Arrays.asList(1, 4, 6, 8, 9, 10, 12, 14);
		List<Integer> teste3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Resultados esperados
		int[] resultado1 = { 1, 7, 8 };
		int[] resultado2 = { 6, 2, 0 };
		int[] resultado3 = { 5, 5, 4 };

		// Verificação dos resultados
		Assert.assertArrayEquals(resultado1, this.logicaProgramacao.quantidadeParesImparesPrimos(teste1));
		Assert.assertArrayEquals(resultado2, this.logicaProgramacao.quantidadeParesImparesPrimos(teste2));
		Assert.assertArrayEquals(resultado3, this.logicaProgramacao.quantidadeParesImparesPrimos(teste3));
	}

	@Test
	public void primeiraUltimaMediaPosicaoArray() {

		// Teste com limite 5
		int[] resultado2 = this.logicaProgramacao.primeiraUltimaMediaPosicaoArray(5);
		Assert.assertArrayEquals(new int[] { 0, 5, 2 }, resultado2);

		// Teste com limite 10
		int[] resultado3 = this.logicaProgramacao.primeiraUltimaMediaPosicaoArray(10);
		Assert.assertArrayEquals(new int[] { 0, 10, 4 }, resultado3);
	}

	@Test
	public void removerInteirosDuplicados() {

		List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5);
		List<Integer> resultado = this.logicaProgramacao.removerInteirosDuplicados(numeros);
		Assert.assertEquals(Arrays.asList(1, 2, 3, 4, 5), resultado);

		List<Integer> numerosNegativo = Arrays.asList(-1, -2, -2, -3, -4, -4, -4, -5, -5);
		List<Integer> resultado2 = this.logicaProgramacao.removerInteirosDuplicados(numerosNegativo);

		Assert.assertEquals(Arrays.asList(-1, -2, -3, -4, -5), resultado2);

		List<Integer> numeros2 = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5);
		List<Integer> resultado3 = this.logicaProgramacao.removerInteirosDuplicados(numeros2);

		Assert.assertEquals(Arrays.asList(1, 2, 3, 4, 5), resultado3);
	}

	@Test
	public void removerValoresDuplicados() {

		List<BigDecimal> entrada = Arrays.asList(new BigDecimal("1.00"), new BigDecimal("1.00"), new BigDecimal("2.00"),
				new BigDecimal("2.00"), new BigDecimal("3.01"), new BigDecimal("3.01"));

		List<BigDecimal> resultadoEsperado = new ArrayList<>(
				Arrays.asList(new BigDecimal("1.00"), new BigDecimal("2.00"), new BigDecimal("3.01")));

		List<BigDecimal> resultado = this.logicaProgramacao.removerValoresDuplicados(entrada);

		Collections.sort(resultadoEsperado);
		Collections.sort(resultado);
		Assert.assertEquals(resultadoEsperado, resultado);

	}

	@Test
	public void removerTextosDuplicados() {
		List<String> entrada = Arrays.asList("Luz", "Luz", "Jô", "Jô", "Mentorado", "Smith", "Smith", "aaa", "aaa");

		List<String> resultadoEsperado = Arrays.asList("Luz", "Jô", "Mentorado", "Smith", "aaa");

		List<String> resultado = this.logicaProgramacao.removerTextosDuplicados(entrada);

		Collections.sort(resultadoEsperado);
		Collections.sort(resultado);
		Assert.assertEquals(resultadoEsperado, resultado);

	}

	@Test
	public void valorInteiroMaiorQtdDuplicados() {
		List<Integer> numeros = Arrays.asList(1, 99, 1, 1, 1, 2, 2, 9, 3, 1, 4, 5, 55, 55, 55, 55, 55, 55, 55, 55, 55,
				55, 55, 55, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 999, 555, 555, 555, 55,
				555, 555, 99, 99, 1, 2, 3, 9, 99, 99, 99, 99, 99, 99, 55, 55);
		Integer resultadoEsperado = 99;

		Integer resultado = this.logicaProgramacao.valorInteiroMaiorQtdDuplicados(numeros);

		Assert.assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void valorTextoMaiorQtdDuplicados() {
		List<String> textos = Arrays.asList("LLL", "LLL", "TTTTT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT",
				"TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT", "TT",
				"TT", "TT", "TT", "TT", "TT", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR", "RR",
				"gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg", "gg");

		String resultadoEsperado = "TT";

		String resultado = this.logicaProgramacao.valorTextoMaiorQtdDuplicados(textos);

		Assert.assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void listaInteirosDuplicados() {
		List<Integer> numeros = Arrays.asList(1, 99, 1, 1, 1, 2, 2, 9, 3, 1, 4, 5, 55, 55, 55, 55, 55, 55, 55, 55, 55,
				55, 55, 55, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 999, 555, 555, 555, 55,
				555, 555, 99, 99, 1, 2, 3, 9, 99, 99, 99, 99, 99, 99, 55, 55);

		List<Integer> resultado = this.logicaProgramacao.listaInteirosDuplicados(numeros);
		List<Integer> resultadoEsperado = Arrays.asList(1, 55, 9, 99, 555, 2, 3);

		Collections.sort(resultadoEsperado);
		Collections.sort(resultado);

		Assert.assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void listaDecimalDuplicados() {
		List<BigDecimal> numeros = Arrays.asList(BigDecimal.valueOf(3.1), BigDecimal.valueOf(3.1),
				BigDecimal.valueOf(3.1), BigDecimal.valueOf(3.1), BigDecimal.valueOf(3.1), BigDecimal.valueOf(3.1),
				BigDecimal.valueOf(3.1), BigDecimal.valueOf(3.1), BigDecimal.valueOf(3.1), BigDecimal.valueOf(2.1),
				BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.1),
				BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.1),
				BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.1), BigDecimal.valueOf(2.2),
				BigDecimal.valueOf(2.2), BigDecimal.valueOf(2.2));

		List<BigDecimal> resultado = this.logicaProgramacao.listaDecimalDuplicados(numeros);

		List<BigDecimal> resultadoEsperado = Arrays.asList(BigDecimal.valueOf(3.1), BigDecimal.valueOf(2.1),
				BigDecimal.valueOf(2.2));

		Collections.sort(resultadoEsperado);
		Collections.sort(resultado);
		Assert.assertEquals(resultadoEsperado, resultado);

	}

	@Test
	public void listaTextoDuplicados() {
		List<String> textos = Arrays.asList("TT", "TT", "RR", "RS", "RS", "RR", "LL", "LL", "RU", "RU");

		List<String> resultado = this.logicaProgramacao.listaTextoDuplicados(textos);

		List<String> resultadoEsperado = Arrays.asList("TT", "RR", "RS", "LL", "RU");

		Collections.sort(resultadoEsperado);
		Collections.sort(resultado);
		Assert.assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void somarValores() {
		Integer somarValores = this.logicaProgramacao.somarValores(100);
		Integer compare = 5050;

		assertEquals(compare, somarValores);
	}

	@Test
	public void somarValoresPares() {
		Integer somarValoresPares = this.logicaProgramacao.somarValoresPares(100);
		Integer compare = 2550;

		assertEquals(compare, somarValoresPares);
	}

	@Test
	public void somarValoresImpares() {
		Integer somarValoresImpares = this.logicaProgramacao.somarValoresImpares(100);
		Integer compare = 2500;

		assertEquals(compare, somarValoresImpares);
	}

	@Test
	public void somarValoresPrimos() {

		int resultado = this.logicaProgramacao.somarValoresPrimos(10);
		int compare = 17;
		assertEquals(compare, resultado);
	}

	@Test
	public void somarValoresPosicoes() {
		int[] valores = { 1, 2, 3, 4, -5 };
		int somaEsperada = 5;

		int resultado = this.logicaProgramacao.somarValoresPosicoes(valores);

		assertEquals(somaEsperada, resultado);
	}

	@Test
	public void somarValoresParesPosicoes() {
		int[] valores = { 2, 4, 6, 8, 10 };
		int somaEsperada = 30;

		int resultado = this.logicaProgramacao.somarValoresParesPosicoes(valores);

		assertEquals(somaEsperada, resultado);
	}

	@Test
	public void somarValoresImparesPosicoes() {
		int[] valores = { 3, 5, 7, 9, 11 };
		int somaEsperada = 35;

		int resultado = this.logicaProgramacao.somarValoresImparesPosicoes(valores);

		assertEquals(somaEsperada, resultado);
	}

	@Test
	public void somarValoresPrimosPosicoes() {
		int[] valores = { 3, 5, 7, 11, 13 };
		int somaEsperada = 39;

		int resultado = this.logicaProgramacao.somarValoresPrimosPosicoes(valores);

		assertEquals(somaEsperada, resultado);
	}

	@Test
	public void somarValoresPosicoesParesMultiplosDe() {
		int limite = 10;
		int multiplo = 2;
		int esperado = 60;
		int resultadoEsperado = this.logicaProgramacao.somarValoresPosicoesParesMultiplosDe(limite, multiplo);

		assertEquals(esperado, resultadoEsperado);
	}

	@Test
	public void multiploDeSete() {

		boolean vinteOito = this.logicaProgramacao.multiploDeSete(28);
		boolean sete = this.logicaProgramacao.multiploDeSete(7);
		boolean oito = this.logicaProgramacao.multiploDeSete(8);

		assertEquals(true, vinteOito);
		assertEquals(true, sete);
		assertEquals(false, oito);
	}

	@Test
	public void parOuImpar() {

		String par = this.logicaProgramacao.parOuImparOuZero(28);
		String impar = this.logicaProgramacao.parOuImparOuZero(7);
		String zero = this.logicaProgramacao.parOuImparOuZero(0);

		par.toUpperCase();
		impar.toUpperCase();
		zero.toUpperCase();

		assertEquals("PAR", par);
		assertEquals("IMPAR", impar);
		assertEquals("ZERO", zero);
	}

	@Test
	public void obterDobrosAteDobroInformado() {
		int[] resultado = this.logicaProgramacao.obterDobrosAteDobroInformado(5);
		int[] resultado2 = this.logicaProgramacao.obterDobrosAteDobroInformado(-7);

		Assert.assertArrayEquals(new int[] { 10, 12, 14, 16, 18, 20 }, resultado);
		Assert.assertArrayEquals(new int[] { -14, -16, -18, -20, -22, -24, -26, -28 }, resultado2);
	}

	@Test
	public void obterDobrosAteDez() {
		int[] resultado = this.logicaProgramacao.obterDobrosAteDez(8);

		int[] resultado2 = this.logicaProgramacao.obterDobrosAteDez(15);
		int[] esperado = new int[0];
		Assert.assertArrayEquals(new int[] { 16, 18, 20 }, resultado);
		Assert.assertArrayEquals(esperado, resultado2);
	}

	@Test
	public void obterDobrosAteMil() {

		int[] resultado = this.logicaProgramacao.obterDobrosAteMil(10);
		Assert.assertArrayEquals(new int[] { 20, 40, 80, 160, 320, 640, 1280 }, resultado);
	}

	@Test
	public void tabuada() {
		int[][] resultado = this.logicaProgramacao.tabuada(2);
		int[][] resultado2 = this.logicaProgramacao.tabuada(5);
		int[][] esperado = { { 1, 1, 1 }, { 1, 2, 2 }, { 1, 3, 3 }, { 1, 4, 4 }, { 1, 5, 5 }, { 1, 6, 6 }, { 1, 7, 7 },
				{ 1, 8, 8 }, { 1, 9, 9 }, { 1, 10, 10 }, { 2, 1, 2 }, { 2, 2, 4 }, { 2, 3, 6 }, { 2, 4, 8 },
				{ 2, 5, 10 }, { 2, 6, 12 }, { 2, 7, 14 }, { 2, 8, 16 }, { 2, 9, 18 }, { 2, 10, 20 } };

		int[][] esperado2 = { { 1, 1, 1 }, { 1, 2, 2 }, { 1, 3, 3 }, { 1, 4, 4 }, { 1, 5, 5 }, { 1, 6, 6 }, { 1, 7, 7 },
				{ 1, 8, 8 }, { 1, 9, 9 }, { 1, 10, 10 }, { 2, 1, 2 }, { 2, 2, 4 }, { 2, 3, 6 }, { 2, 4, 8 },
				{ 2, 5, 10 }, { 2, 6, 12 }, { 2, 7, 14 }, { 2, 8, 16 }, { 2, 9, 18 }, { 2, 10, 20 }, { 3, 1, 3 },
				{ 3, 2, 6 }, { 3, 3, 9 }, { 3, 4, 12 }, { 3, 5, 15 }, { 3, 6, 18 }, { 3, 7, 21 }, { 3, 8, 24 },
				{ 3, 9, 27 }, { 3, 10, 30 }, { 4, 1, 4 }, { 4, 2, 8 }, { 4, 3, 12 }, { 4, 4, 16 }, { 4, 5, 20 },
				{ 4, 6, 24 }, { 4, 7, 28 }, { 4, 8, 32 }, { 4, 9, 36 }, { 4, 10, 40 }, { 5, 1, 5 }, { 5, 2, 10 },
				{ 5, 3, 15 }, { 5, 4, 20 }, { 5, 5, 25 }, { 5, 6, 30 }, { 5, 7, 35 }, { 5, 8, 40 }, { 5, 9, 45 },
				{ 5, 10, 50 } };
		Assert.assertArrayEquals(esperado, resultado);
		Assert.assertArrayEquals(esperado2, resultado2);
	}
}

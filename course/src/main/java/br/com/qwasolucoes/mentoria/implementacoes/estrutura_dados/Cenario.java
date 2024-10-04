package br.com.qwasolucoes.mentoria.implementacoes.estrutura_dados;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import br.com.qwasolucoes.mentoria.model.ContatoFuncionario;
import br.com.qwasolucoes.mentoria.model.Funcionario;

public class Cenario {

	public static void main(String[] args) {
//		LIST
//		nomes();
//		sobrenomes();
//		maiores18();
//		menores18();
//		pessoaMaisVelha();
//		pessoaMaisNova();
//		maiorSalario();
//		menorTaxa();
//		nomePrimeiraPessoa();
//		nomeUltimaPessoa();
//		maiorNome();
//		maiorNomeCompleto();
//		quantidadePessoasSexoMasculino();
//		maioresSalariosPeloValor();
//		LIST

//		MAP
//		nomeFrequencia();
//		mapaFrequenciaValores();
//		mapaFrequenciaValoresLista();
//		nomeTelefone();
//		cpfCnpjTelefonesObjeto();
//		chavesMapa();
//		valoresMapa();
//		nomeTelefones();
//		maiorNumeroEntreValores();
//		chaveMaiorNumeroEntreValores();
//		MAP

//		SET
//		nomesUnicosOrdenados();
//		valoresPositivosNegativos();
//		valoresDuplicadosOrdenados();
//		valoresDiferentesOrdenados();
//		valoresDuplicadosDaPrimeiraListaOrdenados();
//		valoresDiferentesDaSegundaListaOrdenados();
//		pessoasUnicasOrdenados();
//		pessoasDuplicadosOrdenados();
//		pessoasDiferentesOrdenados();
//		pessoasDuplicadosDaPrimeiraListaOrdenados();
//		pessoasDiferentesDaSegundaListaOrdenados();
//		SET
	}
////////////////////////LIST////////////////////////////////////

	public static List<String> nomes() {
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();
		Funcionario f1 = new Funcionario();
		f1.setNome("João");
		Funcionario f2 = new Funcionario();
		f2.setNome("Zé");
		Funcionario f3 = new Funcionario();
		f3.setNome("Jurandir ");
		Funcionario f4 = new Funcionario();
		f4.setNome("Arnaldo");

		List<Funcionario> pessoas = List.of(f1, f2, f3, f4);
		List<String> nomes = estruturaDadosList.nomes(pessoas);
		System.out.println("nomes:  " + nomes);
		return estruturaDadosList.sobrenomes(pessoas);

	}

	public static List<String> sobrenomes() {
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();
		Funcionario f1 = new Funcionario();
		f1.setNome("João Junior");
		f1.setSobrenome("Junior");

		Funcionario f2 = new Funcionario();
		f2.setNome("Ze Ramalho");
		f2.setSobrenome("Ramalho");

		Funcionario f3 = new Funcionario();
		f3.setNome("Jurandir Silva");
		f3.setSobrenome("Silva");

		Funcionario f4 = new Funcionario();
		f4.setNome("Arnaldo Escobar");
		f4.setSobrenome("Escobar");

		List<Funcionario> pessoas = List.of(f1, f2, f3, f4);
		List<String> sobreNome = estruturaDadosList.sobrenomes(pessoas);
		System.out.println("Sobrenomes:  " + sobreNome);
		return estruturaDadosList.sobrenomes(pessoas);

	}

	public static List<Integer> maiores18() {
		SimpleDateFormat dataConvertida = new SimpleDateFormat("dd/MM/yyyy");
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();
		try {
			Funcionario f1 = new Funcionario();
			f1.setNome("João junior");
			f1.setDataNascimento(dataConvertida.parse("15/05/2000"));

			Funcionario f2 = new Funcionario();
			f2.setNome("Ze Ramalho");
			f2.setDataNascimento(dataConvertida.parse("25/08/2009"));

			Funcionario f3 = new Funcionario();
			f3.setNome("Jurandir Silva ");
			f3.setDataNascimento(dataConvertida.parse("10/12/2008"));

			Funcionario f4 = new Funcionario();
			f4.setNome("Arnaldo escobar");
			f4.setDataNascimento(dataConvertida.parse("05/03/1999"));

			List<Funcionario> pessoas = List.of(f1, f2, f3, f4);
			List<Integer> maiores = estruturaDadosList.maiores18(pessoas);
			System.out.println("Maiores 18 " + maiores);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static List<Integer> menores18() {
		SimpleDateFormat dataConvertida = new SimpleDateFormat("dd/MM/yyyy");
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();
		try {
			Funcionario f1 = new Funcionario();
			f1.setNome("João junior");
			f1.setDataNascimento(dataConvertida.parse("15/05/2000"));

			Funcionario f2 = new Funcionario();
			f2.setNome("Ze Ramalho");
			f2.setDataNascimento(dataConvertida.parse("25/08/2009"));

			Funcionario f3 = new Funcionario();
			f3.setNome("Jurandir Silva ");
			f3.setDataNascimento(dataConvertida.parse("10/12/2008"));

			Funcionario f4 = new Funcionario();
			f4.setNome("Arnaldo escobar");
			f4.setDataNascimento(dataConvertida.parse("05/03/1999"));

			List<Funcionario> pessoas = List.of(f1, f2, f3, f4);
			List<Integer> menores = estruturaDadosList.menores18(pessoas);
			System.out.println("Menores 18 " + menores);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static Integer pessoaMaisVelha() {
		SimpleDateFormat dataConvertida = new SimpleDateFormat("dd/MM/yyyy");
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();
		try {
			Funcionario f1 = new Funcionario();
			f1.setDataNascimento(dataConvertida.parse("15/05/2000"));

			Funcionario f2 = new Funcionario();
			f2.setDataNascimento(dataConvertida.parse("25/08/2005"));

			Funcionario f3 = new Funcionario();
			f3.setDataNascimento(dataConvertida.parse("10/12/2008"));

			Funcionario f4 = new Funcionario();
			f4.setDataNascimento(dataConvertida.parse("05/03/1999"));

			List<Funcionario> pessoas = List.of(f1, f2, f3, f4);
			Integer idadeMaisVelha = estruturaDadosList.pessoaMaisVelha(pessoas);
			System.out.println("Idade mais velha: " + idadeMaisVelha);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 1;
	}

	public static Integer pessoaMaisNova() {

		SimpleDateFormat dataConvertida = new SimpleDateFormat("dd/MM/yyyy");
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();
		try {
			Funcionario f1 = new Funcionario();
			f1.setDataNascimento(dataConvertida.parse("15/05/2000"));

			Funcionario f2 = new Funcionario();
			f2.setDataNascimento(dataConvertida.parse("25/08/1999"));

			Funcionario f3 = new Funcionario();
			f3.setDataNascimento(dataConvertida.parse("10/12/2005"));

			Funcionario f4 = new Funcionario();
			f4.setDataNascimento(dataConvertida.parse("01/01/2008"));

			List<Funcionario> pessoas = List.of(f1, f2, f3, f4);
			Integer idadeMaisNova = estruturaDadosList.pessoaMaisNova(pessoas);
			System.out.println("Idade mais nova: " + idadeMaisNova);

		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 1;

	}

	public static BigDecimal maiorSalario() {
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();
		Funcionario f1 = new Funcionario();
		f1.setSalario(new BigDecimal("150000"));

		Funcionario f2 = new Funcionario();
		f2.setSalario(new BigDecimal("20000"));

		Funcionario f3 = new Funcionario();
		f3.setSalario(new BigDecimal("5000"));

		Funcionario f4 = new Funcionario();
		f4.setSalario(new BigDecimal("99999999"));

		List<Funcionario> pessoas = List.of(f1, f2, f3, f4);

		BigDecimal maiorSalario = estruturaDadosList.maiorSalario(pessoas);

		System.out.println("O maior Salario é: " + maiorSalario);
		return estruturaDadosList.maiorSalario(pessoas);
	}

	public static BigDecimal menorTaxa() {

		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();
		Funcionario f1 = new Funcionario();
		f1.setNome("Ana");
		f1.setTaxa(new BigDecimal("0.05"));

		Funcionario f2 = new Funcionario();
		f2.setNome("Bruno");
		f2.setTaxa(new BigDecimal("0.07"));

		Funcionario f3 = new Funcionario();
		f3.setNome("Carlos");
		f3.setTaxa(new BigDecimal("0.03"));

		Funcionario f4 = new Funcionario();
		f4.setNome("Beatriz");
		f4.setTaxa(new BigDecimal("0.06"));

		List<Funcionario> pessoas = List.of(f1, f2, f3, f4);

		BigDecimal menorTaxa = estruturaDadosList.menorTaxa(pessoas);

		System.out.println("A menor taxa é: " + menorTaxa);
		return estruturaDadosList.menorTaxa(pessoas);
	}

	public static String nomePrimeiraPessoa() {
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();

		Funcionario f1 = new Funcionario();
		f1.setNome("Ana Maria da Silva");
		Funcionario f2 = new Funcionario();
		f2.setNome("Bruno");
		Funcionario f3 = new Funcionario();
		f3.setNome("Carlos Eduardo Oliveira");
		Funcionario f4 = new Funcionario();
		f4.setNome("Beatriz");
		Funcionario f5 = new Funcionario();
		f5.setNome("Mauricio");
		Funcionario f6 = new Funcionario();
		f6.setNome("Beatriz");
		List<Funcionario> pessoas = List.of(f1, f2, f3, f4, f5, f6);

		String nomeUltimaPessoa = estruturaDadosList.nomePrimeiraPessoa(pessoas);

		System.out.println("O nome da última pessoa é: " + nomeUltimaPessoa);
		return estruturaDadosList.nomePrimeiraPessoa(pessoas);
	}

	public static String nomeUltimaPessoa() {

		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();

		Funcionario f1 = new Funcionario();
		f1.setNome("Ana Maria da Silva");
		Funcionario f2 = new Funcionario();
		f2.setNome("Bruno");
		Funcionario f3 = new Funcionario();
		f3.setNome("Carlos Eduardo Oliveira");
		Funcionario f4 = new Funcionario();
		f4.setNome("Beatriz");
		Funcionario f5 = new Funcionario();
		f5.setNome("Mauricio");
		Funcionario f6 = new Funcionario();
		f6.setNome("Beatriz");
		List<Funcionario> pessoas = List.of(f1, f2, f3, f4, f5, f6);

		String nomeUltimaPessoa = estruturaDadosList.nomeUltimaPessoa(pessoas);

		System.out.println("O nome da última pessoa é: " + nomeUltimaPessoa);
		return estruturaDadosList.nomeUltimaPessoa(pessoas);

	}

	public static String maiorNome() {
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();

		Funcionario f1 = new Funcionario();
		f1.setNome("Ana Maria da Silva");

		Funcionario f2 = new Funcionario();
		f2.setNome("Bruno");

		Funcionario f3 = new Funcionario();
		f3.setNome("Carlos Eduardo Oliveira");

		Funcionario f4 = new Funcionario();
		f4.setNome("Beatriz");

		List<Funcionario> pessoas = List.of(f1, f2, f3, f4);
		String maiorNome = estruturaDadosList.maiorNome(pessoas);
		System.out.println("O maior nome é: " + maiorNome);
		return estruturaDadosList.maiorNome(pessoas);
	}

	public static String maiorNomeCompleto() {
		EstruturaDadosListProvider estruturaDadosList = new EstruturaDadosListProvider();

		Funcionario f1 = new Funcionario();
		f1.setNome("Ana Maria da Silva");

		Funcionario f2 = new Funcionario();
		f2.setNome("Brunooooooooooooooooooooooooooooooo");

		Funcionario f3 = new Funcionario();
		f3.setNome("Carlos Eduardo Oliveira");

		Funcionario f4 = new Funcionario();
		f4.setNome("Beatriz");

		List<Funcionario> pessoas = List.of(f1, f2, f3, f4);

		String maiorNome = estruturaDadosList.maiorNomeCompleto(pessoas);

		System.out.println("O maior nome completo é: " + maiorNome);
		return estruturaDadosList.maiorNomeCompleto(pessoas);
	}

	public static Integer quantidadePessoasSexoMasculino() {
		EstruturaDadosListProvider estruturaDadosListProvider = new EstruturaDadosListProvider();
		Funcionario f1 = new Funcionario();
		f1.setNome("Ana");
		f1.setSexo("Feminino");

		Funcionario f2 = new Funcionario();
		f2.setNome("Bruno");
		f2.setSexo("Masculino");

		Funcionario f3 = new Funcionario();
		f3.setNome("Carlos");
		f3.setSexo("Masculino");

		Funcionario f4 = new Funcionario();
		f4.setNome("Beatriz");
		f4.setSexo("Feminino");

		List<Funcionario> pessoas = List.of(f1, f2, f3, f4);

		Integer quantidadeMasculino = estruturaDadosListProvider.quantidadePessoasSexoMasculino(pessoas);
		System.out.println("Quantidade de pessoas do sexo masculino: " + quantidadeMasculino);
		return estruturaDadosListProvider.quantidadePessoasSexoMasculino(pessoas);
	}

	public static List<BigDecimal> maioresSalariosPeloValor() {
		EstruturaDadosListProvider estruturaDadosListProvider = new EstruturaDadosListProvider();
		Funcionario f1 = new Funcionario();
		f1.setNome("Ana");
		f1.setSalario(new BigDecimal("3000"));

		Funcionario f2 = new Funcionario();
		f2.setNome("Bruno");
		f2.setSalario(new BigDecimal("5000"));

		Funcionario f3 = new Funcionario();
		f3.setNome("Carlos");
		f3.setSalario(new BigDecimal("4500"));

		Funcionario f4 = new Funcionario();
		f4.setNome("Beatriz");
		f4.setSalario(new BigDecimal("6000"));
		List<Funcionario> pessoas = Arrays.asList(f1, f2, f3, f4);

		BigDecimal valor = new BigDecimal("4000");

		List<BigDecimal> resultado = estruturaDadosListProvider.maioresSalariosPeloValor(pessoas, valor);

		System.out.println(resultado);
		return estruturaDadosListProvider.maioresSalariosPeloValor(pessoas, valor);
	}

////////////////////////MAP//////////////////////////////////////////////
	public static Map<String, Integer> nomeFrequencia() {
		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();

		List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Ana", "Pedro", "João", "Ana", "Maria");
		Map<String, Integer> contagemDados = estruturaDadosMap.nomeFrequencia(nomes);

		for (Map.Entry<String, Integer> entry : contagemDados.entrySet()) {
			System.out.println("Nome: " + entry.getKey() + ", Frequência: " + entry.getValue());
		}
		return contagemDados;
	}

	public static Map<String, Integer> mapaFrequenciaValores() {

		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();

		Map<String, String> nomesDados = new HashMap<>();
		nomesDados.put("1", "maça");
		nomesDados.put("2", "banana");
		nomesDados.put("3", "maça");
		nomesDados.put("4", "laranja");
		nomesDados.put("5", "banana");
		nomesDados.put("6", "maça");

		Map<String, Integer> contandoDados = estruturaDadosMap.mapaFrequenciaValores(nomesDados);

		System.out.println("Frequências dos valores:");
		for (Map.Entry<String, Integer> entrada : contandoDados.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}
		return contandoDados;
	}

	public static Map<String, Integer> mapaFrequenciaValoresLista() {
		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();

		Map<String, List<String>> mapa = new HashMap<>();
		mapa.put("chave1", Arrays.asList("valor1", "valor2", "valor1"));
		mapa.put("chave2", Arrays.asList("valor3", "valor1", "valor2", "valor3"));
		mapa.put("chave3", Arrays.asList("valor2", "valor3", "valor3"));

		Map<String, Integer> frequenciaMap = estruturaDadosMap.mapaFrequenciaValoresLista(mapa);

		System.out.println("Frequência dos valores:");
		for (Map.Entry<String, Integer> entry : frequenciaMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		return frequenciaMap;
	}

	public static Map<String, List<String>> nomeTelefone() {
		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();

		List<String> elementos = Arrays.asList("João;123456789,987654321", "Maria;555123456,555654321",
				"Ana;111222333,444555666", "João;777888999");

		Map<String, List<String>> resultado = estruturaDadosMap.nomeTelefones(elementos);

		for (Map.Entry<String, List<String>> entry : resultado.entrySet()) {
			String nome = entry.getKey();
			List<String> telefones = entry.getValue();
			System.out.println("Nome: " + nome);
			System.out.println("Telefones: " + telefones);
		}
		return resultado;
	}

	public static Map<Funcionario, List<ContatoFuncionario>> cpfCnpjTelefonesObjeto() {
		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();

		List<String> exemplo = Arrays.asList("12345678901;1111111111,2222222222", "10987654321;3333333333",
				"98765432100;4444444444,5555555555,6666666666");

		Map<Funcionario, List<ContatoFuncionario>> resultado = estruturaDadosMap.cpfCnpjTelefonesObjeto(exemplo);

		for (Map.Entry<Funcionario, List<ContatoFuncionario>> entry : resultado.entrySet()) {
			Funcionario funcionario = entry.getKey();
			List<ContatoFuncionario> contatos = entry.getValue();

			System.out.println("Funcionario: " + funcionario);
			System.out.println("Contatos:");
			for (ContatoFuncionario contato : contatos) {
				System.out.println("  " + contato);
			}
		}
		return resultado;
	}

	public static List<String> chavesMapa() {
		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();

		Map<String, String> mapa = new HashMap<>();
		mapa.put("chave1", "valor1");
		mapa.put("chave2", "valor2");
		mapa.put("chave3", "valor3");
		return estruturaDadosMap.chavesMapa(mapa);
	}

	public static List<String> valoresMapa() {
		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();
		Map<String, String> mapa = Map.of("chave1", "valor1", "chave2", "valor2", "chave3", "valor3");
		return estruturaDadosMap.valoresMapa(mapa);
	}

	public static Map<String, List<Integer>> nomeTelefones() {
		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();
		Map<String, List<Integer>> resultado = estruturaDadosMap.nomeTelefones(50);

		for (Map.Entry<String, List<Integer>> entry : resultado.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		return resultado;
	}

	public static Integer maiorNumeroEntreValores() {

		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();
		Map<String, List<Integer>> mapa = new HashMap<>();
		mapa.put("valor1", Arrays.asList(1, 2, 3, 4, 5));
		mapa.put("valor2", Arrays.asList(10, 20, 30));
		mapa.put("valor3", Arrays.asList(7, 8, 9));

		return estruturaDadosMap.maiorNumeroEntreValores(mapa);
	}

	public static String chaveMaiorNumeroEntreValores() {

		EstruturaDadosMapProvider estruturaDadosMap = new EstruturaDadosMapProvider();
		Map<String, List<Integer>> mapa = new HashMap<>();
		mapa.put("valore1", Arrays.asList(1, 2, 3, 4, 5));
		mapa.put("valores2", Arrays.asList(10, 20, 30));
		mapa.put("valores3", Arrays.asList(7, 8, 9));

		return estruturaDadosMap.chaveMaiorNumeroEntreValores(mapa);
	}

//////////////////////////SET///////////////////////////////////////////////////

	public static Set<String> nomesUnicosOrdenados() {
		EstruturaDadosSetProvider estruturaDadosSet = new EstruturaDadosSetProvider();
		List<String> nomes = Arrays.asList("Ana", "Bruno", "Ana", "Carlos", "Beatriz", "Carlos");
		Set<String> resultado = estruturaDadosSet.nomesUnicosOrdenados(nomes);
		System.out.println(resultado);
		return estruturaDadosSet.nomesUnicosOrdenados(nomes);
	}

	public static Set<String> valoresPositivosNegativos() {
		EstruturaDadosSetProvider estruturaDadosProvider = new EstruturaDadosSetProvider();
		int[] valores = { -999, 77, -7, 5, 8, 99, 776 };
		Set<String> resultado = estruturaDadosProvider.valoresPositivosNegativos(valores);
		System.out.println(resultado);
		return estruturaDadosProvider.valoresPositivosNegativos(valores);
	}

	public static Set<Integer> valoresDuplicadosOrdenados() {
		EstruturaDadosSetProvider estruturaDadosSet = new EstruturaDadosSetProvider();
		List<Integer> valores1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> valores2 = Arrays.asList(5, 4, 6, 2, 7);

		Set<Integer> resultado = estruturaDadosSet.valoresDuplicadosOrdenados(valores1, valores2);

		System.out.println(resultado);
		return estruturaDadosSet.valoresDuplicadosOrdenados(valores1, valores2);

	}

	public static Set<Integer> valoresDiferentesOrdenados() {
		EstruturaDadosSetProvider estruturaDadosSet = new EstruturaDadosSetProvider();

		List<Integer> valores1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> valores2 = Arrays.asList(5, 4, 6, 2, 7);

		Set<Integer> resultado = estruturaDadosSet.valoresDiferentesOrdenados(valores1, valores2);

		System.out.println(resultado);

		return estruturaDadosSet.valoresDiferentesOrdenados(valores1, valores2);
	}

	public static Set<Integer> valoresDuplicadosDaPrimeiraListaOrdenados() {
		EstruturaDadosSetProvider estruturaDadosSet = new EstruturaDadosSetProvider();

		List<Integer> valores1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> valores2 = Arrays.asList(5, 4, 6, 2, 7);

		Set<Integer> resultado = estruturaDadosSet.valoresDuplicadosDaPrimeiraListaOrdenados(valores1, valores2);

		System.out.println(resultado);
		return estruturaDadosSet.valoresDuplicadosDaPrimeiraListaOrdenados(valores1, valores2);

	}

	public static Set<Integer> valoresDiferentesDaSegundaListaOrdenados() {
		EstruturaDadosSetProvider estruturaDadosSet = new EstruturaDadosSetProvider();
		List<Integer> valores1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> valores2 = Arrays.asList(5, 4, 6, 2, 7);
		Set<Integer> resultado = estruturaDadosSet.valoresDiferentesDaSegundaListaOrdenados(valores1, valores2);
		System.out.println(resultado);
		return estruturaDadosSet.valoresDiferentesDaSegundaListaOrdenados(valores1, valores2);
	}

	public static Set<Funcionario> pessoasUnicasOrdenados() {

		EstruturaDadosSetProvider estruturaDadosSet = new EstruturaDadosSetProvider();

		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		Funcionario f4 = new Funcionario();

		f1.setCpfCnpj("12345678901");
		f1.setNome("Ana");
		f2.setCpfCnpj("98765432100");
		f2.setNome("Bruno");
		f3.setCpfCnpj("12345678901");
		f3.setNome("Ana");
		f4.setCpfCnpj("55566677788");
		f4.setNome("Carlos");

		List<Funcionario> lista = Arrays.asList(f1, f2, f3, f4);

		Set<Funcionario> resultado = estruturaDadosSet.pessoasUnicasOrdenados(lista);

		resultado.forEach(System.out::println);
		return estruturaDadosSet.pessoasUnicasOrdenados(lista);
	}

	public static Set<Funcionario> pessoasDuplicadosOrdenados() {
		EstruturaDadosSetProvider estruturaDadosMap = new EstruturaDadosSetProvider();

		Funcionario f1 = new Funcionario();
		f1.setCpfCnpj("12345678901");

		Funcionario f2 = new Funcionario();
		f2.setCpfCnpj("98765432100");

		Funcionario f3 = new Funcionario();
		f3.setCpfCnpj("11122233344");

		Funcionario f4 = new Funcionario();
		f4.setCpfCnpj("55566677788");

		List<Funcionario> lista1 = Arrays.asList(f1, f2, f3);
		List<Funcionario> lista2 = Arrays.asList(f2, f3, f4);

		Set<Funcionario> resultado = estruturaDadosMap.pessoasDuplicadosOrdenados(lista1, lista2);

		resultado.forEach(System.out::println);
		return estruturaDadosMap.pessoasDuplicadosOrdenados(lista1, lista2);
	}

	public static Set<Funcionario> pessoasDiferentesOrdenados() {
		EstruturaDadosSetProvider estruturaDadosMap = new EstruturaDadosSetProvider();

		Funcionario f1 = new Funcionario();
		f1.setCpfCnpj("12345678901");

		Funcionario f2 = new Funcionario();
		f2.setCpfCnpj("98765432100");

		Funcionario f3 = new Funcionario();
		f3.setCpfCnpj("11122233344");

		Funcionario f4 = new Funcionario();
		f4.setCpfCnpj("55566677788");

		List<Funcionario> lista1 = Arrays.asList(f1, f2);
		List<Funcionario> lista2 = Arrays.asList(f2, f3, f4);

		Set<Funcionario> resultado = estruturaDadosMap.pessoasDiferentesOrdenados(lista1, lista2);

		resultado.forEach(System.out::println);
		return estruturaDadosMap.pessoasDiferentesOrdenados(lista1, lista2);
	}

	public static Set<Funcionario> pessoasDuplicadosDaPrimeiraListaOrdenados() {
		EstruturaDadosSetProvider estruturaDadosMap = new EstruturaDadosSetProvider();

		Funcionario f1 = new Funcionario();
		f1.setCpfCnpj("12345678901");

		Funcionario f2 = new Funcionario();
		f2.setCpfCnpj("98765432100");

		Funcionario f3 = new Funcionario();
		f3.setCpfCnpj("11122233344");

		Funcionario f4 = new Funcionario();
		f4.setCpfCnpj("55566677788");

		List<Funcionario> lista1 = Arrays.asList(f1, f2, f3);
		List<Funcionario> lista2 = Arrays.asList(f2, f4);

		Set<Funcionario> resultado = estruturaDadosMap.pessoasDuplicadosDaPrimeiraListaOrdenados(lista1, lista2);

		resultado.forEach(System.out::println);
		return estruturaDadosMap.pessoasDuplicadosDaPrimeiraListaOrdenados(lista1, lista2);
	}

	public static Set<Funcionario> pessoasDiferentesDaSegundaListaOrdenados() {

		EstruturaDadosSetProvider estruturaDadosMap = new EstruturaDadosSetProvider();

		Funcionario f1 = new Funcionario();
		f1.setCpfCnpj("12345678901");

		Funcionario f2 = new Funcionario();
		f2.setCpfCnpj("98765432100");

		Funcionario f3 = new Funcionario();
		f3.setCpfCnpj("11122233344");

		Funcionario f4 = new Funcionario();
		f4.setCpfCnpj("55566677788");

		List<Funcionario> lista1 = Arrays.asList(f1, f2, f3);
		List<Funcionario> lista2 = Arrays.asList(f2, f4);

		Set<Funcionario> resultado = estruturaDadosMap.pessoasDiferentesDaSegundaListaOrdenados(lista1, lista2);

		resultado.forEach(System.out::println);
		return estruturaDadosMap.pessoasDiferentesDaSegundaListaOrdenados(lista1, lista2);
	}
}
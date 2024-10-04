package br.com.qwasolucoes.mentoria.implementacoes.logica_programacao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import br.com.qwasolucoes.mentoria.interfaces.logica_programacao.LogicaProgramacao;
import br.com.qwasolucoes.mentoria.model.Funcionario;

public class LogicaProgramacaoProvider implements LogicaProgramacao {

	@Override
	public List<Funcionario> conversaoStringParaPessoa(List<String> lista) {

		List<Funcionario> listaFuncionario = new ArrayList<>();

		DateTimeFormatter formatandoData = DateTimeFormatter.ofPattern("ddMMyyyy");

		for (String dados : lista) {

			String nome = dados.substring(0, 20).trim();
			String sobrenome = dados.substring(20, 40).trim();
			String dataSubstring = dados.substring(40, 48).trim();
			String sexo = dados.substring(48, 49).trim();
			String profissao = dados.substring(49, 89).trim();
			String cpfCnpj = dados.substring(89, 103).trim();
			String escolaridade = dados.substring(103, 143).trim();
			BigDecimal salario = new BigDecimal(dados.substring(143, 153).trim());

			LocalDate dataNasc = LocalDate.parse(dataSubstring, formatandoData);
			Date dataNascDate = Date.from(dataNasc.atStartOfDay(ZoneId.systemDefault()).toInstant());

			LocalDate hoje = LocalDate.now();
			int idade = Period.between(dataNasc, hoje).getYears();

			Funcionario funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setSobrenome(sobrenome);
			funcionario.setDataNascimento(dataNascDate);
			funcionario.setSexo(sexo);
			funcionario.setProfissao(profissao);
			funcionario.setCpfCnpj(cpfCnpj);
			funcionario.setEscolaridade(escolaridade);
			funcionario.setSalario(salario);
			funcionario.setIdade(idade);
			funcionario.setMaiorIdade(idade >= 18);
			BigDecimal taxaPercentual = calcularTaxa(idade, salario);
			BigDecimal salarioLiquido = salario.subtract(taxaPercentual);
			BigDecimal taxaFormatada = taxaPercentual.setScale(1, RoundingMode.DOWN);
			BigDecimal salarioLiquidoFormatado = salarioLiquido.setScale(1, RoundingMode.DOWN);

			funcionario.setTaxa(taxaFormatada);
			funcionario.setSalarioLiquido(salarioLiquidoFormatado);

			listaFuncionario.add(funcionario);
		}
		return listaFuncionario;
	}

	@Override
	public List<String> conversaoPessoaParaString(List<Funcionario> pessoas) {

		List<String> listaFormatada = new ArrayList<>();
		 LocalDate dataNascimento = LocalDate.of(1990, 1, 1);
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		for (Funcionario dados : pessoas) 
		{
			String nome = String.format("%-20s", removerSpaco(dados.getNome(), 20));
			String sobrenome = String.format("%-20s", removerSpaco(dados.getSobrenome(), 20));
	        String dataNascimentoFormatada = String.format("%-8s", removerSpaco(dataNascimento.format(formatter), 8));
			String sexo = String.format("%-1s", removerSpaco(dados.getSexo(), 1));
			String profissao = String.format("%-40s", removerSpaco(dados.getProfissao(), 40));
			String cpfCnpj = String.format("%-14s", removerSpaco(dados.getCpfCnpj(), 14));
			String escolaridade = String.format("%-40s", removerSpaco(dados.getEscolaridade(), 40));
			String salario = String.format("%-10s",
					removerSpaco(dados.getSalario() != null ? dados.getSalario().toString() : "", 10));
			String funcionarioFormatado = nome + sobrenome + dataNascimentoFormatada + sexo + profissao + cpfCnpj + escolaridade + salario;
			listaFormatada.add(funcionarioFormatado);

		}
		return listaFormatada;
	}

	public static String removerSpaco(String value, int length) {
		if (value == null) {
			return "";
		}
		return value.length() > length ? value.substring(0, length) : value;
	}

	@Override
	public Funcionario conversaoArrayParaPessoa(String[] array) {
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");

		
		Funcionario funcionarioNovo = new Funcionario();
		LocalDate dataNasc = LocalDate.parse(array[2], inputFormatter);
		Date dataNascDate = Date.from(dataNasc.atStartOfDay(ZoneId.systemDefault()).toInstant());

		LocalDate hoje = LocalDate.now();
		int idade = Period.between(dataNasc, hoje).getYears();
		boolean maiorIdade = idade >= 18;

		BigDecimal salario = new BigDecimal(array[7]);
		BigDecimal taxaAplicada = calcularTaxa(idade, salario);
		
		String risco;
		double taxa;
		
		if (idade <= 18) {
			risco = "MENOR_IDADE";
			taxa = 20.0;
		} else if (idade <= 24) {
			risco = "RISCO_ALTO";
			taxa = 15.0;
		} else if (idade <= 32) {
			risco = "RISCO_MODERADO";
			taxa = 10.0;
		} else if (idade <= 50) {
			risco = "RISCO_BAIXO";
			taxa = 5.0;
		} else {
			risco = "ESPECIAL";
			taxa = 1.0;
		}
		BigDecimal salarioLiquido = salario.subtract(salario.subtract(salario.subtract(taxaAplicada)));
		BigDecimal valorTaxa = salario.multiply(BigDecimal.valueOf(taxa / 100.0));
		
		funcionarioNovo.setNome(array[0]);
		funcionarioNovo.setSobrenome(array[1]);
		funcionarioNovo.setDataNascimento(dataNascDate);
		funcionarioNovo.setSexo(array[3]);
		funcionarioNovo.setProfissao(array[4]);
		funcionarioNovo.setCpfCnpj(array[5]);
		funcionarioNovo.setEscolaridade(array[6]);
		funcionarioNovo.setSalario(salario);
		funcionarioNovo.setIdade(idade);
		funcionarioNovo.setMaiorIdade(maiorIdade);
		funcionarioNovo.setSalarioLiquido(salarioLiquido);
		funcionarioNovo.setTaxa(valorTaxa);

		return funcionarioNovo;

	}

	@Override
	public List<Funcionario> conversaoArrayMultidimensionalParaPessoa(String[][] arrayMultidimensional) {

		List<Funcionario> listaFuncionarios = new ArrayList<>();
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");

		for (String[] linha : arrayMultidimensional) {
			String nome = linha[0];
			String sobrenome = linha[1];
			String dataNascimento = linha[2];
			String sexo = linha[3];
			String profissao = linha[4];
			String cpfCnpj = linha[5];
			String escolaridade = linha[6];
			BigDecimal salario = new BigDecimal(Double.parseDouble(linha[7]) / 100.0);

			LocalDate dataNasc = LocalDate.parse(dataNascimento, inputFormatter);
			Date dataNascDate = Date.from(dataNasc.atStartOfDay(ZoneId.systemDefault()).toInstant());

			LocalDate hoje = LocalDate.now();
			int idade = Period.between(dataNasc, hoje).getYears();

			boolean maiorIdade = idade >= 18;

			String risco;
			double taxa;

			if (idade <= 18) {
				risco = "MENOR_IDADE";
				taxa = 20.0;
			} else if (idade <= 24) {
				risco = "RISCO_ALTO";
				taxa = 15.0;
			} else if (idade <= 32) {
				risco = "RISCO_MODERADO";
				taxa = 10.0;
			} else if (idade <= 50) {
				risco = "RISCO_BAIXO";
				taxa = 5.0;
			} else {
				risco = "ESPECIAL";
				taxa = 1.0;
			}

			BigDecimal valorTaxa = salario.multiply(BigDecimal.valueOf(taxa / 100.0));

			Funcionario funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setSobrenome(sobrenome);
			funcionario.setDataNascimento(dataNascDate);
			funcionario.setIdade(idade);
			funcionario.setSexo(sexo);
			funcionario.setProfissao(profissao);
			funcionario.setCpfCnpj(cpfCnpj);
			funcionario.setEscolaridade(escolaridade);
			funcionario.setSalario(salario);
			funcionario.setMaiorIdade(maiorIdade);
			funcionario.setTaxa(valorTaxa);
			funcionario.setSalarioLiquido(valorTaxa);

			listaFuncionarios.add(funcionario);
		}
		return listaFuncionarios;
	}

	public static BigDecimal calcularTaxa(int idade, BigDecimal salario) {

		BigDecimal taxa;

		if (idade <= 18) {
			taxa = new BigDecimal("0.20");
		} else if (idade <= 24) {
			taxa = new BigDecimal("0.15");
		} else if (idade <= 32) {
			taxa = new BigDecimal("0.10");
		} else if (idade <= 50) {
			taxa = new BigDecimal("0.05");
		} else {
			taxa = new BigDecimal("0.01");
		}

		return salario.multiply(taxa).setScale(2, RoundingMode.HALF_UP);

	}

	@Override
	public int[][] arrayMultidimensionalParesImparesPrimosResto(int[] array, int numeroDivisaoResto) {

		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		List<Integer> primos = new ArrayList<>();
		List<Integer> restos = new ArrayList<>();

		for (int num : array) {
			if (num % 2 == 0) {
				pares.add(num);
			} else {
				impares.add(num);
			}

			if (validarPrimo(num)) {
				primos.add(num);
			}

			restos.add(num % numeroDivisaoResto);
		}

		int[][] resultado = new int[4][];
		resultado[0] = pares.stream().mapToInt(i -> i).toArray();
		resultado[1] = impares.stream().mapToInt(i -> i).toArray();
		resultado[2] = primos.stream().mapToInt(i -> i).toArray();
		resultado[3] = restos.stream().mapToInt(i -> i).toArray();

		return resultado;
	}

	private boolean validarPrimo(int numero) {
		if (numero <= 1)
			return false;
		if (numero <= 3)
			return true;
		if (numero % 2 == 0 || numero % 3 == 0)
			return false;
		for (int i = 5; i * i <= numero; i += 6) {
			if (numero % i == 0 || numero % (i + 2) == 0)
				return false;
		}
		return true;
	}

	@Override
	public String[] arrayMultidimensionalPorPosicoes(String[][] arrayMultidimensional, int coluna, int linha) {

		int numLinhas = arrayMultidimensional.length;
		int numColunas = arrayMultidimensional[linha].length;

		String[] resultado = new String[4];

		if (coluna > 0) {
			resultado[0] = arrayMultidimensional[linha][coluna - 1];
		} else {
			resultado[0] = "";
		}
		if (coluna < numColunas - 1) {
			resultado[1] = arrayMultidimensional[linha][coluna + 1];
		} else {
			resultado[1] = "";
		}

		if (linha > 0) {
			resultado[2] = arrayMultidimensional[linha - 1][coluna];
		} else {
			resultado[2] = "";
		}

		if (linha < numLinhas - 1) {
			resultado[3] = arrayMultidimensional[linha + 1][coluna];
		} else {
			resultado[3] = "";
		}
		return resultado;
	}

	@Override
	public String[] arrayMultidimensionalPorValor(String[][] arrayMultidimensional, String valor) {

		int linhas = arrayMultidimensional.length;
		int colunas = arrayMultidimensional[0].length;

		int linhaPosi = -1;
		int colunaPosi = -1;

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (arrayMultidimensional[i][j].equals(valor)) {
					linhaPosi = i;
					colunaPosi = j;
					break;
				}
			}
			if (linhaPosi != -1) {
				break;
			}
		}

		String[] resultado = new String[4];

		if (colunaPosi > 0) {
			resultado[0] = arrayMultidimensional[linhaPosi][colunaPosi - 1];
		} else {
			resultado[0] = "sem posição";
		}

		if (colunaPosi < colunas - 1) {
			resultado[1] = arrayMultidimensional[linhaPosi][colunaPosi + 1];
		} else {
			resultado[1] = "sem posição";
		}

		if (linhaPosi > 0) {
			resultado[2] = arrayMultidimensional[linhaPosi - 1][colunaPosi];
		} else {
			resultado[2] = "sem posição";
		}

		if (linhaPosi < linhas - 1) {
			resultado[3] = arrayMultidimensional[linhaPosi + 1][colunaPosi];
		} else {
			resultado[3] = "sem posição";
		}

		for (String res : resultado) {
			System.out.println(res);
		}

		return resultado;
	}

	@Override
	public String[] antecessorSucessorPor(String[] array, int posicao) {

		String[] resultado = new String[2];

		if (posicao < 0 || posicao >= array.length) {
			throw new IllegalArgumentException("Posição inválida no array");
		}

		String valor = array[posicao];

		String antecessor = null;
		String sucessor = null;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(valor)) {
				if (i > 0) {
					antecessor = array[i - 1];
				}
				if (i < array.length - 1) {
					sucessor = array[i + 1];
				}
				break;
			}
		}

		resultado[0] = antecessor;
		resultado[1] = sucessor;
		System.out.println("Antecessor: " + resultado[0]);
		System.out.println("Sucessor: " + resultado[1]);

		return resultado;
	}

	@Override
	public String[] antecessorSucessorPor(String[] array, String valor) {
		String[] resultado = new String[2];

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(valor)) {
				if (i > 0) {
					resultado[0] = array[i - 1];
				} else {
					resultado[0] = null;
				}

				if (i < array.length - 1) {
					resultado[1] = array[i + 1];
				} else {
					resultado[1] = null;
				}
				break;
			}
		}
		System.out.println("Antecessor: " + resultado[0]);
		System.out.println("Sucessor: " + resultado[1]);

		return resultado;
	}

	@Override
	public List<Integer> numerosPares(Integer limite) {

		List<Integer> resultado = new ArrayList<>();

		for (int i = 0; i <= limite; i++) {
			if (i % 2 == 0) {
				{
					resultado.add(i);
				}
			}

		}
		return resultado;
	}

	@Override
	public List<Integer> numerosImpares(Integer limite) {

		List<Integer> resultado = new ArrayList<>();

		for (int i = 0; i <= limite; i++) {
			if (i % 2 != 0) {
				{
					resultado.add(i);
				}
			}

		}
		return resultado;
	}

	@Override
	public List<Integer> numerosPrimos(Integer limite) {

		List<Integer> resultado = new ArrayList<>();

		for (int i = 2; i <= limite; i++) {
			if (numeroPrimo(i)) {
				resultado.add(i);
			}
		}

		return resultado;
	}

	@Override
	public int[] numerosParesArray(Integer limite) {
		int contador = 0;
		for (int i = 1; i <= limite; i++) {
			if (i % 2 == 0) {
				contador++;
			}
		}
		int[] numerosParesArray = new int[contador];
		contador = 0;
		for (int i = 1; i <= limite; i++) {
			if (i % 2 == 0) {
				numerosParesArray[contador] = i;
				contador++;
			}
		}

		return numerosParesArray;
	}

	@Override
	public int[] numerosImparesArray(Integer limite) {
		int contador = 0;
		for (int i = 1; i <= limite; i++) {
			if (i % 2 != 0) {
				contador++;
			}
		}
		int[] numerosImparesArray = new int[contador];
		contador = 0;
		for (int i = 1; i <= limite; i++) {
			if (i % 2 != 0) {
				numerosImparesArray[contador] = i;
				contador++;
			}
		}

		return numerosImparesArray;
	}

	@Override
	public int[] numerosPrimosArray(Integer limite) {

		int[] numerosPrimosArray = new int[limite];
		int contar = 0;

		for (int i = 0; i < limite; i++) {
			numerosPrimosArray[i] = i;
		}
		for (int i = 2; i <= limite; i++) {
			boolean numeroPrimo = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					numeroPrimo = false;
					break;
				}
			}
			if (numeroPrimo) {
				numerosPrimosArray[contar] = i;
				contar++;
			}

		}

		int[] resultado = Arrays.copyOf(numerosPrimosArray, contar);
		System.out.println(Arrays.toString(resultado));
		return resultado;

	}

	@Override
	public int[] primeiraUltimaPosicaoArray(Integer limite) {

		int[] primeiraUltimaPosicao = new int[2];
		if (limite > 0) {
			primeiraUltimaPosicao[0] = 0;
			primeiraUltimaPosicao[1] = limite - 1;
		}

		return primeiraUltimaPosicao;
	}

	@Override
	public int[] quantidadeParesImparesPrimos(List<Integer> valores) {

		int[] contadores = new int[3];

		for (int valor : valores) {
			if (valor % 2 == 0) {
				contadores[0]++;
			} else {
				contadores[1]++;
			}

			if (numeroPrimo(valor)) {
				contadores[2]++;
			}
		}
		return contadores;
	}

	public boolean numeroPrimo(int numero) {
		if (numero <= 1) {
			return false;
		}
		if (numero == 2) {
			return true;
		}
		if (numero % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(numero); i += 2) {
			if (numero % i == 0) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int[] primeiraUltimaMediaPosicaoArray(Integer limite) {
		int resultado = 0;

		int[] primeiraUltimaPosicao = new int[limite];
		for (int i = 0; i < limite; i++) {
			primeiraUltimaPosicao[i] = i;
		}
		int primeiro = primeiraUltimaPosicao[0];
		int ultimo = primeiraUltimaPosicao[limite - 1];
		int soma = 0;

		for (int valor : primeiraUltimaPosicao) {
			soma += valor;
		}
		int media = soma / limite;
		System.out.printf("Primeiro: %d.%nUltimo: %d.%nMédia: %d.%n", primeiro, ultimo, media);
		return primeiraUltimaPosicao;

	}

	@Override
	public List<Integer> removerInteirosDuplicados(List<Integer> numeros) {
		Set<Integer> valorUnicos = new HashSet<>();
		Set<Integer> valorDuplicados = new HashSet<>();

		for (Integer nome : numeros) {
			if (!valorUnicos.add(nome)) {
				valorDuplicados.add(nome);
			}
		}
		return new ArrayList<>(valorUnicos);
	}

	@Override
	public List<BigDecimal> removerValoresDuplicados(List<BigDecimal> numeros) {

		Set<BigDecimal> valorUnicos = new HashSet<>();
		Set<BigDecimal> valorDuplicados = new HashSet<>();

		for (BigDecimal nome : numeros) {
			if (!valorUnicos.add(nome)) {
				valorDuplicados.add(nome);
			}
		}

		List<BigDecimal> resultado = new ArrayList<>(valorUnicos);
		resultado.removeAll(valorDuplicados);

		return new ArrayList<>(valorDuplicados);
	}

	@Override
	public List<String> removerTextosDuplicados(List<String> textos) {

		Set<String> textoUnicos = new HashSet<>();
		Set<String> textoDuplicados = new HashSet<>();

		for (String nome : textos) {
			if (!textoUnicos.add(nome)) {
				textoDuplicados.add(nome);
			}
		}

		return new ArrayList<>(textoUnicos);
	}

	@Override
	public Integer valorInteiroMaiorQtdDuplicados(List<Integer> numeros) {

		Map<Integer, Integer> listaDuplicado = new TreeMap<>();
		for (Integer numero : numeros) {
			listaDuplicado.put(numero, listaDuplicado.getOrDefault(numero, 0) + 1);
		}

		Integer numeroMaiorQtdDuplicados = null;
		int maiorQtd = 0;
		for (Map.Entry<Integer, Integer> entry : listaDuplicado.entrySet()) {
			if (entry.getValue() > 1 && entry.getValue() > maiorQtd) {
				maiorQtd = entry.getValue();
				numeroMaiorQtdDuplicados = entry.getKey();
			}
		}

		return numeroMaiorQtdDuplicados;
	}

	@Override
	public String valorTextoMaiorQtdDuplicados(List<String> textos) {

		Map<String, Integer> maiorDuplicado = new TreeMap<>();
		for (String duplicado : textos) {
			if (!maiorDuplicado.containsKey(duplicado)) {
				maiorDuplicado.put(duplicado, 0);
			}
			maiorDuplicado.put(duplicado, maiorDuplicado.get(duplicado) + 1);
		}
		String textoMaisFrequente = null;
		int maxFrequencia = 0;

		for (Map.Entry<String, Integer> entry : maiorDuplicado.entrySet()) {
			if (entry.getValue() > maxFrequencia) {
				maxFrequencia = entry.getValue();
				textoMaisFrequente = entry.getKey();
			}
		}

		return textoMaisFrequente.toString();

	}

	@Override
	public List<Integer> listaInteirosDuplicados(List<Integer> numeros) {

		List<Integer> inteirosDuplicados = new ArrayList<>();
		Map<Integer, Integer> listaDuplicado = new TreeMap<Integer, Integer>();
		for (Integer lista : numeros) {
			if (!listaDuplicado.containsKey(lista)) {
				listaDuplicado.put(lista, 0);
			}
			listaDuplicado.put(lista, listaDuplicado.get(lista) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : listaDuplicado.entrySet())
			if (entry.getValue() > 1) {
				inteirosDuplicados.add(entry.getKey());
			}

		return inteirosDuplicados;
	}

	@Override
	public List<BigDecimal> listaDecimalDuplicados(List<BigDecimal> textos) {

		List<BigDecimal> numerosDuplicados = new ArrayList<>();
		Map<BigDecimal, Integer> comparaNumeros = new TreeMap<BigDecimal, Integer>();

		for (BigDecimal numeros : textos) {
			if (!comparaNumeros.containsKey(numeros)) {
				comparaNumeros.put(numeros, 0);
			}
			comparaNumeros.put(numeros, comparaNumeros.get(numeros) + 1);
		}
		for (Map.Entry<BigDecimal, Integer> entry : comparaNumeros.entrySet()) {
			if (entry.getValue() > 1) {
				numerosDuplicados.add(entry.getKey());
			}

		}
		return numerosDuplicados;

	}

	@Override
	public List<String> listaTextoDuplicados(List<String> textos) {

		List<String> textoDuplicados = new ArrayList<>();
		Map<String, Integer> compararLista = new TreeMap<String, Integer>();

		for (String nomes : textos) {

			if (!compararLista.containsKey(nomes)) {
				compararLista.put(nomes, 0);
			}
			compararLista.put(nomes, compararLista.get(nomes) + 1);

		}
		for (Map.Entry<String, Integer> entry : compararLista.entrySet()) {

			if (entry.getValue() > 1) {
				textoDuplicados.add(entry.getKey());
			}

		}

		return textoDuplicados;

	}

	@Override
	public Integer somarValores(Integer limite) {

		int resultado = 0;
		for (int i = 0; i <= limite; i++) {
			resultado += i;
		}
		return resultado;
	}

	@Override
	public Integer somarValoresPares(Integer limite) {

		int resultado = 0;
		for (int i = 2; i <= limite; i += 2) {
			resultado += i;
		}
		return resultado;
	}

	@Override
	public Integer somarValoresImpares(Integer limite) {

		int resultado = 0;
		for (int i = 1; i <= limite; i += 2) {
			resultado += i;
		}
		return resultado;
	}

	@Override
	public Integer somarValoresPrimos(Integer limite) {

		int soma = 0;
		for (int i = 2; i < limite; i++) {
			boolean primo = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			if (primo)
				soma += i;
		}

		return soma;
	}

	@Override
	public Integer somarValoresPosicoes(int[] valores) {

		int soma = 0;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] * 2 != 0) {
				soma += valores[i];
			}

		}
		return soma;
	}

	@Override
	public Integer somarValoresParesPosicoes(int[] valores) {

		int soma = 0;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 2 == 0) {
				soma += valores[i];
			}

		}
		return soma;
	}

	@Override
	public Integer somarValoresImparesPosicoes(int[] valores) {

		int soma = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 2 != 0) {
				soma += valores[i];
			}

		}
		return soma;
	}

	@Override
	public Integer somarValoresPrimosPosicoes(int[] valores) {

		int soma = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] % 2 != 0) {
				soma += valores[i];
			}
		}
		return soma;
	}

	@Override
	public Integer somarValoresPosicoesParesMultiplosDe(Integer limite, Integer multiplo) {

		int resultado = 0;

		for (int i = 0; i <= limite; i++) {
			if (i % 2 == 0) {
				resultado += i * multiplo;
			}
		}
		return resultado;
	}

	@Override
	public boolean multiploDeSete(int valor) {
		if (valor % 7 == 0) {

			return true;

		} else {

			return false;

		}
	}

	@Override
	public String parOuImpar(int valor) {
		if (valor % 2 == 0) {

			return "PAR";

		} else {

			return "IMPAR";

		}
	}

	@Override
	public String parOuImparOuZero(int valor) {
		if (valor == 0) {

			return "ZERO";

		} else if (valor % 2 == 0) {

			return "PAR";

		} else {

			return "IMPAR";

		}
	}

	@Override
	public int[] obterDobrosAteDobroInformado(int valor) {

		int valorInicio = valor;
		int valorFim = valor * 2;

		int tamanho = Math.abs(valorFim - valorInicio) + 1;
		int[] obterDobrosAteDobroInformado = new int[tamanho];

		int i = valorInicio;
		int indice = 0;

		while ((valor <= 0 && i >= valorFim) || (valor > 0 && i <= valorFim)) {
			obterDobrosAteDobroInformado[indice] = i * 2;
			i = valor <= 0 ? i - 1 : i + 1;
			indice++;
		}

		return obterDobrosAteDobroInformado;
	}

	@Override
	public int[] obterDobrosAteDez(int valor) {

		int tamanho = Math.max(0, (10 - valor) + 1);
		int[] obterDobrosAteDez = new int[tamanho];

		int i = valor;
		int indice = 0;

		while (i <= 10) {
			obterDobrosAteDez[indice] = i * 2;
			i++;
			indice++;
		}

		return obterDobrosAteDez;
	}

	@Override
	public int[] obterDobrosAteMil(int valor) {

		int tamanho = 0;
		int tempValor = valor * 2;

		do {
			tamanho++;
			tempValor *= 2;
		} while (tempValor <= 1000);

		tamanho++;

		int[] resultado = new int[tamanho];

		int i = valor * 2;
		int indice = 0;

		do {
			resultado[indice] = i;
			i *= 2;
			indice++;
		} while (indice < tamanho);

		return resultado;
	}

	@Override
	public int[][] tabuada(int valor) {

		int linhas = valor * 10;
		int colunas = 3;
		int resultado = 0;

		int[][] tabela = new int[linhas][colunas];

		for (int i = 1; i <= valor; i++) {
			for (int j = 1; j <= 10; j++) {
				tabela[resultado][0] = i;
				tabela[resultado][1] = j;
				tabela[resultado][2] = i * j;
				resultado++;
			}
		}

		return tabela;

	}
}

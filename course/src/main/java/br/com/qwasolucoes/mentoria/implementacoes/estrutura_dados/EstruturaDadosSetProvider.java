package br.com.qwasolucoes.mentoria.implementacoes.estrutura_dados;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import br.com.qwasolucoes.mentoria.interfaces.estrutura_dados.EstruturaDadosSet;
import br.com.qwasolucoes.mentoria.model.Funcionario;

public class EstruturaDadosSetProvider implements EstruturaDadosSet {

	@Override
	public Set<String> nomesUnicosOrdenados(List<String> nomes) {
		Set<String> nomesUnicos = new TreeSet<>(nomes);
		return nomesUnicos;

	}

	@Override
	public Set<String> valoresPositivosNegativos(int[] valores) {
		int maiorNumero = Integer.MIN_VALUE;

		for (int valor : valores) {
			if (valor >= -9 && valor <= 9 && valor != 0) {
				if (valor > maiorNumero) {
					maiorNumero = valor;
				}
			}
		}

		if (maiorNumero == Integer.MIN_VALUE) {
			return new HashSet<>();
		}

		Set<String> resultado = new HashSet<>();
		resultado.add(Integer.toString(maiorNumero));
		return resultado;
	}

	@Override
	public Set<Integer> valoresDuplicadosOrdenados(List<Integer> valores1, List<Integer> valores2) {
		Set<Integer> set1 = new HashSet<>(valores1);
		Set<Integer> set2 = new HashSet<>(valores2);

		Set<Integer> interseccao = new TreeSet<>(set1);
		interseccao.retainAll(set2);

		return interseccao;
	}

	@Override
	public Set<Integer> valoresDiferentesOrdenados(List<Integer> valores1, List<Integer> valores2) {
		Set<Integer> set1 = new HashSet<>(valores1);
		Set<Integer> set2 = new HashSet<>(valores2);

		Set<Integer> resultado = new TreeSet<>(set1);

		resultado.addAll(set2);

		Set<Integer> interseccao = new HashSet<>(set1);
		interseccao.retainAll(set2);

		resultado.removeAll(interseccao);

		return resultado;
	}

	@Override
	public Set<Integer> valoresDuplicadosDaPrimeiraListaOrdenados(List<Integer> valores1, List<Integer> valores2) {
		Set<Integer> set1 = new HashSet<>(valores1);
		Set<Integer> set2 = new HashSet<>(valores2);

		Set<Integer> resultado = new TreeSet<>(set1);

		resultado.removeAll(set2);

		return resultado;

	}

	@Override
	public Set<Integer> valoresDiferentesDaSegundaListaOrdenados(List<Integer> valores1, List<Integer> valores2) {
		Set<Integer> set1 = new HashSet<>(valores1);
		Set<Integer> set2 = new HashSet<>(valores2);

		Set<Integer> resultado = new TreeSet<>(set2);

		resultado.removeAll(set1);

		return resultado;

	}

	@Override
	public Set<Funcionario> pessoasUnicasOrdenados(List<Funcionario> pessoas) {
		Set<Funcionario> pessoasUnicas = new TreeSet<>(Comparator.comparing(Funcionario::getNome));

		pessoasUnicas.addAll(pessoas);

		return pessoasUnicas;
	}

	@Override
	public Set<Funcionario> pessoasDuplicadosOrdenados(List<Funcionario> pessoas1, List<Funcionario> pessoas2) {
		Set<String> cpfsCnpjs1 = pessoas1.stream().map(Funcionario::getCpfCnpj).collect(Collectors.toSet());

		Set<String> cpfsCnpjs2 = pessoas2.stream().map(Funcionario::getCpfCnpj).collect(Collectors.toSet());

		Set<String> cpfsCnpjsDuplicados = new HashSet<>(cpfsCnpjs1);
		cpfsCnpjsDuplicados.retainAll(cpfsCnpjs2);

		Set<Funcionario> pessoasDuplicadas = pessoas1.stream().filter(f -> cpfsCnpjsDuplicados.contains(f.getCpfCnpj()))
				.collect(Collectors.toCollection(LinkedHashSet::new));

		pessoasDuplicadas.addAll(pessoas2.stream().filter(f -> cpfsCnpjsDuplicados.contains(f.getCpfCnpj()))
				.collect(Collectors.toCollection(LinkedHashSet::new)));

		return pessoasDuplicadas.stream().sorted(Comparator.comparing(Funcionario::getCpfCnpj))
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}

	@Override
	public Set<Funcionario> pessoasDiferentesOrdenados(List<Funcionario> pessoas1, List<Funcionario> pessoas2) {
		Set<String> cpfsCnpjs1 = pessoas1.stream().map(Funcionario::getCpfCnpj).collect(Collectors.toSet());

		Set<String> cpfsCnpjs2 = pessoas2.stream().map(Funcionario::getCpfCnpj).collect(Collectors.toSet());

		Set<String> cpfsCnpjsDiferentes = new HashSet<>(cpfsCnpjs1);
		cpfsCnpjsDiferentes.addAll(cpfsCnpjs2);
		Set<String> cpfsCnpjsDuplicados = new HashSet<>(cpfsCnpjs1);
		cpfsCnpjsDuplicados.retainAll(cpfsCnpjs2);

		cpfsCnpjsDiferentes.removeAll(cpfsCnpjsDuplicados);

		Set<Funcionario> pessoasDiferentes = pessoas1.stream().filter(f -> cpfsCnpjsDiferentes.contains(f.getCpfCnpj()))
				.collect(Collectors.toCollection(LinkedHashSet::new));

		pessoasDiferentes.addAll(pessoas2.stream().filter(f -> cpfsCnpjsDiferentes.contains(f.getCpfCnpj()))
				.collect(Collectors.toCollection(LinkedHashSet::new)));

		return pessoasDiferentes.stream().sorted(Comparator.comparing(Funcionario::getCpfCnpj))
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}

	@Override
	public Set<Funcionario> pessoasDuplicadosDaPrimeiraListaOrdenados(List<Funcionario> pessoas1,
			List<Funcionario> pessoas2) {
		Set<String> cpfsCnpjs2 = pessoas2.stream().map(Funcionario::getCpfCnpj).collect(Collectors.toSet());

		Set<Funcionario> pessoasDuplicadas = pessoas1.stream().filter(f -> cpfsCnpjs2.contains(f.getCpfCnpj()))
				.collect(Collectors.toCollection(LinkedHashSet::new));

		return pessoasDuplicadas.stream().sorted(Comparator.comparing(Funcionario::getCpfCnpj))
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}

	@Override
	public Set<Funcionario> pessoasDiferentesDaSegundaListaOrdenados(List<Funcionario> pessoas1,
			List<Funcionario> pessoas2) {

		Set<String> cpfsCnpjs2 = pessoas2.stream().map(Funcionario::getCpfCnpj).collect(Collectors.toSet());

		Set<Funcionario> pessoasDiferentes = pessoas1.stream().filter(f -> !cpfsCnpjs2.contains(f.getCpfCnpj()))
				.collect(Collectors.toCollection(LinkedHashSet::new));

		return pessoasDiferentes.stream().sorted(Comparator.comparing(Funcionario::getCpfCnpj))
				.collect(Collectors.toCollection(LinkedHashSet::new));
	}
}

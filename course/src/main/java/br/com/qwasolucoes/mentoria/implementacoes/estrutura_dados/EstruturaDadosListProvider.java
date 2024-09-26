package br.com.qwasolucoes.mentoria.implementacoes.estrutura_dados;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import br.com.qwasolucoes.mentoria.interfaces.estrutura_dados.EstruturaDadosList;
import br.com.qwasolucoes.mentoria.model.Funcionario;

public class EstruturaDadosListProvider implements EstruturaDadosList {

	@Override
	public List<String> nomes(List<Funcionario> pessoas) {
		return pessoas.stream()
                .map(Funcionario::getNome) 
                .filter(nome -> nome != null && !nome.isEmpty()) 
                .collect(Collectors.toList());
    }
	

	@Override
	public List<String> sobrenomes(List<Funcionario> pessoas) {
		return pessoas.stream()
                .map(Funcionario::getSobrenome) 
                .filter(sobrenome -> sobrenome != null && !sobrenome.isEmpty()) 
                .collect(Collectors.toList());
    }
	

	@Override
	public List<Integer> maiores18(List<Funcionario> pessoas) {
		 Calendar hoje = Calendar.getInstance();
	        return pessoas.stream()
	                .filter(funcionario -> funcionario.getDataNascimento() != null)
	                .filter(funcionario -> {
	                    Calendar dataNascimento = Calendar.getInstance();
	                    dataNascimento.setTime(funcionario.getDataNascimento());

	                    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
	                    if (hoje.get(Calendar.DAY_OF_YEAR) < dataNascimento.get(Calendar.DAY_OF_YEAR)) {
	                        idade--;
	                    }

	                    return idade >= 18;
	                })
	                .map(funcionario -> {
	                    Calendar dataNascimento = Calendar.getInstance();
	                    dataNascimento.setTime(funcionario.getDataNascimento());

	                    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
	                    if (hoje.get(Calendar.DAY_OF_YEAR) < dataNascimento.get(Calendar.DAY_OF_YEAR)) {
	                        idade--;
	                    }

	                    return idade;
	                })
	                .collect(Collectors.toList());
	    }
	

	@Override
	public List<Integer> menores18(List<Funcionario> pessoas) {
		 Calendar hoje = Calendar.getInstance();
	        return pessoas.stream()
	                .filter(funcionario -> funcionario.getDataNascimento() != null)
	                .filter(funcionario -> {
	                    Calendar dataNascimento = Calendar.getInstance();
	                    dataNascimento.setTime(funcionario.getDataNascimento());

	                    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
	                    if (hoje.get(Calendar.DAY_OF_YEAR) < dataNascimento.get(Calendar.DAY_OF_YEAR)) {
	                        idade--;
	                    }

	                    return idade < 18;
	                })
	                .map(funcionario -> {
	                    Calendar dataNascimento = Calendar.getInstance();
	                    dataNascimento.setTime(funcionario.getDataNascimento());

	                    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
	                    if (hoje.get(Calendar.DAY_OF_YEAR) < dataNascimento.get(Calendar.DAY_OF_YEAR)) {
	                        idade--;
	                    }

	                    return idade;
	                })
	                .collect(Collectors.toList());
	    }
	

	@Override
	public Integer pessoaMaisVelha(List<Funcionario> pessoas) {
		if (pessoas == null || pessoas.isEmpty()) {
			return null;
		}

		Optional<Date> dataNascimentoMaisAntiga = pessoas.stream().map(Funcionario::getDataNascimento)
				.filter(dataNascimento -> dataNascimento != null).min(Date::compareTo);

		return dataNascimentoMaisAntiga.map(dataNascimento -> {
			Calendar hoje = Calendar.getInstance();
			int anoAtual = hoje.get(Calendar.YEAR);

			Calendar dataNascimentoCalendar = Calendar.getInstance();
			dataNascimentoCalendar.setTime(dataNascimento);

			int idade = anoAtual - dataNascimentoCalendar.get(Calendar.YEAR);

			if (hoje.get(Calendar.DAY_OF_YEAR) < dataNascimentoCalendar.get(Calendar.DAY_OF_YEAR)) {
				idade--;
			}

			return idade;
		}).orElse(null);
	}

	@Override
	public Integer pessoaMaisNova(List<Funcionario> pessoas) {
		if (pessoas == null || pessoas.isEmpty()) {
		}

		Optional<Date> dataNascimentoMaisRecente = pessoas.stream().map(Funcionario::getDataNascimento)
				.filter(dataNascimento -> dataNascimento != null).max(Date::compareTo);
		return dataNascimentoMaisRecente.map(dataNascimento -> {
			Calendar hoje = Calendar.getInstance();
			int anoAtual = hoje.get(Calendar.YEAR);

			Calendar dataNascimentoCalendar = Calendar.getInstance();
			dataNascimentoCalendar.setTime(dataNascimento);

			int idade = anoAtual - dataNascimentoCalendar.get(Calendar.YEAR);

			if (hoje.get(Calendar.DAY_OF_YEAR) < dataNascimentoCalendar.get(Calendar.DAY_OF_YEAR)) {
				idade--;
			}

			return idade;
		}).orElse(null);
	}

	@Override
	public BigDecimal maiorSalario(List<Funcionario> pessoas) {
		if (pessoas == null || pessoas.isEmpty()) {
			return BigDecimal.ZERO;
		}

		return pessoas.stream().map(Funcionario::getSalario).filter(salario -> salario != null)
				.max(BigDecimal::compareTo).orElse(BigDecimal.ZERO);
	}

	@Override
	public BigDecimal menorTaxa(List<Funcionario> pessoas) {
		if (pessoas == null || pessoas.isEmpty()) {
			return BigDecimal.ZERO;
		}

		return pessoas.stream().map(Funcionario::getTaxa).filter(taxa -> taxa != null).min(BigDecimal::compareTo)
				.orElse(BigDecimal.ZERO);
	}

	@Override
	public String nomePrimeiraPessoa(List<Funcionario> pessoas) {
		if (pessoas == null || pessoas.isEmpty()) {
			return "";
		}
		Funcionario primeiraPessoa = pessoas.get(0);
		return primeiraPessoa.getNome();
	}

	@Override
	public String nomeUltimaPessoa(List<Funcionario> pessoas) {
		if (pessoas == null || pessoas.isEmpty()) {
			return "";
		}
		Funcionario ultimaPessoa = pessoas.get(pessoas.size() - 1);
		return ultimaPessoa.getNome();
	}

	@Override
	public String maiorNome(List<Funcionario> pessoas) {
		return pessoas.stream().map(Funcionario::getNome).filter(nome -> nome != null && !nome.isEmpty())
				.max((nome1, nome2) -> Integer.compare(nome1.length(), nome2.length())).orElse("");
	}

	@Override
	public String maiorNomeCompleto(List<Funcionario> pessoas) {
		return pessoas.stream().map(Funcionario::getNome)
				.max((nome1, nome2) -> Integer.compare(nome1.length(), nome2.length())).orElse("");
	}

	@Override
	public Integer quantidadePessoasSexoMasculino(List<Funcionario> pessoas) {
		return (int) pessoas.stream().filter(funcionario -> "Masculino".equalsIgnoreCase(funcionario.getSexo()))
				.count();
	}

	@Override
	public List<BigDecimal> maioresSalariosPeloValor(List<Funcionario> pessoas, BigDecimal valor) {
		return pessoas.stream().map(Funcionario::getSalario).filter(salario -> salario.compareTo(valor) > 0)
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
}

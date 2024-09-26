package br.com.qwasolucoes.mentoria.implementacoes.relacionamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import br.com.qwasolucoes.mentoria.interfaces.relacionamento.Relacionamentos;
import br.com.qwasolucoes.mentoria.modelagem_dados.Contato;
import br.com.qwasolucoes.mentoria.modelagem_dados.Empresa;
import br.com.qwasolucoes.mentoria.modelagem_dados.Endereco;
import br.com.qwasolucoes.mentoria.modelagem_dados.Escolaridade;
import br.com.qwasolucoes.mentoria.modelagem_dados.InstituicaoEnsino;
import br.com.qwasolucoes.mentoria.modelagem_dados.Pessoa;
import br.com.qwasolucoes.mentoria.modelagem_dados.Profissao;
import br.com.qwasolucoes.mentoria.modelagem_dados.TipoContato;
import br.com.qwasolucoes.mentoria.modelagem_dados.TipoEndereco;

public class RelacionamentoProvider implements Relacionamentos {

	public List<Pessoa> trazPessoas() {
		String caminhoBase = "br/com/qwasolucoes/mentoria/modelagem_dados/";

		List<Contato> contatos = LerCsv.lerArquivo(caminhoBase + "Contato.csv", TranformarCsv.CONTATO_MAPPER);
		List<Pessoa> pessoas = LerCsv.lerArquivo(caminhoBase + "Pessoa.csv", TranformarCsv.PESSOA_MAPPER);
		List<Empresa> empresas = LerCsv.lerArquivo(caminhoBase + "Empresa.csv", TranformarCsv.EMPRESA_MAPPER);
		List<Endereco> endereco = LerCsv.lerArquivo(caminhoBase + "Endereco.csv", TranformarCsv.ENDERECO_MAPPER);
		List<Escolaridade> escolaridade = LerCsv.lerArquivo(caminhoBase + "Escolaridade.csv",TranformarCsv.ESCOLARIDADE_MAPPER);
		List<Profissao> profissao = LerCsv.lerArquivo(caminhoBase + "Profissao.csv", TranformarCsv.PROFISSAO_MAPPER);
		List<InstituicaoEnsino> instituicao = LerCsv.lerArquivo(caminhoBase + "InstituicaoEnsino.csv",
				TranformarCsv.INSTITUICAO_ENSINO_MAPPER);

		List<Contato> contatosPessoa = new ArrayList<>();

		for (Pessoa pessoaV : pessoas) {
			List<Endereco> enderecoPessoa = new ArrayList<>();
			List<Escolaridade> escolaridadePessoa = new ArrayList<>();
			List<Profissao> profissaoPessoa = new ArrayList<>();
			List<InstituicaoEnsino> instituicaoPessoa = new ArrayList<>();

			for (Contato contatosV : contatos) {
				if (pessoaV.getCpf().equals(contatosV.getCpf())) {
					contatosPessoa.add(contatosV);
				}
				pessoaV.setContatos(contatosPessoa);
			}

			for (Empresa empresaV : empresas) {
				if (pessoaV.getCpf().equals(empresaV.getCpf())) {
					pessoaV.setEmpresa(empresaV);
				}
			}
			for (Endereco enderecoV : endereco) {
				if (pessoaV.getCpf().equals(enderecoV.getCpf())) {
					enderecoPessoa.add(enderecoV);
				}
				pessoaV.setEnderecos(enderecoPessoa);
			}

			for (Escolaridade escolaridadeV : escolaridade) {

				if (pessoaV.getCpf().equals(escolaridadeV.getCpf())) {
					escolaridadePessoa.add(escolaridadeV);

					for (Profissao profissaoV : profissao) {
						if (escolaridadeV.getCodigo().equals(profissaoV.getCodigo())) {
							profissaoPessoa.add(profissaoV);
						}
					}

					for (InstituicaoEnsino intituicao : instituicao) {
						if (escolaridadeV.getCodigo().equals(intituicao.getCodigo())) {
							instituicaoPessoa.add(intituicao);
						}
					}
					pessoaV.setFormacoes(escolaridadePessoa);
					pessoaV.setInstituicao(instituicaoPessoa);
					pessoaV.setProfissao(profissaoPessoa);
					pessoaV.setFormacoes(escolaridadePessoa);
				}

			}

		}

		return pessoas;

	}

	@Override
	public void iniciar() {
//	trazPessoas();
//		buscarCPFsDasPessoasMaioresIdade();
//		buscarNomeSobrenomeDasPessoasPorAnorNascimento(1999);
//		buscarNomeSobrenomeDasPessoasPorEstadoCivil("Solteiro");
//		buscarPessoasPorTipoResidencia("P");
//		buscarPessoasPorTipoContato("3");
//		buscarPessoasPorBairro("Bairro 123");
//		buscarPessoasPorNomeBairroContem("Bairro 123");
//		buscarPessoasPorEstado("mg");
//		buscarPessoasPorProfissao("Analista de Sistema");
//		String valor = "a";
//		buscarPessoasPorProfissaoNomeAreaAtuacaoContem(valor);
// 		Converte valores para bigDecimal
//		buscarPessoasPorSalarioBaseMaiorQue(new BigDecimal("15000.00"));
//		buscarPessoasPorSalarioBaseMaiorIgual(new BigDecimal("15000.00"));
//		BigDecimal salarioInicio = (new BigDecimal("1.00000"));
//		BigDecimal salarioFim = (new BigDecimal("16000.00"));
//		buscarPessoasPorSalarioBaseEntre(salarioInicio, salarioFim);
		// buscarPessoasPorEscolaridadeConcluida();
//		String areaAtuacao = "Tecnologia da Informacao";
//		buscarPessoasPorEscolaridadeAreaAtuacao("Tecnologia da Informacao"); 
//		Integer ano = 2025;
//		buscarPessoasPorEscolaridadeAnoTermino(ano);
//		Integer semestre = 7;
//		buscarPessoasPorEscolaridadeQuantidadeSemestre(semestre);
//		String areaAtuacao = "Tecnologia da Informacao";
//		buscarPessoasPorProfissaoAreaAtuacaoEscolaridadeConcluido(areaAtuacao);
//		String areaAtuacao = "Tecnologia da Informacao";
//		Integer semestre = 5;
//		buscarPessoasPorProfissaoAreaAtuacaoEscolaridadePorSemestre(areaAtuacao, semestre);
//		String estadoCivil = "SOLTEIRO";
//		String areaAtuacaoProfissao = "Tecnologia da Informacao";
//		String areaAtuacaoEscolaridade = "Tecnologia da Informacao";
//		buscarPessoasPorEstadoCivilProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(estadoCivil, areaAtuacaoProfissao,areaAtuacaoEscolaridade);
//		buscarEnderecoDasPessoasMaioresIdadeEEstadoCivil( "SOLTEIRO");
//		buscarEnderecoPorTipoEndereco("R");
//		buscarNomeRuaEnderecoPorCidadePorPessoaSexoConjungeComAnoNascimento("Sao Paulo", "F", 2002);
//		buscarNomeDoConjungeDasPessoasMaioresIdadeEEstadoCivil("CASADO");
		List<String> estadosCivil = new ArrayList<>();
		estadosCivil.add("CASADO");
		buscarNomeDoConjungeDasPessoasPorEstadoCivil(estadosCivil);
//		buscarNomeDoConjungeMaioresDeIdadeDasPessoasPorEstadoCivil("SOLTEIRO");
//		buscarContatoPorProfissaoAreaAtuacao("Tecnologia da Informacao");
//		buscarContatoPorProfissaoAreaAtuacaoEnderecoPorEstadoEBairro("Tecnologia da Informacao", "SP","Bairro ABC");
//		List<String> estados = List.of("SP", "RJ");
//      buscarContatoPorProfissaoAreaAtuacaoEnderecoPorEstadosEBairro("Tecnologia da Informacao", estados, "Bairro ABC");	
//		buscarContatoPorTipoContato("1");
//		List<String> tipoContato = List.of("3", "1");
//		buscarContatoPorTiposContato( tipoContato);
//		buscarEmailPorPessoaAnoNascimentoProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(1999,"Tecnologia da Informacao", "Tecnologia da Informacao");
//		buscarNomeInstituicaoPorPorAreaAtuacao("Tecnologia da Informacao");
//		buscarNomePessoasPorProfissaoPorAreaAtuacao("Tecnologia da Informacao");
//		buscarNomePessoasPorEscolaridadePorAreaAtuacao("Tecnologia da Informacao");
//		buscarQuantidadeTotalPessoasPorProfissaoPorAreaAtuacao("Medicina");
//		buscarQuantidadeTotalPessoasPorEscolaridadePorAreaAtuacao("Medicina");
//		buscarQuantidadeTotalPessoasMaioresIdade();
//		buscarQuantidadeTotalDasPessoasPorEstadoCivil("SOLTEIRO");
//		buscarQuantidadeTotalPessoasPorBairro("Bairro 123");
//		buscarQuantidadeTotalPessoasPorProfissao("Cirurgiao Geral");
//		buscarQuantidadeTotalPessoasPorSalarioBaseMaiorIgual(new BigDecimal("15000.00"));
//		buscarQuantidadeTotalPessoasPorEscolaridadeAreaAtuacao("Medicina");
//		buscarQuantidadeTotalPessoasPorEscolaridadeQuantidadeSemestre(6);
//		buscarQuantidadeTotalPessoasPorProfissaoAreaAtuacaoEscolaridadePorSemestre("Tecnologia da Informacao", 8);
		// buscarQuantidadeTotalEmailPorPessoaAnoNascimentoProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(1999,"Tecnologia
		// da Informacao", "Tecnologia da Informacao");
//		buscarQuantidadeTotalConjugeDasPessoasMaioresIdadeEEstadoCivil("SOLTEIRO");
//		buscarQuantidadeTotalContatosPorTipoContato("1"); 
//		buscarQuantidadeTotalPessoasPorEscolaridadeNaoConcluida();
//		buscarQuantidadeTotalPessoasPorBairroPorProfissaoPorAreaAtuacao("Bairro ABC", "Tecnologia da Informacao");
//		List<String> tipoContato = List.of("3", "1");
//		buscarQuantidadeTotalContatoPorTiposContato(tipoContato);
	}

	@Override
	public List<String> buscarCPFsDasPessoasMaioresIdade() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada;
		int idade = 0;
		List<Pessoa> pessoas = trazPessoas();
		List<String> cpfPessoasMaiores = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			pessoa.getDataNascimento();
			try {
				dataFormatada = LocalDate.parse(pessoa.getDataNascimento(), formato);
				idade = Period.between(dataFormatada, LocalDate.now()).getYears();
			} catch (Exception e) {
			}
			if (idade >= 18) {
				cpfPessoasMaiores.add(pessoa.getCpf());
			}
		}
		return cpfPessoasMaiores;

	}

	@Override
	public List<String> buscarNomeSobrenomeDasPessoasPorAnorNascimento(Integer ano) {
		List<Pessoa> pessoas = trazPessoas();
		List<String> nomesCompletos = new ArrayList<>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for (Pessoa pessoa : pessoas) {
			try {
				LocalDate dataNascimento = LocalDate.parse(pessoa.getDataNascimento(), formato);
				int anoNascimento = dataNascimento.getYear();
				if (anoNascimento == ano) {
					String nomeCompleto = pessoa.getNome() + " " + pessoa.getSobrenome();
					nomesCompletos.add(nomeCompleto);
				}
			} catch (Exception e) {
			}
		}
		return nomesCompletos;
	}

	@Override
	public List<String> buscarNomeSobrenomeDasPessoasPorEstadoCivil(String estadoCivil) {
		List<Pessoa> pessoas = trazPessoas();
		List<String> nomesCompletos = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			try {
				if (pessoa.getEstadoCivil().equalsIgnoreCase(estadoCivil)) {
					String nomeCompleto = pessoa.getNome() + " " + pessoa.getSobrenome();
					nomesCompletos.add(nomeCompleto);
				}
			} catch (Exception e) {
			}
		}

		return nomesCompletos;
	}

	@Override
	public List<Pessoa> buscarPessoasPorTipoResidencia(String tipoResidencia) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> tiposEndereco = new ArrayList<>();
		TipoEndereco tipoEndereco = TipoEndereco.fromString(tipoResidencia);
		for (Pessoa pessoa : pessoas) {
			try {
				for (Endereco endereco : pessoa.getEnderecos()) {
					if (endereco.getTipoEndereco().equals(tipoEndereco)) {
						tiposEndereco.add(pessoa);
					}
				}
			} catch (Exception e) {
			}
		}
		return tiposEndereco;
	}

	@Override
	public List<Pessoa> buscarPessoasPorTipoContato(String tipoContato) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> pessoasContatos = new ArrayList<>();

		int valorContato = Integer.parseInt(tipoContato);
		try {
			TipoContato tipoContatos = TipoContato.fromValor(valorContato);
			for (Pessoa pessoa : pessoas) {
				for (Contato contato : pessoa.getContatos()) {
					if (contato.getTipo().equals(tipoContatos)) {
						pessoasContatos.add(pessoa);
					}
				}
			}
		} catch (Exception e) {
		}
		return pessoasContatos;
	}

	@Override
	public List<Pessoa> buscarPessoasPorBairro(String bairro) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> pessoasBairro = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Endereco endereco : pessoa.getEnderecos()) {
				if (endereco.getBairro() != null && endereco.getBairro().contains(bairro)) {
					pessoasBairro.add(pessoa);
				}
			}
		}

		return pessoasBairro;
	}

	@Override
	public List<Pessoa> buscarPessoasPorNomeBairroContem(String valor) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> nomeBairro = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			for (Endereco endereco : pessoa.getEnderecos()) {
				if (endereco.getBairro() != null && endereco.getBairro().contains(valor)) {
					nomeBairro.add(pessoa);
				}
			}
		}
		return nomeBairro;
	}

	@Override
	public List<Pessoa> buscarPessoasPorEstado(String estado) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> pessoaEstado = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Endereco endereco : pessoa.getEnderecos()) {
				if (endereco.getEstado() != null && endereco.getEstado().equalsIgnoreCase(estado)) {
					pessoaEstado.add(pessoa);
				}
			}
		}
		return pessoaEstado;
	}

	@Override
	public List<Pessoa> buscarPessoasPorProfissao(String nomeProfissao) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> buscarProfissao = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getNome().equalsIgnoreCase(nomeProfissao)) {
					buscarProfissao.add(pessoa);
				}
			}
		}
		return buscarProfissao;
	}

	@Override
	public List<Pessoa> buscarPessoasPorProfissaoNomeAreaAtuacaoContem(String valor) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> buscarProfissao = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getAreaDeAtuacao().contains(valor)) {
					buscarProfissao.add(pessoa);
				}
			}
		}
		return buscarProfissao;
	}

	@Override
	public List<Pessoa> buscarPessoasPorSalarioBaseMaiorQue(BigDecimal salarioBase) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> pessoasSalario = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissoes : pessoa.getProfissao()) {
				if (profissoes.getSalarioBase().compareTo(salarioBase) > 0) {
					pessoasSalario.add(pessoa);
				}
			}
		}
		return pessoasSalario;

	}

	@Override
	public List<Pessoa> buscarPessoasPorSalarioBaseMaiorIgual(BigDecimal salarioBase) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> resultado = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getSalarioBase().compareTo(salarioBase) >= 0) {
					resultado.add(pessoa);
				}
			}
		}
		return resultado;
	}

	@Override
	public List<Pessoa> buscarPessoasPorSalarioBaseEntre(BigDecimal salarioBaseInicio, BigDecimal salarioBaseFim) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> salarioBaseEntre = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getSalarioBase().compareTo(salarioBaseInicio) >= 0
						&& profissao.getSalarioBase().compareTo(salarioBaseFim) <= 0) {
					salarioBaseEntre.add(pessoa);
				}
			}
		}
		return salarioBaseEntre;
	}

	@Override
	public List<Pessoa> buscarPessoasPorEscolaridadeConcluida() {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> escolaridadeConcluida = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			for (Escolaridade escolaridade : pessoa.getFormacoes()) {
				if (escolaridade.isConcluido()) {
					escolaridadeConcluida.add(pessoa);
				}
			}
		}
		return escolaridadeConcluida;
	}

	@Override
	public List<Pessoa> buscarPessoasPorEscolaridadeAreaAtuacao(String areaAtuacao) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> pessoasPorAreaAtuacao = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Escolaridade escolaridade : pessoa.getFormacoes()) {
				for (InstituicaoEnsino instituicao : pessoa.getInstituicao()) {
					if (escolaridade.getCodigo().equals(instituicao.getCodigo())
							&& instituicao.getAreaDeAtuacao().equals(areaAtuacao)) {
						pessoasPorAreaAtuacao.add(pessoa);
					}

				}

			}

		}
		return pessoasPorAreaAtuacao;
	}

	@Override
	public List<Pessoa> buscarPessoasPorEscolaridadeAnoTermino(Integer ano) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> anoTermino = new ArrayList<>();
		if (ano == null) {
			return anoTermino;
		}
		for (Pessoa pessoa : pessoas) {
			boolean deveAdicionar = false;
			for (Escolaridade escola : pessoa.getFormacoes()) {
				if (escola != null && escola.getDataTermino() != null) {
					int anoTerminoEscola = escola.getDataTermino().getYear();
					if (anoTerminoEscola == ano) {
						deveAdicionar = true;
						break;
					}
				}
			}
			if (deveAdicionar) {
				anoTermino.add(pessoa);
			}
		}
		return anoTermino;
	}

	@Override
	public List<Pessoa> buscarPessoasPorEscolaridadeQuantidadeSemestre(Integer semestre) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> quantidadeSemestre = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getFormacoes() == null) {
				continue;
			}
			for (Escolaridade escolaridade : pessoa.getFormacoes()) {
				if (escolaridade != null && escolaridade.getSemestreAtual() != null) {
					if (escolaridade.getSemestreAtual().equals(semestre.toString())) {
						quantidadeSemestre.add(pessoa);
					}
				}
			}
		}
		return quantidadeSemestre;
	}

	@Override
	public List<Pessoa> buscarPessoasPorProfissaoAreaAtuacaoEscolaridadeConcluido(String areaAtuacao) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> areaAtuacaoEscolaridadeConcluido = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			boolean temProfissaoNaArea = false;
			boolean temEscolaridadeConcluida = false;
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getAreaDeAtuacao().equalsIgnoreCase(areaAtuacao)) {
					temProfissaoNaArea = true;
					break;
				}
			}
			if (temProfissaoNaArea) {
				for (Escolaridade escolaridade : pessoa.getFormacoes()) {
					if (escolaridade.isConcluido()) {
						temEscolaridadeConcluida = true;
						break;
					}
				}
			}

			if (temProfissaoNaArea && temEscolaridadeConcluida) {
				areaAtuacaoEscolaridadeConcluido.add(pessoa);
			}
		}
		return areaAtuacaoEscolaridadeConcluido;
	}

	@Override
	public List<Pessoa> buscarPessoasPorProfissaoAreaAtuacaoEscolaridadePorSemestre(String areaAtuacao,
			Integer semestre) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> resultado = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			boolean temProfissaoNaArea = false;
			boolean temEscolaridadeNoSemestre = false;
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getAreaDeAtuacao().equalsIgnoreCase(areaAtuacao)) {
					temProfissaoNaArea = true;
					break;
				}
			}
			if (temProfissaoNaArea) {
				for (Escolaridade escolaridade : pessoa.getFormacoes()) {
					if (escolaridade.isConcluido()) {
						try {
							if (escolaridade.getSemestreAtual() != null
									&& !escolaridade.getSemestreAtual().trim().isEmpty()) {
								int semestreAtual = Integer.parseInt(escolaridade.getSemestreAtual().trim());
								if (semestreAtual == semestre) {
									temEscolaridadeNoSemestre = true;
									break;
								}
							}
						} catch (Exception e) {
						}
					}
				}
			}
			if (temProfissaoNaArea && temEscolaridadeNoSemestre) {
				resultado.add(pessoa);
			}
		}
		return resultado;
	}

	@Override
	public List<Pessoa> buscarPessoasPorEstadoCivilProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(String estadoCivil,
			String areaAtuacaoProfissao, String areaAtuacaoEscolaridade) {
		List<Pessoa> pessoas = trazPessoas();
		List<Pessoa> resultado = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			boolean estadostadoCivil = (estadoCivil == null || pessoa.getEstadoCivil().equals(estadoCivil));
			boolean profissao = false;
			if (areaAtuacaoProfissao != null) {
				if (pessoa.getProfissao() != null) {
					for (Profissao p : pessoa.getProfissao()) {
						if (p.getAreaDeAtuacao().equals(areaAtuacaoProfissao)) {
							profissao = true;
							break;
						}
					}
				}
			} else {
				profissao = true;
			}
			boolean escolaridade = false;
			if (areaAtuacaoEscolaridade != null) {
				if (pessoa.getFormacoes() != null) {
					for (Escolaridade e : pessoa.getFormacoes()) {
						if (e.getCodigo() != null && !e.getCodigo().isEmpty()) {
							escolaridade = true;
							break;
						}
					}
				}
			} else {
				escolaridade = true;
			}
			if (estadostadoCivil && profissao && escolaridade) {
				resultado.add(pessoa);
			}
		}
		return resultado;
	}

	@Override
	public List<Endereco> buscarEnderecoDasPessoasMaioresIdadeEEstadoCivil(String estadoCivil) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada;
		int idade;
		List<Pessoa> pessoas = trazPessoas();
		List<Endereco> enderecoMaioresEstadoCivil = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			try {
				dataFormatada = LocalDate.parse(pessoa.getDataNascimento(), formato);
				idade = Period.between(dataFormatada, LocalDate.now()).getYears();

				if (idade >= 18 && pessoa.getEstadoCivil().equals(estadoCivil)) {
					if (pessoa.getEnderecos() != null) {
						enderecoMaioresEstadoCivil.addAll(pessoa.getEnderecos());
					}
				}
			} catch (Exception e) {
			}
		}
		return enderecoMaioresEstadoCivil;
	}

	@Override
	public List<Endereco> buscarEnderecoPorTipoEndereco(String tipoEndereco) {
		List<Pessoa> pessoas = trazPessoas();
		List<Endereco> enderecoMaioresEstadoCivil = new ArrayList<>();
		TipoEndereco tipo = TipoEndereco.fromString(tipoEndereco);
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getEnderecos() != null) {
				for (Endereco endereco : pessoa.getEnderecos()) {
					if (endereco.getTipoEndereco() == tipo) {
						enderecoMaioresEstadoCivil.add(endereco);
					}
				}
			}
		}
		return enderecoMaioresEstadoCivil;
	}

	public Integer obterAnoNascimento(Pessoa pessoa, DateTimeFormatter formato) {
		String dataNascimento = pessoa.getDataNascimento();
		if (dataNascimento != null && !dataNascimento.isEmpty()) {
			try {
				LocalDate data = LocalDate.parse(dataNascimento, formato);
				return data.getYear();
			} catch (DateTimeParseException e) {
				System.out.println("error ao informar data de nascimento: " + e.getMessage());
			}
		}
		return null;
	}

	@Override
	public List<Endereco> buscarNomeRuaEnderecoPorCidadePorPessoaSexoConjungeComAnoNascimento(String cidade,
			String sexo, Integer anoNascimentoConjunge) {
		List<Pessoa> pessoas = trazPessoas();
		List<Endereco> enderecosFiltrados = new ArrayList<>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getSexo() != null && pessoa.getSexo().equalsIgnoreCase(sexo)) {
				Integer anoNascimentoPessoaAtual = obterAnoNascimento(pessoa, formato);
				if (anoNascimentoPessoaAtual != null && anoNascimentoPessoaAtual.equals(anoNascimentoConjunge)) {
					if (pessoa.getEnderecos() != null) {
						for (Endereco endereco : pessoa.getEnderecos()) {
							if (endereco.getCidade() != null && endereco.getCidade().equalsIgnoreCase(cidade)) {
								enderecosFiltrados.add(endereco);
							}
						}
					}
				}
			}
		}
		return enderecosFiltrados;
	}

	@Override
	public List<String> buscarNomeDoConjungeDasPessoasMaioresIdadeEEstadoCivil(String estadoCivil) {
		List<Pessoa> pessoas = trazPessoas();
		List<String> resultado = new ArrayList<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hoje = LocalDate.now();

		for (Pessoa pessoa : pessoas) {
			LocalDate dataNascimento = LocalDate.parse(pessoa.getDataNascimento(), formatter);
			int idade = Period.between(dataNascimento, hoje).getYears();
			if (idade >= 18 && estadoCivil.equals(pessoa.getEstadoCivil())) {
				String conjuge = pessoa.getConjuge();
				if (conjuge != null && !conjuge.isEmpty()) {
					resultado.add(conjuge);
				}
			}
		}
		return resultado;
	}

	@Override
	public List<String> buscarNomeDoConjungeDasPessoasPorEstadoCivil(List<String> estadoCivil) {
		List<Pessoa> pessoas = trazPessoas();
		List<String> resultado = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			if (estadoCivil.contains(pessoa.getEstadoCivil())) {
				String conjuge = pessoa.getConjuge();
				if (conjuge != null && !conjuge.isEmpty()) {
					resultado.add(conjuge);
				}
			}
		}
		return resultado;
	}

	@Override
	public List<String> buscarNomeDoConjungeMaioresDeIdadeDasPessoasPorEstadoCivil(String estadoCivil) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataFormatada;
		int idade;
		List<Pessoa> pessoas = trazPessoas();
		List<String> nomesMaioresEstadoCivil = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			try {
				dataFormatada = LocalDate.parse(pessoa.getDataNascimento(), formato);
				idade = Period.between(dataFormatada, LocalDate.now()).getYears();
				if (idade >= 18 && pessoa.getEstadoCivil().equals(estadoCivil)) {
					nomesMaioresEstadoCivil.add(pessoa.getNome());
				}
			} catch (Exception e) {
			}
		}
		return nomesMaioresEstadoCivil;
	}

	@Override
	public List<Contato> buscarContatoPorProfissaoAreaAtuacao(String areaAtuacao) {
		List<Pessoa> pessoas = trazPessoas();
		List<Contato> contatosPorAreaAtuacao = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getProfissao() != null) {
				for (Profissao profissao : pessoa.getProfissao()) {
					if (areaAtuacao != null && areaAtuacao.equals(profissao.getAreaDeAtuacao())) {
						if (pessoa.getContatos() != null) {
							contatosPorAreaAtuacao.addAll(pessoa.getContatos());
						}
						break;
					}
				}
			}
		}
		return contatosPorAreaAtuacao;
	}

	@Override
	public List<Contato> buscarContatoPorProfissaoAreaAtuacaoEnderecoPorEstadoEBairro(String areaAtuacao, String estado,
			String bairro) {
		List<Pessoa> pessoas = trazPessoas();
		List<Contato> contatosPorFiltro = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			boolean correspondeProfissao = false;
			boolean correspondeEndereco = false;
			if (areaAtuacao != null && pessoa.getProfissao() != null) {
				for (Profissao profissao : pessoa.getProfissao()) {
					if (areaAtuacao.equals(profissao.getAreaDeAtuacao())) {
						correspondeProfissao = true;
						break;
					}
				}
			} else {
				correspondeProfissao = true;
			}
			if (pessoa.getEnderecos() != null) {
				for (Endereco endereco : pessoa.getEnderecos()) {
					if ((estado == null || estado.equals(endereco.getEstado()))
							&& (bairro == null || bairro.equals(endereco.getBairro()))) {
						correspondeEndereco = true;
						break;
					}
				}
			} else {
				correspondeEndereco = false;
			}
			if (correspondeProfissao && correspondeEndereco) {
				if (pessoa.getContatos() != null) {
					contatosPorFiltro.addAll(pessoa.getContatos());
				}
			}
		}
		return contatosPorFiltro;
	}

	@Override
	public List<Contato> buscarContatoPorProfissaoAreaAtuacaoEnderecoPorEstadosEBairro(String areaAtuacao,
			List<String> estados, String bairro) {
		List<Pessoa> pessoas = trazPessoas();
		List<Contato> contatosFiltrados = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissao : pessoa.getProfissao()) {
				if (areaAtuacao.equalsIgnoreCase(profissao.getAreaDeAtuacao())) {
					for (Endereco endereco : pessoa.getEnderecos()) {
						if (estados.contains(endereco.getEstado()) && bairro.equalsIgnoreCase(endereco.getBairro())) {
							contatosFiltrados.addAll(pessoa.getContatos());
							break;
						}
					}
					break;
				}
			}
		}
		return contatosFiltrados;
	}

	@Override
	public List<Contato> buscarContatoPorTipoContato(String tipoContato) {

		List<Pessoa> pessoas = trazPessoas();
		List<Contato> pessoasContatos = new ArrayList<>();
		try {
			int valorContato = Integer.parseInt(tipoContato);
			TipoContato tipoContatos = TipoContato.fromValor(valorContato);
			for (Pessoa pessoa : pessoas) {
				for (Contato contato : pessoa.getContatos()) {
					if (contato.getTipo().equals(tipoContatos)) {
						pessoasContatos.add(contato);
					}
				}
			}
		} catch (Exception e) {
		}
		return pessoasContatos;
	}

	@Override
	public List<Contato> buscarContatoPorTiposContato(List<String> tipoContato) {
		List<Pessoa> pessoas = trazPessoas();
		List<Contato> pessoasContatos = new ArrayList<>();
		try {
			for (String tipo : tipoContato) {
				int valorContato = Integer.parseInt(tipo);
				TipoContato tipoContatos = TipoContato.fromValor(valorContato);
				for (Pessoa pessoa : pessoas) {
					for (Contato contato : pessoa.getContatos()) {
						if (contato.getTipo().equals(tipoContatos)) {
							pessoasContatos.add(contato);
						}
					}
				}
			}
		} catch (Exception e) {
		}
		return pessoasContatos;
	}

	@Override
	public List<String> buscarEmailPorPessoaAnoNascimentoProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(
			Integer anoNasicmento, String areaAtuacaoProfissao, String areaAtuacaoEscolaridade) {
		List<Pessoa> pessoas = trazPessoas();
		List<String> emails = new ArrayList<>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for (Pessoa pessoa : pessoas) {
			try {
				LocalDate dataNascimento = LocalDate.parse(pessoa.getDataNascimento(), formato);
				int anoNascimentoPessoa = dataNascimento.getYear();
				if (!anoNasicmento.equals(anoNascimentoPessoa)) {
					continue;
				}
				boolean profissaoValida = false;
				if (pessoa.getProfissao() != null) {
					for (Profissao profissao : pessoa.getProfissao()) {
						if (areaAtuacaoProfissao != null && areaAtuacaoProfissao.equals(profissao.getAreaDeAtuacao())) {
							profissaoValida = true;
							break;
						}
					}
					if (!profissaoValida) {
						continue;
					}
				} else {
					continue;
				}
				boolean escolaridadeIsTrue = false;
				if (areaAtuacaoEscolaridade != null) {
					if (pessoa.getFormacoes() != null) {
						for (Escolaridade escolaridade : pessoa.getFormacoes()) {
							if (escolaridade.getCodigo() != null && !escolaridade.getCodigo().isEmpty()) {
								escolaridadeIsTrue = true;
								break;
							}
						}
					}
					if (!escolaridadeIsTrue) {
						continue;
					}
				} else {
					continue;
				}
				if (pessoa.getContatos() != null) {
					for (Contato contato : pessoa.getContatos()) {
						if (TipoContato.EMAIL.equals(contato.getTipo())) {
							emails.add(contato.getValor());
						}
					}
				}
			} catch (Exception e) {
			}
		}
		return emails;
	}

	@Override
	public List<String> buscarNomeInstituicaoPorPorAreaAtuacao(String areaAtuacaoProfissao) {
		List<Pessoa> pessoas = trazPessoas();
		List<String> resultado = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			for (Escolaridade escolaridade : pessoa.getFormacoes()) {
				for (InstituicaoEnsino instituicao : pessoa.getInstituicao()) {
					if (escolaridade.getCodigo().equals(instituicao.getCodigo())
							&& instituicao.getAreaDeAtuacao().equals(areaAtuacaoProfissao)) {
						resultado.add(instituicao.getNome());
					}
				}
			}
		}
		return resultado;

	}

	@Override
	public List<String> buscarNomePessoasPorProfissaoPorAreaAtuacao(String areaAtuacaoProfissao) {

		List<Pessoa> pessoas = trazPessoas();
		List<String> nomes = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getAreaDeAtuacao().equalsIgnoreCase(areaAtuacaoProfissao)) {
					nomes.add(pessoa.getNome());
				}
			}
		}
		return nomes;
	}

	@Override
	public List<String> buscarNomePessoasPorEscolaridadePorAreaAtuacao(String areaAtuacaoEscolaridade) {
		List<Pessoa> pessoas = trazPessoas();
		List<String> resultado = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			for (Escolaridade escolaridade : pessoa.getFormacoes()) {
				for (InstituicaoEnsino instituicao : pessoa.getInstituicao()) {
					if (escolaridade.getCodigo().equals(instituicao.getCodigo())
							&& instituicao.getAreaDeAtuacao().equals(areaAtuacaoEscolaridade)) {
						resultado.add(pessoa.getNome());
					}
				}
			}
		}
		return resultado;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorProfissaoPorAreaAtuacao(String areaAtuacaoProfissao) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeTotalPessoasProfissoes = 0;

		for (Pessoa pessoa : pessoas) {
			for (InstituicaoEnsino instituicao : pessoa.getInstituicao()) {
				if (instituicao.getAreaDeAtuacao().equals(areaAtuacaoProfissao)
						&& instituicao.getAreaDeAtuacao().equals(areaAtuacaoProfissao)) {
					quantidadeTotalPessoasProfissoes++;
				}
			}
		}

		return quantidadeTotalPessoasProfissoes;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorEscolaridadePorAreaAtuacao(String areaAtuacaoEscolaridade) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeTotalPessoasEscolaridade = 0;

		for (Pessoa pessoa : pessoas) {
			for (Escolaridade escolaridade : pessoa.getFormacoes()) {
				for (InstituicaoEnsino instituicao : pessoa.getInstituicao()) {
					if (escolaridade.getCodigo().equals(escolaridade.getCodigo())
							&& instituicao.getAreaDeAtuacao().equals(areaAtuacaoEscolaridade)) {
						quantidadeTotalPessoasEscolaridade++;
					}
				}
			}
		}
		return quantidadeTotalPessoasEscolaridade;

	}

	@Override
	public Integer buscarQuantidadeTotalPessoasMaioresIdade() {
		List<Pessoa> pessoas = trazPessoas();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		int pessoasMaiores = 0;
		for (Pessoa pessoa : pessoas) {
			try {
				LocalDate dataFormatada = LocalDate.parse(pessoa.getDataNascimento(), formato);
				int idade = Period.between(dataFormatada, LocalDate.now()).getYears();
				if (idade >= 18) {
					pessoasMaiores++;
				}
			} catch (Exception e) {
			}
		}
		return pessoasMaiores;
	}

	@Override
	public Integer buscarQuantidadeTotalDasPessoasPorEstadoCivil(String estadoCivil) {

		List<Pessoa> pessoas = trazPessoas();
		int quantidadeEstadoCivil = 0;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getEstadoCivil().equals(estadoCivil)) {
				quantidadeEstadoCivil++;
			}

		}
		return quantidadeEstadoCivil;

	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorBairro(String bairro) {
		List<Pessoa> pessoas = trazPessoas();
		int count = 0;
		for (Pessoa pessoa : pessoas) {
			for (Endereco endereco : pessoa.getEnderecos()) {
				if (endereco.getBairro().equalsIgnoreCase(bairro)) {
					count++;
				}
			}
		}
		return count;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorProfissao(String nomeProfissao) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeProfissao = 0;
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getNome().equals(nomeProfissao)) {
					quantidadeProfissao++;
				}
			}
		}
		return quantidadeProfissao;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorSalarioBaseMaiorIgual(BigDecimal salarioBase) {
		List<Pessoa> pessoas = trazPessoas();
		int salarioBaseMaiorOuIgual = 0;
		for (Pessoa pessoa : pessoas) {
			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getSalarioBase().compareTo(salarioBase) >= 0) {
					salarioBaseMaiorOuIgual++;
				}
			}
		}
		return salarioBaseMaiorOuIgual;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorEscolaridadeAreaAtuacao(String areaAtuacao) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadePessoasEscolaridade = 0;
		for (Pessoa pessoa : pessoas) {
			for (InstituicaoEnsino instituicao : pessoa.getInstituicao()) {
				if (instituicao.getAreaDeAtuacao().equals(areaAtuacao)) {
					quantidadePessoasEscolaridade++;
				}
			}
		}
		return quantidadePessoasEscolaridade;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorEscolaridadeQuantidadeSemestre(Integer semestre) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeSemestre = 0;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getFormacoes() != null) {

				for (Escolaridade escolaridade : pessoa.getFormacoes()) {
					if (escolaridade != null && escolaridade.getSemestreAtual() != null) {
						if (semestre.toString().equals(escolaridade.getSemestreAtual())) {
							quantidadeSemestre++;
						}
					}
				}
			}
		}
		return quantidadeSemestre;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorProfissaoAreaAtuacaoEscolaridadePorSemestre(String areaAtuacao,
			Integer semestre) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidade = 0;

		for (Pessoa pessoa : pessoas) {
			boolean temProfissaoNaArea = true;
			boolean temEscolaridadeNoSemestre = true;

			for (Profissao profissao : pessoa.getProfissao()) {
				if (profissao.getAreaDeAtuacao().equalsIgnoreCase(areaAtuacao)) {
					temProfissaoNaArea = false;
					break;
				}
			}
			if (temProfissaoNaArea) {
				for (Escolaridade escolaridade : pessoa.getFormacoes()) {
					if (escolaridade.isConcluido()) {
						try {
							if (escolaridade.getSemestreAtual() != null
									&& !escolaridade.getSemestreAtual().trim().isEmpty()) {
								int semestreAtual = Integer.parseInt(escolaridade.getSemestreAtual().trim());
								if (semestreAtual == semestre) {
									temEscolaridadeNoSemestre = false;
									break;
								}
							}
						} catch (NumberFormatException e) {
						}
					}
				}
			}
			if (temProfissaoNaArea && temEscolaridadeNoSemestre) {
				quantidade++;
			}
		}
		return quantidade;
	}

	@Override
	public Integer buscarQuantidadeTotalEmailPorPessoaAnoNascimentoProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(
			Integer anoNasicmento, String areaAtuacaoProfissao, String areaAtuacaoEscolaridade) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeEmails = 0;
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		for (Pessoa pessoa : pessoas) {
			try {
				LocalDate dataNascimento = LocalDate.parse(pessoa.getDataNascimento(), formato);
				int anoNascimentoPessoa = dataNascimento.getYear();
				if (!anoNasicmento.equals(anoNascimentoPessoa)) {
					continue;
				}

				boolean profissaoValida = false;
				if (pessoa.getProfissao() != null) {
					for (Profissao profissao : pessoa.getProfissao()) {
						if (areaAtuacaoProfissao != null && areaAtuacaoProfissao.equals(profissao.getAreaDeAtuacao())) {
							profissaoValida = true;
							break;
						}
					}
					if (!profissaoValida) {
						continue;
					}
				} else {
					continue;
				}
				boolean escolaridadeValida = false;
				if (areaAtuacaoEscolaridade != null) {
					if (pessoa.getFormacoes() != null) {
						for (Escolaridade e : pessoa.getFormacoes()) {
							if (e.getCodigo() != null && !e.getCodigo().isEmpty()) {
								escolaridadeValida = true;
								break;
							}
						}
					}
					if (!escolaridadeValida) {
						continue;
					}
				} else {
					continue;
				}
				if (pessoa.getContatos() != null) {
					for (Contato contato : pessoa.getContatos()) {
						if (TipoContato.EMAIL.equals(contato.getTipo())) {
							quantidadeEmails++;
						}
					}
				}
			} catch (Exception e) {
			}
		}
		return quantidadeEmails;
	}

	@Override
	public Integer buscarQuantidadeTotalConjugeDasPessoasMaioresIdadeEEstadoCivil(String estadoCivil) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeTotalConjuges = 0;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate hoje = LocalDate.now();
		for (Pessoa pessoa : pessoas) {
			LocalDate dataNascimento = LocalDate.parse(pessoa.getDataNascimento(), formatter);
			int idade = Period.between(dataNascimento, hoje).getYears();
			if (idade >= 18 && estadoCivil.equalsIgnoreCase(pessoa.getEstadoCivil())) {
				if (pessoa.getConjuge() != null && !pessoa.getConjuge().isEmpty()) {
					quantidadeTotalConjuges++;
				}
			}
		}
		return quantidadeTotalConjuges;
	}

	@Override
	public Integer buscarQuantidadeTotalContatosPorTipoContato(String tipoContato) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeTotalContatos = 0;
		try {
			int valorContato = Integer.parseInt(tipoContato);
			TipoContato tipoContatos = TipoContato.fromValor(valorContato);
			for (Pessoa pessoa : pessoas) {
				for (Contato contato : pessoa.getContatos()) {
					if (contato.getTipo().equals(tipoContatos)) {
						quantidadeTotalContatos++;
					}
				}
			}
		} catch (Exception e) {
		}
		return quantidadeTotalContatos;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorEscolaridadeNaoConcluida() {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeTotalPessoas = 0;
		for (Pessoa pessoa : pessoas) {
			for (Escolaridade escolaridade : pessoa.getFormacoes()) {
				if (!escolaridade.isConcluido()) {
					quantidadeTotalPessoas++;
					break;
				}
			}

		}
		return quantidadeTotalPessoas;
	}

	@Override
	public Integer buscarQuantidadeTotalPessoasPorBairroPorProfissaoPorAreaAtuacao(String bairro,
			String areaAtuacaoProfissao) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeTotalPessoas = 0;
		for (Pessoa pessoa : pessoas) {
			for (Endereco endereco : pessoa.getEnderecos()) {
				if (endereco.getBairro().equalsIgnoreCase(bairro)) {
					for (Profissao profissao : pessoa.getProfissao()) {
						if (profissao.getAreaDeAtuacao().equalsIgnoreCase(areaAtuacaoProfissao)) {
							quantidadeTotalPessoas++;
						}

					}
					break;
				}
			}
		}
		return quantidadeTotalPessoas;
	}

	@Override
	public Integer buscarQuantidadeTotalContatoPorTiposContato(List<String> tipoContato) {
		List<Pessoa> pessoas = trazPessoas();
		int quantidadeTotalContatos = 0;
		try {
			for (String tipo : tipoContato) {
				int valorContato = Integer.parseInt(tipo);
				TipoContato tipoContatos = TipoContato.fromValor(valorContato);
				for (Pessoa pessoa : pessoas) {
					for (Contato contato : pessoa.getContatos()) {
						if (contato.getTipo().equals(tipoContatos)) {
							quantidadeTotalContatos++;
						}
					}
				}
			}
		} catch (Exception e) {
		}
		return quantidadeTotalContatos;
	}
}

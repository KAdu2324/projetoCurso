package br.com.qwasolucoes.mentoria.implementacoes.banco_dados;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.qwasolucoes.mentoria.interfaces.banco_dados.BancoDados;

public class bancoDadosProvider implements BancoDados {

	@Override
	public void iniciarDDL() {
//		new DadosDAO().queryTodasAsTabelas();
//		new DadosDAO().adicionarDadosPessoa();
//		new DadosDAO().apagarTabelas();
		iniciarInserts();
//		criarSQLBuscarCPFsDasPessoasMaioresIdade();
//		criarSQLBuscarNomeSobrenomeDasPessoasPorAnorNascimento(2002);
//		criarSQLBuscarNomeSobrenomeDasPessoasPorEstadoCivil("Solteiro");
//		criarSQLBuscarPessoasPorTipoResidencia("comercial");
//		criarSQLBuscarPessoasPorTipoContato("celular");
//		criarSQLBuscarPessoasPorBairro("Bairro ABC");
//		 criarSQLBuscarPessoasPorNomeBairroContem("b");
//		 criarSQLBuscarPessoasPorEstado("sp");
//		criarSQLBuscarPessoasPorProfissao("analista de sistema");
//		 criarSQLBuscarPessoasPorProfissaoNomeAreaAtuacaoContem("a");
//		criarSQLBuscarPessoasPorSalarioBaseMaiorQue(new BigDecimal("9000.00"));
//		criarSQLBuscarPessoasPorSalarioBaseMaiorIgual(new BigDecimal("16000.00"));
//		criarSQLBuscarPessoasPorSalarioBaseEntre(new BigDecimal("5000.00"), new BigDecimal("9000.00"));
//		criarSQLBuscarPessoasPorEscolaridadeConcluida();
//		criarSQLBuscarPessoasPorEscolaridadeAreaAtuacao("Tecnologia da Informacao");
//		criarSQLBuscarPessoasPorEscolaridadeAnoTermino(2025);
//		criarSQLBuscarPessoasPorProfissaoAreaAtuacaoEscolaridadeConcluido("Tecnologia da Informacao");
//		criarSQLBuscarPessoasPorProfissaoAreaAtuacaoEscolaridadePorSemestre("Tecnologia da Informacao", 8);
//		criarSQLBuscarPessoasPorEstadoCivilProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao("solteiro","Tecnologia da Informacao","Tecnologia da Informacao");
//		criarSQLBuscarEnderecoDasPessoasMaioresIdadeEEstadoCivil("solteiro");
//		 criarSQLBuscarEnderecoPorTipoEndereco("residencial");
//		 criarSQLBuscarNomeRuaEnderecoPorCidadePorPessoaSexoConjungeComAnoNascimento("sp",  "m",2002);
//		 criarSQLBuscarNomeDoConjungeDasPessoasMaioresIdadeEEstadoCivil("casado");
//		List<String> estadoCivil = Arrays.asList("Casado", "Solteiro");
//		criarSQLBuscarNomeDoConjungeDasPessoasPorEstadoCivil(estadoCivil);
//		criarSQLBuscarNomeDoConjungeMaioresDeIdadeDasPessoasPorEstadoCivil("casado");
//		criarSQLBuscarContatoPorProfissaoAreaAtuacao("tecnologia da informacao");
//		criarSQLBuscarContatoPorProfissaoAreaAtuacaoEnderecoPorEstadoEBairro("tecnologia da informacao", "sp","Bairro ABC");
//		List<String> estados = Arrays.asList("sp", "mg");
//		criarSQLBuscarContatoPorProfissaoAreaAtuacaoEnderecoPorEstadosEBairro("tecnologia da informacao", estados,"Bairro ABC");
//		criarSQLBuscarContatoPorTipoContato("celular");
//		List<String> contatos = Arrays.asList("celular", "email");
//		 criarSQLBuscarContatoPorTiposContato(contatos);
		//criarSQLBuscarEmailPorPessoaAnoNascimentoProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(2002, "Tecnologia da Informacao","Tecnologia da Informacao");
//		criarSQLBuscarNomeInstituicaoPorPorAreaAtuacao("Tecnologia da Informacao");
//		criarSQLBuscarNomePessoasPorProfissaoPorAreaAtuacao("medicina");
//		criarSQLBuscarNomePessoasPorEscolaridadePorAreaAtuacao("medicina");
//		criarSQLBuscarQuantidadeTotalPessoasPorProfissaoPorAreaAtuacao("tecnologia da informacao");
//		criarSQLBuscarQuantidadeTotalPessoasPorEscolaridadePorAreaAtuacao("medicina");
//		criarSQLBuscarQuantidadeTotalPessoasMaioresIdade();
//		criarSQLBuscarQuantidadeTotalDasPessoasPorEstadoCivil("solteiro"); 
//		criarSQLBuscarQuantidadeTotalPessoasPorBairro("Bairro ABC");
//		criarSQLBuscarQuantidadeTotalPessoasPorProfissao("Gerente de Projeto");
//		criarSQLBuscarQuantidadeTotalPessoasPorSalarioBaseMaiorIgual(new BigDecimal("16000.00"));
//		 criarSQLBuscarQuantidadeTotalPessoasPorEscolaridadeAreaAtuacao("Tecnologia da Informacao");
//		criarSQLBuscarQuantidadeTotalPessoasPorEscolaridadeQuantidadeSemestre(12);
//		criarSQLBuscarQuantidadeTotalPessoasPorProfissaoAreaAtuacaoEscolaridadePorSemestre("Tecnologia da Informacao", 8);
//		criarSQLBuscarQuantidadeTotalEmailPorPessoaAnoNascimentoProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(2002, "Tecnologia da Informacao","Tecnologia da Informacao");
//		criarSQLBuscarQuantidadeTotalConjugeDasPessoasMaioresIdadeEEstadoCivil("solteiro");
//		criarSQLBuscarQuantidadeTotalContatosPorTipoContato("telefone");
//		criarSQLBuscarQuantidadeTotalPessoasPorEscolaridadeNaoConcluida();
//		criarSQLBuscarQuantidadeTotalPessoasPorBairroPorProfissaoPorAreaAtuacao("Bairro ABC","Tecnologia da Informacao");
//		List<String> contatos = Arrays.asList("celular",  "telefone");
//		criarSQLBuscarQuantidadeTotalContatoPorTiposContato(contatos);
		
	}

	@Override
	public List<String> iniciarInserts() {
		List<String> resultados = new ArrayList<>();
		String sql = "SELECT " + "    pessoa.nome, " + "    pessoa.conjuge AS conjuge, "
				+ "    GROUP_CONCAT(DISTINCT contato.valor SEPARATOR ', ') AS contatos, "
				+ "    GROUP_CONCAT(DISTINCT endereco.tipoendereco SEPARATOR ', ') AS tipoendereco, "
				+ "    GROUP_CONCAT(DISTINCT endereco.rua SEPARATOR ', ') AS enderecos, "
				+ "    empresa.nome AS empresa, "
				+ "    GROUP_CONCAT(DISTINCT profissao.nome SEPARATOR ', ') AS profissao, "
				+ "    GROUP_CONCAT(DISTINCT instituicaoensino.nome SEPARATOR ', ') AS instituicao, "
				+ "    GROUP_CONCAT(DISTINCT formacoes.concluido SEPARATOR ', ') AS concluido " + "FROM pessoa "
				+ "LEFT JOIN contato ON pessoa.cpf = contato.cpf " + "LEFT JOIN endereco ON pessoa.cpf = endereco.cpf "
				+ "LEFT JOIN empresa ON pessoa.cpf = empresa.cpf " + "LEFT JOIN profissao ON empresa.id = profissao.id "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "LEFT JOIN instituicaoensino ON empresa.id = instituicaoensino.id "
				+ "GROUP BY pessoa.nome, pessoa.conjuge, empresa.nome";
		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				String nome = rs.getString("nome");
				String conjuge = rs.getString("conjuge");
				String contatos = rs.getString("contatos");
				String tipoendereco = rs.getString("tipoendereco");
				String enderecos = rs.getString("enderecos");
				String empresa = rs.getString("empresa");
				String profissao = rs.getString("profissao");
				String instituicao = rs.getString("instituicao");
				String concluido = rs.getString("concluido");

				if (conjuge == null || conjuge.isEmpty()) {
					conjuge = "Solteiro";
				}
				String resultado = String.format(
						"Nome: %s Conjuge: %s Contatos: %s TipoEndereco: %s Endereços: %s Empresa: %s Profissão: %s Instituição: %s Concluido: %s",
						nome, conjuge, contatos, tipoendereco, enderecos, empresa, profissao, instituicao, concluido);
				resultados.add(resultado);
			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultados;
	}

	@Override
	public String criarSQLBuscarCPFsDasPessoasMaioresIdade() {
		String sql = "SELECT cpf FROM pessoa "
				+ "WHERE STR_TO_DATE(dataNascimento, '%d/%m/%Y') <= DATE_SUB(CURDATE(), INTERVAL 18 YEAR)";
		StringBuilder cpfs = new StringBuilder();
		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				String cpf = rs.getString("cpf");
				cpfs.append(cpf).append(", ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cpfs.toString();
	}

	@Override
	public String criarSQLBuscarNomeSobrenomeDasPessoasPorAnorNascimento(Integer ano) {

		String sql = "SELECT nome, sobrenome FROM pessoa " + "WHERE YEAR(STR_TO_DATE(dataNascimento, '%d/%m/%Y')) = ?";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setInt(1, ano);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					resultado.append(String.format("%s %s, ", nome, sobrenome));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarNomeSobrenomeDasPessoasPorEstadoCivil(String estadoCivil) {

		String sql = " SELECT nome, sobrenome  FROM pessoa " + "WHERE estadoCivil = ? ";
		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, estadoCivil);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					resultado.append(String.format("%s %s, ", nome, sobrenome));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorTipoResidencia(String tipoResidencia) {

		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT endereco.tipoendereco SEPARATOR ', ') AS TipoEndereco " + "FROM pessoa "
				+ "LEFT JOIN contato ON pessoa.cpf = contato.cpf " + "LEFT JOIN endereco ON pessoa.cpf = endereco.cpf "
				+ "WHERE endereco.tipoendereco = ? " + "GROUP BY pessoa.nome, pessoa.sobrenome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, tipoResidencia);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					resultado.append(String.format("%s %s, ", nome, sobrenome));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorTipoContato(String tipoContato) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT contato.tipocontato SEPARATOR ', ') AS tipocontato " + "FROM pessoa "
				+ "LEFT JOIN contato ON pessoa.cpf = contato.cpf " + "LEFT JOIN endereco ON pessoa.cpf = endereco.cpf "
				+ "WHERE contato.tipocontato = ? " + "GROUP BY pessoa.nome, pessoa.sobrenome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, tipoContato);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					resultado.append(String.format("%s %s, ", nome, sobrenome));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorBairro(String bairro) {

		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT endereco.bairro SEPARATOR ', ') AS bairro " + "FROM pessoa "
				+ "LEFT JOIN endereco ON pessoa.cpf = endereco.cpf " + "WHERE endereco.bairro = ? "
				+ "GROUP BY pessoa.nome, pessoa.sobrenome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, bairro);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String bairros = rs.getString("bairro");
					resultado.append(String.format("%s %s Bairros: %s, ", nome, sobrenome, bairros));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorNomeBairroContem(String valor) {

		String sql = "SELECT nome, sobrenome, " + "GROUP_CONCAT(DISTINCT endereco.bairro SEPARATOR ', ') AS bairro "
				+ "FROM pessoa  " + "LEFT JOIN endereco  ON pessoa.cpf = endereco.cpf "
				+ "WHERE endereco.bairro LIKE ? " + "GROUP BY pessoa.nome, pessoa.sobrenome";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, "%" + valor + "%");

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String bairros = rs.getString("bairro");
					resultado.append(String.format("%s %s - Bairros: %s\n", nome, sobrenome, bairros));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorEstado(String estado) {
		String sql = "SELECT nome, sobrenome, " + "GROUP_CONCAT(DISTINCT endereco.estado SEPARATOR ', ') AS estado "
				+ "FROM pessoa " + "LEFT JOIN endereco ON pessoa.cpf = endereco.cpf " + "WHERE endereco.estado = ?"
				+ "GROUP BY pessoa.nome, pessoa.sobrenome";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, estado);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String estados = rs.getString("estado");
					resultado.append(String.format("%s %s - Estado: %s\n", nome, sobrenome, estados));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorProfissao(String nomeProfissao) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT pr.nome SEPARATOR ', ') AS profissao " + "FROM pessoa "
				+ "LEFT JOIN empresa e ON pessoa.cpf = e.cpf " + "LEFT JOIN profissao pr ON e.id = pr.id "
				+ "WHERE pr.nome = ? " + "GROUP BY pessoa.nome, pessoa.sobrenome";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, nomeProfissao);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String profissao = rs.getString("profissao");

					resultado.append(String.format("%s %s - Profissão: %s\n", nome, sobrenome, profissao));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorProfissaoNomeAreaAtuacaoContem(String valor) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT pr.nome SEPARATOR ', ') AS profissao " + "FROM pessoa "
				+ "LEFT JOIN empresa e ON pessoa.cpf = e.cpf " + "LEFT JOIN profissao pr ON e.id = pr.id "
				+ "WHERE pr.nome LIKE ? " + "GROUP BY pessoa.nome, pessoa.sobrenome";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, "%" + valor + "%");

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String profissao = rs.getString("profissao");

					resultado.append(String.format("%s %s - Profissão: %s\n", nome, sobrenome, profissao));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorSalarioBaseMaiorQue(BigDecimal salarioBase) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, " + "pr.salariobase " + "FROM pessoa "
				+ "LEFT JOIN empresa e ON pessoa.cpf = e.cpf " + "LEFT JOIN profissao pr ON e.id = pr.id "
				+ "WHERE pr.salariobase > ? " + "GROUP BY pessoa.nome, pessoa.sobrenome, pr.salariobase";
		StringBuilder resultado = new StringBuilder();
		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setBigDecimal(1, salarioBase);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					BigDecimal salario = rs.getBigDecimal("salariobase");

					resultado.append(String.format("%s %s - Salário Base: %s\n", nome, sobrenome, salario));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorSalarioBaseMaiorIgual(BigDecimal salarioBase) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, " + "pr.salariobase " + "FROM pessoa "
				+ "LEFT JOIN empresa e ON pessoa.cpf = e.cpf " + "LEFT JOIN profissao pr ON e.id = pr.id "
				+ "WHERE pr.salariobase >= ? " + "GROUP BY pessoa.nome, pessoa.sobrenome, pr.salariobase";
		StringBuilder resultado = new StringBuilder();
		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setBigDecimal(1, salarioBase);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					BigDecimal salario = rs.getBigDecimal("salariobase");

					resultado.append(String.format("%s %s - Salário Base: %s\n", nome, sobrenome, salario));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorSalarioBaseEntre(BigDecimal salarioBaseInicio, BigDecimal salarioBaseFim) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, " + "pr.salariobase " + "FROM pessoa "
				+ "LEFT JOIN empresa e ON pessoa.cpf = e.cpf " + "LEFT JOIN profissao pr ON e.id = pr.id "
				+ "WHERE pr.salariobase BETWEEN ? AND ? " + "GROUP BY pessoa.nome, pessoa.sobrenome, pr.salariobase";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setBigDecimal(1, salarioBaseInicio);
			pstmt.setBigDecimal(2, salarioBaseFim);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					BigDecimal salario = rs.getBigDecimal("salariobase");

					resultado.append(String.format("%s %s - Salário Base: %s\n", nome, sobrenome, salario));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorEscolaridadeConcluida() {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT formacoes.concluido SEPARATOR ', ') AS concluido " + "FROM pessoa "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf " + "WHERE formacoes.concluido = 1 "
				+ "GROUP BY pessoa.nome, pessoa.sobrenome";

		StringBuilder ensinoConcluido = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {
				String nome = rs.getString("nome");
				String sobrenome = rs.getString("sobrenome");

				String statusConclusao = "Sim";
				ensinoConcluido.append(String.format("%s %s - Concluido: %s\n", nome, sobrenome, statusConclusao));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ensinoConcluido.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorEscolaridadeAreaAtuacao(String areaAtuacao) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT pr.nome SEPARATOR ', ') AS areadeatuacao " + "FROM pessoa "
				+ "LEFT JOIN empresa e ON pessoa.cpf = e.cpf " + "LEFT JOIN profissao pr ON e.id = pr.id "
				+ "WHERE pr.areadeatuacao = ? " + "GROUP BY pessoa.nome, pessoa.sobrenome";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacao);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String areadeatuacao = rs.getString("areadeatuacao");

					resultado.append(String.format("%s %s - areadeatuacao: %s\n", nome, sobrenome, areadeatuacao));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorEscolaridadeAnoTermino(Integer ano) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT formacoes.datatermino SEPARATOR ', ') AS anoTermino " + "FROM pessoa "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf " + "WHERE formacoes.datatermino LIKE ? "
				+ "GROUP BY pessoa.nome, pessoa.sobrenome";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, "%" + ano + "%");

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String anoTermino = rs.getString("anoTermino");

					resultado.append(String.format("%s %s - Ano de Término: %s\n", nome, sobrenome, anoTermino));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorEscolaridadeQuantidadeSemestre(Integer semestre) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "GROUP_CONCAT(DISTINCT formacoes.datatermino SEPARATOR ', ') AS quantidadeSemestre " + "FROM pessoa "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf " + "WHERE formacoes.datatermino LIKE ? "
				+ "GROUP BY pessoa.nome, pessoa.sobrenome";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, "%" + semestre + "%");

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String quantidadeSemestre = rs.getString("quantidadeSemestre");

					resultado
							.append(String.format("%s %s - Ano de Término: %s\n", nome, sobrenome, quantidadeSemestre));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorProfissaoAreaAtuacaoEscolaridadeConcluido(String areaAtuacao) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "       GROUP_CONCAT(DISTINCT profissao.nome SEPARATOR ', ') AS profissao, "
				+ "       GROUP_CONCAT(DISTINCT formacoes.concluido SEPARATOR ', ') AS escolaridadeConcluida "
				+ "FROM pessoa " + "LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
				+ "LEFT JOIN profissao ON empresa.id = profissao.id "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "WHERE profissao.areadeatuacao = ? " + "  AND formacoes.concluido = 1 "
				+ "GROUP BY pessoa.nome, pessoa.sobrenome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacao);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String profissao = rs.getString("profissao");
					String statusConclusao = "Sim";

					resultado.append(String.format("%s %s - Profissões: %s - Escolaridade Concluída: %s\n", nome,
							sobrenome, profissao, statusConclusao));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorProfissaoAreaAtuacaoEscolaridadePorSemestre(String areaAtuacao,
			Integer semestre) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "       GROUP_CONCAT(DISTINCT profissao.nome SEPARATOR ', ') AS profissao, "
				+ "       GROUP_CONCAT(DISTINCT instituicaoensino.quantidadesemestres SEPARATOR ', ') AS quantidadesemestres "
				+ "FROM pessoa " + "LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
				+ "LEFT JOIN profissao ON empresa.id = profissao.id "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "WHERE profissao.areadeatuacao = ? " + "  AND instituicaoensino.quantidadesemestres = ? "
				+ "GROUP BY pessoa.nome, pessoa.sobrenome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacao);
			pstmt.setInt(2, semestre);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String profissao = rs.getString("profissao");
					String statusConclusao = "Sim";

					resultado.append(String.format("%s %s - Profissões: %s - Escolaridade Concluída: %s\n", nome,
							sobrenome, profissao, statusConclusao));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarPessoasPorEstadoCivilProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(String estadoCivil,
			String areaAtuacaoProfissao, String areaAtuacaoEscolaridade) {

		String sql = "SELECT pessoa.nome, pessoa.sobrenome, "
				+ "       GROUP_CONCAT(DISTINCT profissao.nome SEPARATOR ', ') AS profissao, "
				+ "       GROUP_CONCAT(DISTINCT instituicaoensino.areadeatuacao SEPARATOR ', ') AS areadeatuacao "
				+ "FROM pessoa " + "LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
				+ "LEFT JOIN profissao ON empresa.id = profissao.id "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "WHERE pessoa.estadocivil = ? " + "  AND profissao.areadeatuacao = ? "
				+ "  AND instituicaoensino.areadeatuacao = ? " + "GROUP BY pessoa.nome, pessoa.sobrenome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, estadoCivil);
			pstmt.setString(2, areaAtuacaoProfissao);
			pstmt.setString(3, areaAtuacaoEscolaridade);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String profissao = rs.getString("profissao");
					String areaAtuacao = rs.getString("areadeatuacao");

					resultado.append(String.format("%s %s - Profissões: %s - Áreas de Atuação da Escolaridade: %s%n",
							nome, sobrenome, profissao, areaAtuacao));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarEnderecoDasPessoasMaioresIdadeEEstadoCivil(String estadoCivil) {
		String sql = "SELECT pessoa.nome, pessoa.sobrenome, endereco.rua " + "FROM pessoa "
				+ "JOIN endereco ON pessoa.cpf = endereco.cpf " + "WHERE pessoa.estadocivil = ? "
				+ "  AND STR_TO_DATE(dataNascimento, '%d/%m/%Y') <= DATE_SUB(CURDATE(), INTERVAL 18 YEAR)";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, estadoCivil);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String sobrenome = rs.getString("sobrenome");
					String rua = rs.getString("rua");

					resultado.append(String.format("%s %s - Endereço: %s \n", nome, sobrenome, rua));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarEnderecoPorTipoEndereco(String tipoEndereco) {
		String sql = "SELECT endereco.rua, endereco.numero, endereco.bairro, endereco.cidade, endereco.estado, endereco.cep "
				+ "FROM pessoa " + "JOIN endereco ON pessoa.cpf = endereco.cpf " + "WHERE endereco.tipoendereco = ?";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, tipoEndereco);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {

					String rua = rs.getString("rua");
					String numero = rs.getString("numero");
					String bairro = rs.getString("bairro");
					String cidade = rs.getString("cidade");
					String estado = rs.getString("estado");
					String cep = rs.getString("cep");

					resultado.append(String.format("Endereço: %s, %s, %s, %s, %s - CEP: %s%n", rua, numero, bairro,
							cidade, estado, cep));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarNomeRuaEnderecoPorCidadePorPessoaSexoConjungeComAnoNascimento(String cidade,
			String sexo, Integer anoNascimentoConjunge) {
		String sql = "SELECT pessoa.nome, pessoa.conjuge, endereco.rua, endereco.numero, endereco.bairro, endereco.cidade, endereco.estado, endereco.cep "
				+ "FROM pessoa " + "JOIN endereco ON pessoa.cpf = endereco.cpf " + "WHERE endereco.estado = ? "
				+ "  AND pessoa.sexo = ? " + " AND pessoa.datanascimento like ?";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, cidade);
			pstmt.setString(2, sexo);
			pstmt.setString(3, "%" + anoNascimentoConjunge + "%");

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String conjuge = rs.getString("conjuge");
					String rua = rs.getString("rua");
					String numero = rs.getString("numero");
					String bairro = rs.getString("bairro");
					String cidadeEndereco = rs.getString("cidade");
					String estado = rs.getString("estado");
					String cep = rs.getString("cep");

					resultado.append(String.format("%s - Cônjuge: %s - Endereço: %s, %s, %s, %s, %s - CEP: %s%n", nome,
							conjuge, rua, numero, bairro, cidadeEndereco, estado, cep));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarNomeDoConjungeDasPessoasMaioresIdadeEEstadoCivil(String estadoCivil) {
		String sql = "SELECT pessoa.conjuge " + "FROM pessoa "
				+ "WHERE YEAR(STR_TO_DATE(dataNascimento, '%d/%m/%Y')) >=18" + "  AND pessoa.estadocivil = ? ";
		StringBuilder resultado = new StringBuilder();
		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {
			pstmt.setString(1, estadoCivil);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {

					String conjuge = rs.getString("conjuge");

					resultado.append(String.format("Cônjuge: %s\n", conjuge));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarNomeDoConjungeDasPessoasPorEstadoCivil(List<String> estadoCivil) {
		String sql = "SELECT pessoa.nome, pessoa.conjuge " + "FROM pessoa " + "WHERE pessoa.estadocivil IN ("
				+ String.join(", ", Collections.nCopies(estadoCivil.size(), "?")) + ")";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			for (int i = 0; i < estadoCivil.size(); i++) {
				pstmt.setString(i + 1, estadoCivil.get(i));
			}

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String conjuge = rs.getString("conjuge");

					resultado.append(String.format("Pessoa: %s  Cônjuge: %s%n", nome, conjuge));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarNomeDoConjungeMaioresDeIdadeDasPessoasPorEstadoCivil(String estadoCivil) {
		String sql = "SELECT pessoa.nome, pessoa.conjuge " + "FROM pessoa " + "WHERE pessoa.estadocivil = ? ";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, estadoCivil);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String conjuge = rs.getString("conjuge");

					resultado.append(String.format("Pessoa: %s  Cônjuge: %s%n", nome, conjuge));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarContatoPorProfissaoAreaAtuacao(String areaAtuacao) {
		String sql = "SELECT pessoa.nome, " + "GROUP_CONCAT(DISTINCT contato.valor SEPARATOR ', ') AS contato "
				+ "FROM pessoa " + "LEFT JOIN contato ON pessoa.cpf = contato.cpf "
				+ "LEFT JOIN endereco ON pessoa.cpf = endereco.cpf "
				+ "LEFT JOIN profissao ON endereco.id = endereco.id " + "WHERE profissao.areadeatuacao = ? "
				+ "GROUP BY pessoa.nome";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacao);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String contato = rs.getString("contato");

					resultado.append(String.format("Pessoa: %s  contato: %s%n", nome, contato));
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarContatoPorProfissaoAreaAtuacaoEnderecoPorEstadoEBairro(String areaAtuacao,
			String estado, String bairro) {

		String sql = "SELECT pessoa.nome, endereco.estado, endereco.bairro, "
				+ "GROUP_CONCAT(DISTINCT contato.valor SEPARATOR ', ') AS contato " + "FROM pessoa "
				+ "JOIN contato ON pessoa.cpf = contato.cpf " + "JOIN endereco ON pessoa.cpf = endereco.cpf "
				+ "JOIN profissao ON endereco.id = profissao.id " + "WHERE profissao.areadeatuacao = ? "
				+ "AND endereco.estado = ? " + "AND endereco.bairro = ? " + "GROUP BY pessoa.nome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacao);
			pstmt.setString(2, estado);
			pstmt.setString(3, bairro);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String estadoE = rs.getString("estado");
					String bairroB = rs.getString("bairro");
					String contatos = rs.getString("contato");

					resultado.append(String.format("Pessoa: %s, Estado: %s, Bairro: %s, Contatos: %s%n", nome, estadoE,
							bairroB, contatos));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarContatoPorProfissaoAreaAtuacaoEnderecoPorEstadosEBairro(String areaAtuacao,
			List<String> estados, String bairro) {

		if (estados == null || estados.isEmpty()) {
			throw new IllegalArgumentException("A lista de estados não pode estar vazia");
		}

		String listaEstados = String.join(", ", Collections.nCopies(estados.size(), "?"));

		String sql = "SELECT pessoa.nome, endereco.estado, endereco.bairro, "
				+ "GROUP_CONCAT(DISTINCT contato.valor SEPARATOR ', ') AS contato " + "FROM pessoa "
				+ "JOIN contato ON pessoa.cpf = contato.cpf " + "JOIN endereco ON pessoa.cpf = endereco.cpf "
				+ "JOIN profissao ON endereco.id = profissao.id " + "WHERE profissao.areadeatuacao = ? "
				+ "AND endereco.estado IN (" + listaEstados + ") " + "AND endereco.bairro = ? "
				+ "GROUP BY pessoa.nome, endereco.estado, endereco.bairro;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacao);

			int index = 2;
			for (String estado : estados) {
				pstmt.setString(index++, estado);
			}

			pstmt.setString(index, bairro);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String estadoE = rs.getString("estado");
					String bairroB = rs.getString("bairro");
					String contatos = rs.getString("contato");

					resultado.append(String.format("Pessoa: %s, Estado: %s, Bairro: %s, Contatos: %s%n", nome, estadoE,
							bairroB, contatos));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarContatoPorTipoContato(String tipoContato) {
		String sql = "SELECT pessoa.nome,  "
				+ "GROUP_CONCAT(DISTINCT contato.tipocontato SEPARATOR ', ') AS tipocontato ,"
				+ "GROUP_CONCAT(DISTINCT contato.valor SEPARATOR ', ') AS contatos " + "FROM pessoa "
				+ "LEFT JOIN contato ON pessoa.cpf = contato.cpf " + "WHERE contato.tipocontato = ? "
				+ "GROUP BY pessoa.nome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, tipoContato);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String contatos = rs.getString("contatos");
					resultado.append(String.format("%s %s, ", nome, contatos));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarContatoPorTiposContato(List<String> tipoContato) {
		if (tipoContato == null || tipoContato.isEmpty()) {
			return null;
		}

		String listaContatos = String.join(", ", Collections.nCopies(tipoContato.size(), "?"));

		String sql = "SELECT pessoa.nome, "
				+ "GROUP_CONCAT(DISTINCT contato.tipocontato SEPARATOR ', ') AS tipocontato, "
				+ "GROUP_CONCAT(DISTINCT contato.valor SEPARATOR ', ') AS contatos " + "FROM pessoa "
				+ "LEFT JOIN contato ON pessoa.cpf = contato.cpf " + "WHERE contato.tipocontato IN (" + listaContatos
				+ ") " + "GROUP BY pessoa.nome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			int index = 1;
			for (String tipo : tipoContato) {
				pstmt.setString(index++, tipo);
			}

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String tipocontato = rs.getString("tipocontato");
					String contatos = rs.getString("contatos");

					resultado.append(String.format("Pessoa: %s, Tipos de Contato: %s, Contatos: %s%n", nome,
							tipocontato, contatos));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarEmailPorPessoaAnoNascimentoProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(
			Integer anoNascimento, String areaAtuacaoProfissao, String areaAtuacaoEscolaridade) {

		String sql = "SELECT pessoa.nome,  " + "GROUP_CONCAT(DISTINCT profissao.nome SEPARATOR ', ') AS areaAtuacao,  "
				+ "GROUP_CONCAT(DISTINCT instituicaoensino.areadeatuacao SEPARATOR ', ') AS escolaridade "
				+ "FROM pessoa " + "LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
				+ "LEFT JOIN profissao ON empresa.id = profissao.id  "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "LEFT JOIN contato ON pessoa.cpf = contato.cpf " + "WHERE contato.tipocontato = 'email' "
				+ "AND pessoa.datanascimento LIKE ? " + "AND profissao.areadeatuacao = ? "
				+ "AND instituicaoensino.areadeatuacao = ? " + "GROUP BY pessoa.nome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, "%" + anoNascimento + "%");
			pstmt.setString(2, areaAtuacaoProfissao);
			pstmt.setString(3, areaAtuacaoEscolaridade);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String areaAtuacao = rs.getString("areaAtuacao");
					String escolaridade = rs.getString("escolaridade");
					resultado.append(String.format("Nome: %s, Área de Atuação: %s, Escolaridade: %s%n", nome,
							areaAtuacao, escolaridade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarNomeInstituicaoPorPorAreaAtuacao(String areaAtuacaoProfissao) {
		String sql = "SELECT pessoa.nome,  "
				+ "GROUP_CONCAT(DISTINCT instituicaoensino.nome SEPARATOR ', ') AS nomeInstituicao"
				+ "FROM pessoa " + "				LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
				+ "LEFT JOIN profissao ON empresa.id = profissao.id  "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "WHERE profissao.areadeatuacao =  ?" + "				GROUP BY pessoa.nome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacaoProfissao);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nomeInstituicao = rs.getString("nomeInstituicao");
					resultado.append(String.format("Nome instituicao: %s%n", nomeInstituicao));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarNomePessoasPorProfissaoPorAreaAtuacao(String areaAtuacaoProfissao) {
		String sql = "SELECT pessoa.nome,  "
				+ "	GROUP_CONCAT(DISTINCT profissao.areadeatuacao SEPARATOR ', ') AS areaAtuacao" + "	FROM pessoa "
				+ "	LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
				+ " LEFT JOIN profissao ON empresa.id = profissao.id  "
				+ "	LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "	LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "	WHERE profissao.areadeatuacao =  ?" + "	GROUP BY pessoa.nome;" + "";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacaoProfissao);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String areaAtuacao = rs.getString("areaAtuacao");
					resultado.append(String.format("Nome: %s Area Atuacao: %s%n", nome, areaAtuacao));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarNomePessoasPorEscolaridadePorAreaAtuacao(String areaAtuacaoEscolaridade) {
		String sql = "SELECT pessoa.nome,  "
				+ "	GROUP_CONCAT(DISTINCT instituicaoensino.areadeatuacao SEPARATOR ', ') AS areaAtuacaoEscolaridade"
				+ "	FROM pessoa " + "	LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
				+ " LEFT JOIN profissao ON empresa.id = profissao.id  "
				+ "	LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "	LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "	WHERE instituicaoensino.areadeatuacao =  ?" + "	GROUP BY pessoa.nome;" + "";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacaoEscolaridade);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nome = rs.getString("nome");
					String areaAtuacaoEscolaridadee = rs.getString("areaAtuacaoEscolaridade");
					resultado.append(String.format("Nome: %s Area Atuacao: %s%n", nome, areaAtuacaoEscolaridadee));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorProfissaoPorAreaAtuacao(String areaAtuacaoProfissao) {
		String sql = "SELECT profissao.nome, " + " COUNT(*) AS quantidade " + " FROM pessoa "
				+ " LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
				+ " LEFT JOIN profissao ON empresa.id = profissao.id " + " WHERE profissao.areadeatuacao = ? "
				+ " GROUP BY profissao.nome;";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacaoProfissao);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nomeProfissao = rs.getString("nome");
					int quantidade = rs.getInt("quantidade");
					resultado.append(String.format("Profissão: %s, Quantidade pessoas profissão: %d%n", nomeProfissao,
							quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorEscolaridadePorAreaAtuacao(String areaAtuacaoEscolaridade) {
		String sql = "SELECT "
				+ "GROUP_CONCAT(DISTINCT instituicaoensino.areadeatuacao SEPARATOR ', ') AS areaAtuacao, "
				+ "COUNT(DISTINCT pessoa.cpf) AS quantidade " + "FROM pessoa "
				+ "LEFT JOIN empresa ON pessoa.cpf = empresa.cpf " + "LEFT JOIN profissao ON empresa.id = profissao.id "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "WHERE instituicaoensino.areadeatuacao = ? ";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacaoEscolaridade);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String nomeEscolaridade = rs.getString("areaAtuacao");
					int quantidade = rs.getInt("quantidade");
					resultado.append(String.format("Escolaridade: %s, Quantidade de pessoas: %d%n", nomeEscolaridade,
							quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasMaioresIdade() {
		String sql = "SELECT COUNT(*) AS quantidade " + "FROM pessoa "
				+ "WHERE STR_TO_DATE(dataNascimento, '%d/%m/%Y') <= DATE_SUB(CURDATE(), INTERVAL 18 YEAR)";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			if (rs.next()) {
				int quantidade = rs.getInt("quantidade");
				resultado.append(String.format("Quantidade de pessoas maiores de idade: %d%n", quantidade));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalDasPessoasPorEstadoCivil(String estadoCivil) {
		String sql = "SELECT COUNT(*) AS quantidade " + "FROM pessoa " + "WHERE estadoCivil = ?";

		StringBuilder resultado = new StringBuilder();
		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, estadoCivil);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int quantidade = rs.getInt("quantidade");
					resultado.append(String.format("Quantidade de pessoas com estado civil '%s': %d%n", estadoCivil,
							quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorBairro(String bairro) {
		String sql = "SELECT COUNT(*) AS quantidade " + "FROM endereco " + "WHERE bairro = ?";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, bairro);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int quantidade = rs.getInt("quantidade");
					resultado.append(String.format("Quantidade de pessoas no bairro '%s': %d%n", bairro, quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorProfissao(String nomeProfissao) {
		String sql = "SELECT COUNT(*) AS quantidade " + "FROM profissao " + "WHERE nome = ?";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, nomeProfissao);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int quantidade = rs.getInt("quantidade");
					resultado.append(
							String.format("Quantidade de pessoas no bairro '%s': %d%n", nomeProfissao, quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorSalarioBaseMaiorIgual(BigDecimal salarioBase) {
		String sql = "SELECT COUNT(*) AS quantidade " + "FROM pessoa p " + "LEFT JOIN empresa e ON p.cpf = e.cpf "
				+ "LEFT JOIN profissao pr ON e.id = pr.id " + "WHERE pr.salariobase >= ?";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setBigDecimal(1, salarioBase);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int quantidade = rs.getInt("quantidade");
					resultado.append(
							String.format("Quantidade de pessoas com salário base maior ou igual a R$ %.2f: %d%n",
									salarioBase, quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorEscolaridadeAreaAtuacao(String areaAtuacao) {
		String sql = "SELECT COUNT(*) AS quantidade, " + "pr.areadeatuacao " + "FROM pessoa p "
				+ "LEFT JOIN empresa e ON p.cpf = e.cpf " + "LEFT JOIN profissao pr ON e.id = pr.id "
				+ "WHERE pr.areadeatuacao = ? " + "GROUP BY pr.areadeatuacao";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacao);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					int quantidade = rs.getInt("quantidade");
					String area = rs.getString("areadeatuacao");
					resultado.append(
							String.format("Quantidade de pessoas na área de atuação '%s': %d%n", area, quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorEscolaridadeQuantidadeSemestre(Integer semestre) {
		String sql = "SELECT COUNT(DISTINCT pessoa.cpf) AS quantidade " + "FROM pessoa "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf " + "WHERE formacoes.datatermino LIKE ?";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, "%" + semestre + "%");

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int quantidade = rs.getInt("quantidade");
					resultado.append(String.format("Total de pessoas com formação no semestre '%d' quantidade: %d%n",
							semestre, quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorProfissaoAreaAtuacaoEscolaridadePorSemestre(String areaAtuacao,
			Integer semestre) {
		String sql = "SELECT COUNT(DISTINCT pessoa.cpf) AS quantidade " + "FROM pessoa "
				+ "LEFT JOIN empresa ON pessoa.cpf = empresa.cpf " + "LEFT JOIN profissao ON empresa.id = profissao.id "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
				+ "LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
				+ "WHERE profissao.areadeatuacao = ? " + "AND instituicaoensino.quantidadesemestres = ?";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql)) {

			pstmt.setString(1, areaAtuacao);
			pstmt.setInt(2, semestre);

			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int quantidade = rs.getInt("quantidade");
					resultado.append(String.format("Total de pessoas na área '%s' com %d semestres: %d%n",
							areaAtuacao, semestre, quantidade));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalEmailPorPessoaAnoNascimentoProfissaoAreaAtuacaoEscolaridadePorAreaAtuacao(
	        Integer anoNascimento, String areaAtuacaoProfissao, String areaAtuacaoEscolaridade) {

	    String sql = "SELECT COUNT(DISTINCT contato.valor) AS quantidade "
	               + "FROM pessoa "
	               + "LEFT JOIN empresa ON pessoa.cpf = empresa.cpf "
	               + "LEFT JOIN profissao ON empresa.id = profissao.id "
	               + "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf "
	               + "LEFT JOIN instituicaoensino ON formacoes.codigo = instituicaoensino.codigo "
	               + "LEFT JOIN contato ON pessoa.cpf = contato.cpf "
	               + "WHERE contato.tipocontato = 'email' "
	               + "AND pessoa.datanascimento LIKE ? "
	               + "AND profissao.areadeatuacao = ? "
	               + "AND instituicaoensino.areadeatuacao = ?";

	    StringBuilder resultado = new StringBuilder();

	    try (Connection connection = Conexao.abrirConexao();
	         PreparedStatement pstmt = connection.prepareStatement(sql)) {

	        pstmt.setString(1, "%" + anoNascimento + "%");
	        pstmt.setString(2, areaAtuacaoProfissao);
	        pstmt.setString(3, areaAtuacaoEscolaridade);

	        try (ResultSet rs = pstmt.executeQuery()) {
	            if (rs.next()) {
	                int quantidade = rs.getInt("quantidade");
	                resultado.append(String.format("Total de emails encontrados: %d%n", quantidade));
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalConjugeDasPessoasMaioresIdadeEEstadoCivil(String estadoCivil) {
	    String sql = "SELECT COUNT(DISTINCT conjuge.cpf) AS quantidade "
	               + "FROM pessoa "
	               + "JOIN endereco ON pessoa.cpf = endereco.cpf "
	               + "LEFT JOIN pessoa conjuge ON pessoa.cpf = conjuge.cpf "
	               + "WHERE pessoa.estadocivil = ? "
	               + "AND STR_TO_DATE(pessoa.dataNascimento, '%d/%m/%Y') <= DATE_SUB(CURDATE(), INTERVAL 18 YEAR)";

	    StringBuilder resultado = new StringBuilder();

	    try (Connection connection = Conexao.abrirConexao();
	         PreparedStatement pstmt = connection.prepareStatement(sql)) {

	        pstmt.setString(1, estadoCivil);

	        try (ResultSet rs = pstmt.executeQuery()) {
	            if (rs.next()) {
	                int quantidade = rs.getInt("quantidade");
	                resultado.append(String.format("Total de cônjuges para pessoas %s: %d%n", estadoCivil, quantidade));
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalContatosPorTipoContato(String tipoContato) {
	    String sql = "SELECT COUNT(DISTINCT contato.cpf) AS quantidade "
	               + "FROM contato "
	               + "WHERE contato.tipocontato = ?";

	    StringBuilder resultado = new StringBuilder();

	    try (Connection connection = Conexao.abrirConexao();
	         PreparedStatement pstmt = connection.prepareStatement(sql)) {

	        pstmt.setString(1, tipoContato);

	        try (ResultSet rs = pstmt.executeQuery()) {
	            if (rs.next()) {
	                int quantidade = rs.getInt("quantidade");
	                resultado.append(String.format("Total de contatos do tipo '%s': %d%n", tipoContato, quantidade));
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorEscolaridadeNaoConcluida() {
		String sql = "SELECT COUNT(DISTINCT pessoa.cpf) AS quantidade " + "FROM pessoa "
				+ "LEFT JOIN formacoes ON pessoa.cpf = formacoes.cpf " + "WHERE formacoes.concluido = 0";

		StringBuilder resultado = new StringBuilder();

		try (Connection connection = Conexao.abrirConexao();
				PreparedStatement pstmt = connection.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {

			if (rs.next()) {
				int quantidade = rs.getInt("quantidade");
				resultado.append(String.format("Total de pessoas com formação não concluída: %d%n", quantidade));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalPessoasPorBairroPorProfissaoPorAreaAtuacao(String bairro, String areaAtuacaoProfissao) {
	    String sql = "SELECT COUNT(DISTINCT pessoa.cpf) AS quantidade "
	               + "FROM pessoa "
	               + "JOIN contato ON pessoa.cpf = contato.cpf "
	               + "JOIN endereco ON pessoa.cpf = endereco.cpf "
	               + "JOIN profissao ON endereco.id = profissao.id "
	               + "WHERE profissao.areadeatuacao = ? "
	               + "AND endereco.bairro = ?";

	    StringBuilder resultado = new StringBuilder();

	    try (Connection connection = Conexao.abrirConexao();
	         PreparedStatement pstmt = connection.prepareStatement(sql)) {

	        pstmt.setString(1, areaAtuacaoProfissao);
	        pstmt.setString(2, bairro);

	        try (ResultSet rs = pstmt.executeQuery()) {
	            if (rs.next()) {
	                int quantidade = rs.getInt("quantidade");
	                resultado.append(String.format("Total de pessoas no bairro '%s' com área de atuação '%s': %d%n", bairro, areaAtuacaoProfissao, quantidade));
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return resultado.toString();
	}

	@Override
	public String criarSQLBuscarQuantidadeTotalContatoPorTiposContato(List<String> tipoContato) {
	    if (tipoContato == null || tipoContato.isEmpty()) {
	        return "Nenhum tipo de contato fornecido.";
	    }

	    String listaContatos = String.join(", ", Collections.nCopies(tipoContato.size(), "?"));

	    String sql = "SELECT COUNT(DISTINCT contato.cpf) AS quantidade " +
	                 "FROM contato " +
	                 "WHERE contato.tipocontato IN (" + listaContatos + ")";

	    StringBuilder resultado = new StringBuilder();

	    try (Connection connection = Conexao.abrirConexao();
	         PreparedStatement pstmt = connection.prepareStatement(sql)) {

	        int index = 1;
	        for (String tipo : tipoContato) {
	            pstmt.setString(index++, tipo);
	        }

	        try (ResultSet rs = pstmt.executeQuery()) {
	            if (rs.next()) {
	                int quantidade = rs.getInt("quantidade");
	                resultado.append(String.format("Total de contatos para os tipos fornecidos: %d%n", quantidade));
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return resultado.toString();
	}

}

package br.com.qwasolucoes.mentoria.implementacoes.banco_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import br.com.qwasolucoes.mentoria.implementacoes.relacionamento.RelacionamentoProvider;
import br.com.qwasolucoes.mentoria.modelagem_dados.Contato;
import br.com.qwasolucoes.mentoria.modelagem_dados.Empresa;
import br.com.qwasolucoes.mentoria.modelagem_dados.Endereco;
import br.com.qwasolucoes.mentoria.modelagem_dados.Escolaridade;
import br.com.qwasolucoes.mentoria.modelagem_dados.InstituicaoEnsino;
import br.com.qwasolucoes.mentoria.modelagem_dados.Pessoa;
import br.com.qwasolucoes.mentoria.modelagem_dados.Profissao;

public class DadosDAO {

	
	
	public void apagarTable(String nomeTabela) {

		String apagarTableSQL = "DROP TABLE IF EXISTS " + nomeTabela;

		try (Connection connection = Conexao.abrirConexao(); Statement stmt = connection.createStatement()) {

			stmt.executeUpdate(apagarTableSQL);

			Conexao.fecharConexao();

		} catch (SQLException e) {
			System.err.println("Erro ao apagar a tabela " + nomeTabela + ": " + e.getMessage());
		}
	}

	public void apagarTabelas() {

		String[] tabelas = { "PESSOA", "CONTATO", "ENDERECO", "EMPRESA", "PROFISSAO","INSTITUICAOENSINO","FORMACOES" };

		for (String tabela : tabelas) {
			apagarTable(tabela);

		}
		System.out.println("Banco Fechado ");
	}

	public void queryTabelaPessoa() {

		 String sql = "CREATE TABLE IF NOT EXISTS PESSOA ("
		            + "id INT AUTO_INCREMENT PRIMARY KEY, "
		            + "nome VARCHAR(100) NOT NULL, "
		            + "sobrenome VARCHAR(100) NOT NULL, "
		            + "datanascimento VARCHAR(15) NOT NULL, "
		            + "sexo CHAR(1), "
		            + "cpf VARCHAR(14) UNIQUE NOT NULL, "  
		            + "estadocivil VARCHAR(50), "
		            + "conjuge VARCHAR(30) NULL )";
		  
	    try (Connection connection = Conexao.abrirConexao(); 
	         Statement stmt = connection.createStatement()) {

	        stmt.execute(sql);

	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println("Erro ao query a tabela 'PESSOA'.");
	    }
	}

	public void queryTabelaContatos() {
		String sql = "CREATE TABLE IF NOT EXISTS CONTATO ("
	            + "id INT AUTO_INCREMENT PRIMARY KEY, "
	            + "cpf VARCHAR(14), "
	            + "tipocontato VARCHAR(35), "
	            + "valor VARCHAR(35), "
	            + "FOREIGN KEY (cpf) REFERENCES PESSOA(cpf) ON DELETE CASCADE)";
		try (Connection connection = Conexao.abrirConexao(); Statement stmt = connection.createStatement()) {

			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao query a tabela 'Contato'.");
		}

	}

	public void queryTabelaEndereco() {
		String sql = "CREATE TABLE IF NOT EXISTS ENDERECO (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
				+ "cpf VARCHAR(14) NOT NULL, " + "tipoendereco VARCHAR(30) NOT NULL, " + "pais VARCHAR(50) NOT NULL, "
				+ "rua VARCHAR(50) NOT NULL, " + "numero VARCHAR(10) NOT NULL, " + "bairro VARCHAR(50) NOT NULL, "
				+ "cidade VARCHAR(50) NOT NULL, " + "estado VARCHAR(20) NOT NULL, " + "cep VARCHAR(10) NOT NULL, "
				+ "complementocep VARCHAR(20), "
				+ "FOREIGN KEY (cpf) REFERENCES PESSOA(cpf) ON DELETE CASCADE)";
				
		try (Connection connection = Conexao.abrirConexao(); Statement stmt = connection.createStatement()) {

			stmt.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao query a tabela 'endereco'.");
		}

	}

	public void queryTabelaEmpresa() {
		String sql = "CREATE TABLE IF NOT EXISTS EMPRESA (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
				+ "cpf VARCHAR(50) NOT NULL, " + "nome VARCHAR(40) NOT NULL,"
				+ "FOREIGN KEY (cpf) REFERENCES PESSOA(cpf) ON DELETE CASCADE)";
		try (Connection connection = Conexao.abrirConexao(); Statement stmt = connection.createStatement()) {

			stmt.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao query a tabela 'empresa'.");
		}

	}

	public void queryTabelaProfissoes() {
		String sql = "CREATE TABLE IF NOT EXISTS PROFISSAO (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
				+ "codigoprofissao VARCHAR(14)  NOT NULL, " + "nome VARCHAR(35) NOT NULL, "
				+ "areadeatuacao VARCHAR(40)  NOT NULL, " + " salariobase VARCHAR(14)  NOT NULL" + ")";
		try (Connection connection = Conexao.abrirConexao(); Statement stmt = connection.createStatement()) {

			stmt.execute(sql);

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao query a tabela 'profissao'.");
		}

	}

	public void queryTabelaIntituicoes() {
		String sql = "CREATE TABLE IF NOT EXISTS INSTITUICAOENSINO (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
				+ "codigo VARCHAR(14)  NOT NULL, " + "nome VARCHAR(35) NOT NULL, "
				+ "areadeatuacao VARCHAR(40)  NOT NULL, " + " quantidadesemestres VARCHAR(14)  NOT NULL" + ")";
		try (Connection connection = Conexao.abrirConexao(); Statement stmt = connection.createStatement()) {
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao query a tabela 'profissao'.");
		}
	}
	public void queryTabelaFormacoes() {
		String sql = "CREATE TABLE IF NOT EXISTS FORMACOES (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
				+ "cpf VARCHAR(14)  NOT NULL, " + "codigo VARCHAR(10) NOT NULL, "
				+ "concluido VARCHAR(40)  NOT NULL, " + " datatermino VARCHAR(14) NULL," + " semestreatual VARCHAR(30)  NOT NULL" + ")";
		try (Connection connection = Conexao.abrirConexao(); Statement stmt = connection.createStatement()) {
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao query a tabela 'profissao'.");
		}

	}

	public void queryTodasAsTabelas() {
		queryTabelaPessoa();
		queryTabelaContatos();
		queryTabelaEndereco();
		queryTabelaEmpresa();
		queryTabelaProfissoes();
		queryTabelaIntituicoes();
		queryTabelaFormacoes();
		System.out.println("Banco conectado e tabelas criadas");
	}

	public List<Pessoa> trazPessoas() {
		RelacionamentoProvider relacionamentoProvider = new RelacionamentoProvider();
		List<Pessoa> pessoas = relacionamentoProvider.trazPessoas();
		return pessoas;

	}

	public void adicionarPessoa() {
		List<Pessoa> pessoas = trazPessoas();
		for (Pessoa pessoa : pessoas) {
			Pessoa novaPessoa = new Pessoa(pessoa.getNome(), pessoa.getSobrenome(), pessoa.getDataNascimento(),
					pessoa.getSexo(), pessoa.getCpf(), pessoa.getEstadoCivil(), pessoa.getConjuge(),null, null, null,
					null, null);
			new DadosDAO().cadastrarPessoa(novaPessoa);

		}
	}

	public void adicionarContato() {
		List<Pessoa> pessoas = trazPessoas();

		for (Pessoa pessoa : pessoas) {
			List<Contato> contatosPessoa = pessoa.getContatos();

			if (contatosPessoa != null) {
				for (Contato contato : contatosPessoa) {
					Contato contatos = new Contato(contato.getCpf(), contato.getTipo(), contato.getValor());

					new DadosDAO().cadastrarContato(contatos);
				}
			}
		}
	}

	public void adicionarEndereco() {
		List<Pessoa> pessoas = trazPessoas();

		for (Pessoa pessoa : pessoas) {
			List<Endereco> enderecoPessoa = pessoa.getEnderecos();

			if (enderecoPessoa != null) {
				for (Endereco endereco : enderecoPessoa) {
					Endereco enderecos = new Endereco(endereco.getCpf(), endereco.getTipoEndereco(), endereco.getPais(),
							endereco.getRua(), endereco.getNumero(), endereco.getBairro(), endereco.getCidade(),
							endereco.getEstado(), endereco.getCep(), endereco.getComplementoCep());

					new DadosDAO().cadastrarEndereco(enderecos);
				}
			}
		}
	}

	public void adicionarEmpresa() {
		List<Pessoa> pessoas = trazPessoas();

		for (Pessoa pessoa : pessoas) {
			Empresa empresaPessoa = pessoa.getEmpresa();

			if (empresaPessoa != null) {
				Empresa novaEmpresa = new Empresa(pessoa.getCpf(), empresaPessoa.getNome());

				new DadosDAO().cadastrarEmpresa(novaEmpresa);
			}
		}
	}

	public void adicionarProfissao() {
		List<Pessoa> pessoas = trazPessoas();

		for (Pessoa pessoa : pessoas) {
			List<Profissao> profissoes = pessoa.getProfissao();

			if (profissoes != null) {
				for (Profissao profissao : profissoes) {
					Profissao novaProfissao = new Profissao(profissao.getCodigo(), profissao.getNome(),
							profissao.getAreaDeAtuacao(), profissao.getSalarioBase());

					new DadosDAO().cadastrarProfissao(novaProfissao);
				}
			}
		}
	}
	
	public void adicionarFormacoes() {
		List<Pessoa> pessoas = trazPessoas();

		for (Pessoa pessoa : pessoas) {
			List<Escolaridade> formacoes = pessoa.getFormacoes();

			if (formacoes != null) {
				for (Escolaridade formacao : formacoes) {
					Escolaridade formando = new Escolaridade(formacao.getCpf(), formacao.getCodigo(), formacao.isConcluido(),formacao.getDataTermino(), formacao.getSemestreAtual());

					new DadosDAO().cadastrarFormacoes(formando);
				}
			}
		}
	}

	public void adicionarInstituicao() {
		List<Pessoa> pessoas = trazPessoas();

		for (Pessoa pessoa : pessoas) {
			List<InstituicaoEnsino> instituicoes = pessoa.getInstituicao();

			if (instituicoes != null) {
				for (InstituicaoEnsino instituicao : instituicoes) {
					InstituicaoEnsino novaInstituicao = new InstituicaoEnsino(instituicao.getCodigo(),
							instituicao.getNome(), instituicao.getAreaDeAtuacao(), instituicao.getQuantidadeSemestres(),
							null);
					new DadosDAO().cadastrarIntituicao(novaInstituicao);
				}
			}
		}
	}

	public void adicionarDadosPessoa() {
		adicionarPessoa();
		adicionarContato();
		adicionarEndereco();
		adicionarEmpresa();
		adicionarProfissao();
		adicionarInstituicao();
		adicionarFormacoes();
		System.out.println("Dados inseridos com Sucesso");
	}

	public void cadastrarPessoa(Pessoa Pessoa) {

		String sql = "INSERT INTO PESSOA ( NOME, SOBRENOME, DATANASCIMENTO, SEXO, CPF, ESTADOCIVIL,CONJUGE) VALUES (?,?, ?, ?, ?, ?, ?)";

		try (Connection connection = Conexao.abrirConexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, Pessoa.getNome());
			ps.setString(2, Pessoa.getSobrenome());
			ps.setString(3, Pessoa.getDataNascimento());
			ps.setString(4, Pessoa.getSexo());
			ps.setString(5, Pessoa.getCpf());
			ps.setString(6, Pessoa.getEstadoCivil());
			ps.setString(7, Pessoa.getConjuge());

			
			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao cadastrar pessoa.");
		}
	}

	public void cadastrarContato(Contato contato) {

		String sql = "INSERT INTO CONTATO (CPF, TIPOCONTATO, VALOR) VALUES (?, ?, ?)";

		try (Connection connection = Conexao.abrirConexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, contato.getCpf());
			ps.setString(2, contato.getTipo().name());
			ps.setString(3, contato.getValor());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao cadastrar contato.");
		}
	}

	public void cadastrarEndereco(Endereco Endereco) {

		String sql = "INSERT INTO ENDERECO (CPF, TIPOENDERECO, PAIS, RUA, NUMERO, BAIRRO, CIDADE, ESTADO, CEP, COMPLEMENTOCEP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection connection = Conexao.abrirConexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, Endereco.getCpf());
			ps.setString(2, Endereco.getTipoEndereco().name());
			ps.setString(3, Endereco.getPais());
			ps.setString(4, Endereco.getRua());
			ps.setString(5, Endereco.getNumero());
			ps.setString(6, Endereco.getBairro());
			ps.setString(7, Endereco.getCidade());
			ps.setString(8, Endereco.getEstado());
			ps.setString(9, Endereco.getCep());
			ps.setString(10, Endereco.getComplementoCep());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao cadastrar endereco.");
		}
	}

	public void cadastrarEmpresa(Empresa empresa) {

		String sql = "INSERT INTO EMPRESA (NOME, CPF) VALUES (?, ?)";
		try (Connection connection = Conexao.abrirConexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, empresa.getCpf());
			ps.setString(2, empresa.getNome());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao cadastrar empresa.");
		}
	}

	public void cadastrarProfissao(Profissao profissao) {

		String sql = "INSERT INTO PROFISSAO (CODIGOPROFISSAO, NOME, AREADEATUACAO, SALARIOBASE) VALUES (?, ?,?,?)";
		try (Connection connection = Conexao.abrirConexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, profissao.getCodigo());
			ps.setString(2, profissao.getNome());
			ps.setString(3, profissao.getAreaDeAtuacao());
			ps.setBigDecimal(4, profissao.getSalarioBase());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao cadastrar profissao.");
		}
	}
	public void cadastrarFormacoes(Escolaridade formacoes) {
	    String sql = "INSERT INTO FORMACOES (CPF, CODIGO, CONCLUIDO, DATATERMINO, SEMESTREATUAL) VALUES (?, ?, ?, ?, ?)";
	    
	    try (Connection connection = Conexao.abrirConexao(); 
	         PreparedStatement ps = connection.prepareStatement(sql)) {
	        ps.setString(1, formacoes.getCpf());
	        ps.setString(2, formacoes.getCodigo());
	        ps.setBoolean(3, formacoes.isConcluido());
	        if (formacoes.getDataTermino() != null) {
	            ps.setDate(4, java.sql.Date.valueOf(formacoes.getDataTermino()));
	        } else {
	            ps.setNull(4, java.sql.Types.DATE); 
	        }
	        ps.setString(5, formacoes.getSemestreAtual());
	        ps.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	        System.out.println("Erro ao cadastrar formação.");
	    }
	}


	public void cadastrarIntituicao(InstituicaoEnsino instituicao) {

		String sql = "INSERT INTO INSTITUICAOENSINO (CODIGO, NOME, AREADEATUACAO, QUANTIDADESEMESTRES) VALUES (?, ?,?,?)";
		try (Connection connection = Conexao.abrirConexao(); PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, instituicao.getCodigo());
			ps.setString(2, instituicao.getNome());
			ps.setString(3, instituicao.getAreaDeAtuacao());
			ps.setString(4, instituicao.getQuantidadeSemestres());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao cadastrar intituicao Ensino.");
		}
	}
}

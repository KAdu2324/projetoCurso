package br.com.qwasolucoes.mentoria.implementacoes.relacionamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import br.com.qwasolucoes.mentoria.modelagem_dados.Contato;
import br.com.qwasolucoes.mentoria.modelagem_dados.Empresa;
import br.com.qwasolucoes.mentoria.modelagem_dados.Endereco;
import br.com.qwasolucoes.mentoria.modelagem_dados.Escolaridade;
import br.com.qwasolucoes.mentoria.modelagem_dados.InstituicaoEnsino;
import br.com.qwasolucoes.mentoria.modelagem_dados.Pessoa;
import br.com.qwasolucoes.mentoria.modelagem_dados.Profissao;
import br.com.qwasolucoes.mentoria.modelagem_dados.TipoContato;
import br.com.qwasolucoes.mentoria.modelagem_dados.TipoEndereco;

public class TranformarCsv {

	public static final Function<String[], Contato> CONTATO_MAPPER = linha -> {
		if (linha.length >= 3) {
			String cpf = linha[0];
			int tipoCodigo = Integer.parseInt(linha[1]);
			String valor = linha[2];
			TipoContato tipo = TipoContato.fromValor(tipoCodigo);
			return new Contato(cpf, tipo, valor);
		}
		return null;
	};

	public static final Function<String[], Empresa> EMPRESA_MAPPER = linha -> {
		if (linha.length >= 1) {
			return new Empresa(linha[0], linha[2]);
		}
		return null;
	};

	public static final Function<String[], Escolaridade> ESCOLARIDADE_MAPPER = linha -> {
		   if (linha.length >= 5) {
		        String cpf = linha[0];
		        String codigo= linha[1];
		        boolean concluido;
		        LocalDate dataTermino = null;
		        String semestreAtual = linha[4];
		        
		        concluido = "Sim".equalsIgnoreCase(linha[2]);
		        if (linha[3] != null && !linha[3].trim().isEmpty()) {
		            try {
		                dataTermino = LocalDate.parse(linha[3], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		            } catch (DateTimeParseException e) {
		                e.printStackTrace();
		                return null;
		            }
		            
		        }
		        return new Escolaridade(cpf, codigo, concluido, dataTermino, semestreAtual);
		    }
		    return null;
		};
	
	public static final Function<String[], InstituicaoEnsino> INSTITUICAO_ENSINO_MAPPER = linha -> {
		if (linha.length >= 4) {
			String codigo = linha[0];
			String nomeInstituicao = linha[1];
			String areaDeAtuacao = linha[2];
			String quantidadeSemestres = linha[3];
			
			return new InstituicaoEnsino(codigo, nomeInstituicao, areaDeAtuacao, quantidadeSemestres, new ArrayList<>());
		}
		return null;
	};

	public static final Function<String[], Pessoa> PESSOA_MAPPER = linha -> {
		if (linha.length >= 7) {
			try {
				String nome = linha[0];
				String sobrenome = linha[1];
				String dataNascimento = linha[2];
				String sexo = linha[3];
				String cpf = linha[4];
				String estadoCivil = linha[5];

				String conjuge = linha[6];
				Empresa empresa = null;
				List<Endereco> enderecos = new ArrayList<>();
				List<Contato> contatos = new ArrayList<>();
				List<Escolaridade> formacoes = new ArrayList<>();
				List<Profissao> profissao = new ArrayList<>();

				return new Pessoa(nome, sobrenome, dataNascimento, sexo, cpf, estadoCivil, conjuge, empresa,
						enderecos, contatos, formacoes, profissao);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
		
	};

	public static final Function<String[], Profissao> PROFISSAO_MAPPER = linha -> {
        
		if (linha.length >= 4) {
            try {
            	
                String codigoProfissaoStr = linha[0];
                String nome = linha[1];
                String areaDeAtuacao = linha[2];
                String salarioBaseStr = linha[3].replace(".", "").replace(",", ".");

                BigDecimal salarioBase = new BigDecimal(salarioBaseStr);

                return new Profissao(codigoProfissaoStr, nome, areaDeAtuacao, salarioBase);
            }catch (IllegalArgumentException e) {
	            e.printStackTrace();
	        }
            }
        return null;
    };
    
    public static final Function<String[], Endereco> ENDERECO_MAPPER = linha -> {
		if (linha.length == 10) {
	        try {
	            String cpf = linha[0];
	            TipoEndereco tipoEndereco = TipoEndereco.fromString(linha[1]);
	            String pais = linha[2];
	            String rua = linha[3];
	            String numero = linha[4];
	            String bairro = linha[5];
	            String cidade = linha[6];
	            String estado = linha[7];
	            String cep = linha[8];
	            String complementoCep = linha[9];

	            return new Endereco(cpf, tipoEndereco, pais, rua, numero, bairro, cidade, estado, cep, complementoCep);
	        } catch (IllegalArgumentException e) {
	            e.printStackTrace();
	        }
	    } 
	    return null;
	};
}

package br.com.qwasolucoes.mentoria.implementacoes.estrutura_dados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.qwasolucoes.mentoria.interfaces.estrutura_dados.EstruturaDadosMap;
import br.com.qwasolucoes.mentoria.model.ContatoFuncionario;
import br.com.qwasolucoes.mentoria.model.Funcionario;

public class EstruturaDadosMapProvider implements EstruturaDadosMap {

	@Override
	public Map<String, Integer> nomeFrequencia(List<String> nomes) {
		 Map<String, Integer> frequenciaMap = new HashMap<>();
	        
	        for (String nome : nomes) {
	            if (frequenciaMap.containsKey(nome)) {
	                frequenciaMap.put(nome, frequenciaMap.get(nome) + 1);
	            } else {
	                frequenciaMap.put(nome, 1);
	            }
	        }
	        
	        return frequenciaMap;
	    }
	@Override
	public Map<String, Integer> mapaFrequenciaValores(Map<String, String> mapa) {

		Map<String, Integer> frequencias = new HashMap<>();
        for (String valor : mapa.values()) {
            if (frequencias.containsKey(valor)) {
                frequencias.put(valor, frequencias.get(valor) + 1);
            } else {
                frequencias.put(valor, 1);
            }
        }

        return frequencias;
    }

	@Override
	public Map<String, Integer> mapaFrequenciaValoresLista(Map<String, List<String>> mapa) {
		
		 Map<String, Integer> frequenciaMap = new HashMap<>();
	        
	        for (Map.Entry<String, List<String>> entry : mapa.entrySet()) {
	            List<String> listaValores = entry.getValue();
	            
	            for (String valor : listaValores) {
	                frequenciaMap.put(valor, frequenciaMap.getOrDefault(valor, 0) + 1);
	            }
	        }
	        
	        return frequenciaMap;
	    }
	
	@Override
	public Map<String, List<String>> nomeTelefones(List<String> elemento) {
        
		Map<String, List<String>> resultadoTelefones = new HashMap<>();

        for (String elementoDado : elemento) {
            String[] partes = elementoDado.split(";");
            if (partes.length < 2) {
                continue; 
            }

            String nome = partes[0];
            String[] telefones = partes[1].split(",");

            List<String> listaTelefones = new ArrayList<>(Arrays.asList(telefones));

            resultadoTelefones.put(nome, listaTelefones);
        }

        return resultadoTelefones;
    }

	

	@Override
	public Map<Funcionario, List<ContatoFuncionario>> cpfCnpjTelefonesObjeto(List<String> elemento) {
		
		Map<Funcionario, List<ContatoFuncionario>> resultado = new HashMap<>();

		for (String s : elemento) {
			String[] partes = s.split(";");
			if (partes.length != 2) {
				continue;
			}
			String cpfCnpj = partes[0];
			String[] telefones = partes[1].split(",");
			List<ContatoFuncionario> listaContatos = Arrays.stream(telefones).map(telefone -> new ContatoFuncionario(telefone))
					.collect(Collectors.toList());
			Funcionario funcionario = new Funcionario();
			funcionario.setCpfCnpj(cpfCnpj);

			resultado.put(funcionario, listaContatos);
		}

		return resultado;
	}

	@Override
	public List<String> chavesMapa(Map<String, String> mapa) {
		List<String> chaves = new ArrayList<>();
		Set<String> chavesSet = mapa.keySet();
		chaves.addAll(chavesSet);
		return chaves;
	}

	@Override
	public List<String> valoresMapa(Map<String, String> mapa) {
		Collection<String> valores = mapa.values();

		return new ArrayList<>(valores);
	}

	@Override
	public Map<String, List<Integer>> nomeTelefones(int limite) {
		Map<String, List<Integer>> mapa = new HashMap<>();
		mapa.put("NUMEROS_PARES", new ArrayList<>());
		mapa.put("NUMEROS_IMPARES", new ArrayList<>());
		mapa.put("NUMEROS_PRIMOS", new ArrayList<>());
		mapa.put("NUMEROS_MULTIPLOS_10", new ArrayList<>());

		for (int i = 1; i <= limite; i++) {
			if (i % 2 == 0) {
				mapa.get("NUMEROS_PARES").add(i);
			} else {
				mapa.get("NUMEROS_IMPARES").add(i);
			}
			if (validarNumeroPrimo(i)) {
				mapa.get("NUMEROS_PRIMOS").add(i);
			}
			if (i % 10 == 0) {
				mapa.get("NUMEROS_MULTIPLOS_10").add(i);
			}
		}

		return mapa;
	}

	private boolean validarNumeroPrimo(int num) {
		if (num <= 1)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	@Override
	public Integer maiorNumeroEntreValores(Map<String, List<Integer>> map) {

		int maiorNumero = Integer.MIN_VALUE;

		for (List<Integer> lista : map.values()) {
			for (int numero : lista) {
				if (numero > maiorNumero) {
					maiorNumero = numero;
				}
			}
		}

		return maiorNumero;
	}

	@Override
	public String chaveMaiorNumeroEntreValores(Map<String, List<Integer>> map) {

		String chaveMaior = null;
		int maiorNumero = Integer.MIN_VALUE;

		for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
			String chave = entry.getKey();
			List<Integer> valores = entry.getValue();

			for (Integer valor : valores) {
				if (valor > maiorNumero) {
					maiorNumero = valor;
					chaveMaior = chave;
				}
			}
		}

		return chaveMaior;
	}
}

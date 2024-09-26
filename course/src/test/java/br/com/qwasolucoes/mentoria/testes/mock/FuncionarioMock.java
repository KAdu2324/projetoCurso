package br.com.qwasolucoes.mentoria.testes.mock;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.qwasolucoes.mentoria.model.Funcionario;

public class FuncionarioMock {

	public static List<String> funcionariosMockString() {
		return Arrays.asList(
				"RWAN                Souza               15061994MANALISTA DESENVOLVEDOR JUNIOR           51979313805   SUPERIOR COMPLETO                       1566560000",
				"LUCAS               Ferreira            29011975MANALISTA DESENVOLVEDOR SENIOR           71979313805   SUPERIOR COMPLETO                       8800000000",
				"JOAN                Silveira            15011991MANALISTA DESENVOLVEDOR PLENO            67979313805   SUPERIOR COMPLETO                       8800000000");
	}

	public static List<Funcionario> funcionarios() {

		List<Funcionario> funcionarios = new ArrayList<>();
		for (String funcionario : funcionariosMockString()) {
			try {
				funcionarios.add(UtilitariosMock.conversaoStringToFuncionario(funcionario));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return funcionarios;
	}

	public static String[] funcionarioMockArray() {

		String[] funcionario = new String[8];

		funcionario[0] = "RWAN";
		funcionario[1] = "Souza";
		funcionario[2] = "15061994";
		funcionario[3] = "M";
		funcionario[4] = "ANALISTA DESENVOLVEDOR JUNIOR";
		funcionario[5] = "51979313805";
		funcionario[6] = "SUPERIOR COMPLETO";
		funcionario[7] = "1566560000";

		return funcionario;
	}

	public static String[][] funcionarioArrayMulti() {

		String[][] funcionario = new String[3][8];

		funcionario[0][0] = "RWAN";
		funcionario[0][1] = "Souza";
		funcionario[0][2] = "15061994";
		funcionario[0][3] = "M";
		funcionario[0][4] = "ANALISTA DESENVOLVEDOR JUNIOR";
		funcionario[0][5] = "51979313805";
		funcionario[0][6] = "SUPERIOR COMPLETO";
		funcionario[0][7] = "1566560000";

		funcionario[1][0] = "LUCAS";
		funcionario[1][1] = "Ferreira";
		funcionario[1][2] = "29011975";
		funcionario[1][3] = "M";
		funcionario[1][4] = "ANALISTA DESENVOLVEDOR SENIOR";
		funcionario[1][5] = "71979313805";
		funcionario[1][6] = "SUPERIOR COMPLETO";
		funcionario[1][7] = "8800000000";

		funcionario[2][0] = "JOAN";
		funcionario[2][1] = "Silveira";
		funcionario[2][2] = "15011991";
		funcionario[2][3] = "M";
		funcionario[2][4] = "ANALISTA DESENVOLVEDOR PLENO";
		funcionario[2][5] = "67979313805";
		funcionario[2][6] = "SUPERIOR COMPLETO";
		funcionario[2][7] = "8800000000";

		return funcionario;
	}
}

package br.com.qwasolucoes.mentoria.testes.mock;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import br.com.qwasolucoes.mentoria.model.Funcionario;

public class UtilitariosMock {

	private final static Integer DEZOITO_ANOS = 18;
	private final static Integer VINTE_QUATRO_ANOS = 24;
	private final static Integer TRINTA_32_ANOS = 32;
	private final static Integer CINQUENTA_ANOS = 50;

	private final static BigDecimal FAIXA_ETARIA_18 = new BigDecimal("0.2");
	private final static BigDecimal FAIXA_ETARIA_19_AOS_23 = new BigDecimal("0.15");
	private final static BigDecimal FAIXA_ETARIA_24_AOS_31 = new BigDecimal("0.1");
	private final static BigDecimal FAIXA_ETARIA_32_AOS_49 = new BigDecimal("0.05");
	private final static BigDecimal FAIXA_ETARIA_50 = new BigDecimal("0.01");

	public static Funcionario conversaoStringToFuncionario(String func) throws ParseException {
		SimpleDateFormat formatterDate = new SimpleDateFormat("ddMMyyyy");
		Date datanascimento = formatterDate.parse(func.substring(40, 48));
		Integer idade = calcularIdade(datanascimento);

		Boolean maiorIdade = idade >= 18 ? true : false;
		BigDecimal salario = new BigDecimal(func.substring(143, 153).replaceAll("\\D", ""));

		BigDecimal taxaSalario = taxa(salario, idade);

		BigDecimal salarioLiquido = salario.subtract(taxaSalario);

		return new Funcionario(func.substring(0, 20).trim(), func.substring(20, 40).trim(), datanascimento, idade,
				func.substring(48,49), func.substring(49, 89).trim(), func.substring(103, 142).trim(),
				func.substring(89, 102).trim(), salario, maiorIdade, taxaSalario, salarioLiquido);
	}

	public static BigDecimal taxa(BigDecimal salario, Integer idade) {
		if (idade <= DEZOITO_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_18);
		}

		if (idade > DEZOITO_ANOS && idade < VINTE_QUATRO_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_19_AOS_23);
		}

		if (idade >= VINTE_QUATRO_ANOS && idade < TRINTA_32_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_24_AOS_31);
		}

		if (idade >= TRINTA_32_ANOS && idade <= CINQUENTA_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_32_AOS_49);
		}

		if (idade > CINQUENTA_ANOS) {
			return salario = salario.multiply(FAIXA_ETARIA_50);
		}

		return null;
	}

	public static Integer calcularIdade(Date dataNascimento) {

		Calendar today = Calendar.getInstance();

		Calendar dataNascimentoConvert = Calendar.getInstance();
		dataNascimentoConvert.setTime(dataNascimento);

		int idade = today.get(Calendar.YEAR) - dataNascimentoConvert.get(Calendar.YEAR);

		if (today.get(Calendar.MONTH) < dataNascimentoConvert.get(Calendar.MONTH)
				|| (today.get(Calendar.MONTH) == dataNascimentoConvert.get(Calendar.MONTH)
						&& today.get(Calendar.DAY_OF_MONTH) < dataNascimentoConvert.get(Calendar.DAY_OF_MONTH))) {
			idade--;
		}

		return idade;
	}

}

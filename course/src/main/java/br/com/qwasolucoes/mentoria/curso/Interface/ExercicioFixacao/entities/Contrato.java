package br.com.qwasolucoes.mentoria.curso.Interface.ExercicioFixacao.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private LocalDate data;
	private Double totalValor;
	
	private List<Parcela> parcela = new ArrayList<>();
	
	public Contrato() {
		
	}

	public Contrato(Integer numero, LocalDate data, Double totalValor) {
		this.numero = numero;
		this.data = data;
		this.totalValor = totalValor;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getTotalValor() {
		return totalValor;
	}

	public void setTotalValor(Double totalValor) {
		this.totalValor = totalValor;
	}

	public List<Parcela> getParcela() {
		return parcela;
	}
}

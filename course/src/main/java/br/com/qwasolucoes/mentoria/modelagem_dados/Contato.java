package br.com.qwasolucoes.mentoria.modelagem_dados;

import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "contato")
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@ManyToOne
	@JoinTable(name = "cpf_id")
    private String cpf;
   
    private TipoContato tipo;
    private String valor;

    public Contato(String cpf, TipoContato tipo, String valor) {
        this.cpf = cpf;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoContato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContato tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    @Override
    public String toString() {
        return "Contato{" +
               "cpf='" + cpf + '\'' +
               ", tipo=" + tipo +
               ", valor='" + valor + '\'' +
               '}';
    }

	public static Stream<String> stream() {
		// TODO Auto-generated method stub
		return null;
	}
}


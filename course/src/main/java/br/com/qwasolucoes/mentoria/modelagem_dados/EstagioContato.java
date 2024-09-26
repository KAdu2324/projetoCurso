package br.com.qwasolucoes.mentoria.modelagem_dados;

public class EstagioContato {
	private String cpf;
    private TipoContato tipo;
    private String valor;
    
    public EstagioContato(String cpf, TipoContato tipo, String valor) {
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
        return "EstagioContato{" +
               "cpf='" + cpf + '\'' +
               ", tipo=" + tipo +
               ", valor='" + valor + '\'' +
               '}';
    }

}

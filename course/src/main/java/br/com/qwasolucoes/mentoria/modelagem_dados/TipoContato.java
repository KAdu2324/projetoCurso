package br.com.qwasolucoes.mentoria.modelagem_dados;

public enum TipoContato {
    TELEFONE(1),
    CELULAR(2),
    EMAIL(3);

    private final int valor;

    TipoContato(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public static TipoContato fromValor(int valor) {
        for (TipoContato tipo : values()) {
            if (tipo.getValor() == valor) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Valor de tipo de contato inválido: " + valor);
    }
}
    

package br.com.qwasolucoes.mentoria.modelagem_dados;

public enum TipoEndereco {
    RESIDENCIAL, COMERCIAL;

    public static TipoEndereco fromString(String tipo) {
        switch (tipo.toUpperCase()) {
            case "R":
                return RESIDENCIAL;
            case "P":
                return COMERCIAL;
            default:
                throw new IllegalArgumentException("Tipo de endereço desconhecido: " + tipo);
        }
    }
}

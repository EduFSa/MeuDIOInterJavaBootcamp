package one.digitalinnovation.collections.comparators;

public class Volta {
    private Integer numero;
    private Float tempoEmSegundos;
    private Boolean valida;
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    public Volta(Integer numero, Float tempoEmSegundos, Boolean valida) {
        this.numero = numero;
        this.tempoEmSegundos = tempoEmSegundos;
        this.valida = valida;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Float getTempoEmSegundos() {
        return tempoEmSegundos;
    }

    public void setTempoEmSegundos(Float tempoEmSegundos) {
        this.tempoEmSegundos = tempoEmSegundos;
    }

    public Boolean getValida() {
        return valida;
    }

    public void setValida(Boolean valida) {
        this.valida = valida;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();

        // Caso a volta seja inválida, imprime em vermelho
        if (!this.valida)
            ret.append(ANSI_RED);
        ret.append("Volta ");
        ret.append(this.numero);
        ret.append(" : ");
        ret.append(String.format("%.3fs", this.tempoEmSegundos));
        // Reseta o vermelho ao terminar de imprimir a volta
        if (!this.valida)
            ret.append(ANSI_RESET);

        return ret.toString();
    }

}

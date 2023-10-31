import java.util.List;

public class BebidaEmCopo {
    private Bebida bebida;

    public BebidaEmCopo(Bebida bebida) {
        validar(bebida);
        this.bebida = bebida;
    }

    private void validar(Bebida bebida) {
        if (Valida.isNull(bebida)) throw new IllegalArgumentException("Bebida invalida");
    }

    @Override
    public String toString() {
        return "Agua: " + this.bebida.getAgua().toString() + ";\nMistura: " + formatar(this.bebida.getMistura());
    }

    private String formatar(List<String> mistura) {
        String saida = "";

        for (String elemento : mistura) {saida += elemento + " ";}

        return saida;
    }
}

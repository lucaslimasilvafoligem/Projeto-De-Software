
public class Agua {
    private Double qtd;
    private String temperatura; // Quente ou frio pra simplificar, podia ser um Enum, mas enfim...

    public Agua(Double qtd, String temperatura) {
        validar(qtd);
        validar(temperatura);
        this.qtd = qtd;
        this.temperatura = temperatura;
    }

    private void validar(String temperatura) {
        if (Valida.validarString(temperatura)) {
            throw new IllegalArgumentException("str invalida");
        }
    }

    private void validar(Double qtd) {
        if (Valida.isNull(qtd) || !Valida.validarValor(qtd)) {
            throw new IllegalArgumentException("qtd invalida");
        }
    }

    @Override
    public String toString() {return "Quantidade: " + this.qtd + " Temperatura: " + this.temperatura;}
}

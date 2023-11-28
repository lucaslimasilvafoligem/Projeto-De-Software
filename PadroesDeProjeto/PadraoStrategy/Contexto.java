import java.util.List;

public class Contexto {
    private List<String> texto;
    private Exportador exp;

    public Contexto(List<String> texto, Exportador exp) {
        System.out.println(exp);
        validarTexto(texto);
        this.texto = texto;
        this.exp = exp;
    }

    public void exportar() {System.out.println(this.exp.exportar(texto));}

    public void setExp(Exportador exp) {
        this.exp = exp;
    }

    private void validarTexto(List<String> texto) {
        if (Validador.textoListInvalido(texto)) {
            throw new IllegalArgumentException("List texto invalido");
        }
    }
}
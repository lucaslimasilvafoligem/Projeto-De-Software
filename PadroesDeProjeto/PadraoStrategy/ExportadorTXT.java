import java.util.List;

public class ExportadorTXT implements Exportador{

    @Override
    public String exportar(List<String> paragrafos) {
        validar(paragrafos);
        String texto = "";

        for (String paragrafo : paragrafos) {texto += paragrafo + "\n";}
        validarTexto(texto);
        return texto;
    }

    private void validar(List<String> paragrafos) {
        if(Validador.textoListInvalido(paragrafos)) {
            throw new IllegalArgumentException("Texto list invalido");
        }
    }

    private void validarTexto(String paragrafos) {
        if(Validador.validarTextoString(paragrafos)){
            throw new IllegalArgumentException("Nao ha conteudo para formatar");
        }
    }  
}
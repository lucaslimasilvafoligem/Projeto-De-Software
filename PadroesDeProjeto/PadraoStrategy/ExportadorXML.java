import java.util.List;

public class ExportadorXML implements Exportador {

    @Override
    public String exportar(List<String> paragrafos) {
        validar(paragrafos);
        String texto = "<doc>\n";

        for (String paragrafo : paragrafos) {texto += "<parag>" + paragrafo + "</parag>\n";}
        validarTexto(texto);
        return texto + "</doc>";
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

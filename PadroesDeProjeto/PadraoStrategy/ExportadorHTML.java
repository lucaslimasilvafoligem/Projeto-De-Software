import java.util.List;

public class ExportadorHTML implements Exportador{

    @Override
    public String exportar(List<String> paragrafos) {
        validar(paragrafos);
        String texto = "<html><body>\n";

        for (String paragrafo : paragrafos) {texto += "<p>" + paragrafo + "<p>\n";}
        validarTexto(texto);
        return texto + "</body></html>";
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

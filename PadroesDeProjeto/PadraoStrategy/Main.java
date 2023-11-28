import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> texto = new ArrayList<>();
        texto.add("Olha que coisa mais linda, mais cheia de graça");
        texto.add("É ela menina que vem e que passa, Num doce balanço a caminho do mar");
        texto.add("Moça do corpo dourado do sol de Ipanema, O seu balançado é mais que um poema");
        texto.add("É a coisa mais linda que eu já vi passar");

        Exportador exp = new ExportadorTXT();

        Contexto contexto = new Contexto(texto, exp);

        contexto.exportar();

        contexto.setExp(new ExportadorHTML());

        contexto.exportar();

        contexto.setExp(new ExportadorXML());

        contexto.exportar();
    } 
}

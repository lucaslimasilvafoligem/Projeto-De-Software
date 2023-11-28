import java.util.List;

public class Validador {
    public static boolean isNull(List<String> texto) {return texto == null;}

    public static boolean textoListInvalido(List<String> texto) {return texto == null || texto.isEmpty();}

    public static boolean validarTextoString(String texto) {return texto != null && texto.trim().equals("");}
}
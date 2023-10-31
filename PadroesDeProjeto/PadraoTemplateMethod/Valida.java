public class Valida {

    public static boolean validarValor(Double valor) {return valor >= 0;}

    public static boolean isNull(Object object) {return object == null;}

    public static boolean validarString(String str) {return isNull(str) || str.trim().equals("");}
    
}

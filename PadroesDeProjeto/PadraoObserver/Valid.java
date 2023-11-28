public class Valid {
    public static boolean isNull(Object object) {return object == null;}

    public static boolean validarString(String str) {return str != null && !str.trim().equals("");}
}

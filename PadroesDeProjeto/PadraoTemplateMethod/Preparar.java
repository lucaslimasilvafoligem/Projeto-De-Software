public class Preparar {

    public static void main(String[] args) {
        Lanchonete lanchonete1 = new Cafe();
        Copo beb1 = lanchonete1.ServirBebida();
        System.out.println(beb1.toString());

        Lanchonete lanchonete2 = new Cha();
        Copo beb2 = lanchonete2.ServirBebida();
        System.out.println(beb2.toString());
    }
    
}

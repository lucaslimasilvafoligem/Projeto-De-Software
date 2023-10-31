import java.util.List;

public class Bebida {
    private Agua agua;
    private List<String> mistura;

    public Bebida(Agua agua, List<String> mistura) {
        this.agua = agua;
        this.mistura = mistura;
    }

    public Agua getAgua() {return this.agua;}

    public List<String> getMistura() {return this.mistura;}
}

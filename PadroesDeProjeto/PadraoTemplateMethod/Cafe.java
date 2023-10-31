import java.util.ArrayList;
import java.util.List;

public class Cafe extends Lanchonete {

    @Override
    protected Bebida prepararBebida(Agua agua) {
        super.validar(agua);
        List<String> mistura = new ArrayList<>();
        mistura.add(moer());
        mistura.add(coar());
        return new Bebida(agua, mistura);
    }

    private String coar() {return "Coar";}

    private String moer() {return "Moer";}
    
}

import java.util.ArrayList;
import java.util.List;

public class Cha extends Lanchonete {

    @Override
    protected Bebida prepararBebida(Agua agua) {
        super.validar(agua);
        List<String> mistura = new ArrayList<>();
        mistura.add(saquinho());
        mistura.add(limao());
        return new Bebida(agua, mistura);
    }

    private String limao() {return "limão";}

    private String saquinho() {return "erva";}
    
}

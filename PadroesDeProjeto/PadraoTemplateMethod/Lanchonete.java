public abstract class Lanchonete {

    public BebidaEmCopo ServirBebida() {
        Agua agua = esquentarAgua();
        Bebida bebida = prepararBebida(agua);
        return servirCopo(bebida);
    }
    
    protected abstract Bebida prepararBebida(Agua agua);

    private BebidaEmCopo servirCopo(Bebida bebida) {return new BebidaEmCopo(bebida);}

    private Agua esquentarAgua() {return new Agua(10.0, "Quente");}

    protected void validar(Object object) {
        if (Valida.isNull(object)) {throw new IllegalArgumentException("Não pode ser null");}
    }
}

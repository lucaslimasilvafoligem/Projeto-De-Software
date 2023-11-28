public abstract class Lanchonete {

    public Copo ServirBebida() {
        Agua agua = esquentarAgua();
        Bebida bebida = prepararBebida(agua);
        return servirCopo(bebida);
    }
    
    protected abstract Bebida prepararBebida(Agua agua);

    private Copo servirCopo(Bebida bebida) {return new Copo(bebida);}

    private Agua esquentarAgua() {return new Agua(10.0, "Quente");}

    protected void validar(Object object) {
        if (Valida.isNull(object)) {throw new IllegalArgumentException("Não pode ser null");}
    }
}

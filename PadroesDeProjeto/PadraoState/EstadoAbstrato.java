public abstract class EstadoAbstrato implements EstadoInterface {
    private User adm;

    @Override
    public void publicar() {}

    @Override
    public void setDocumento(Documento documento) {}

    public void setAdm(User adm) {
    validar(adm);
    if (!adm.isAdm()) {throw new IllegalArgumentException("O usuário não é um administrador.");}
    this.adm = adm;
}

    public void isAdm() {
        if(Valida.isNull(adm) || !adm.isAdm()) throw new IllegalArgumentException();
    }

    public void validar(Object object) {
        if (Valida.isNull(object)) throw new IllegalArgumentException("Nao pode ser null");
    } 
}
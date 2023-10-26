public abstract class EstadoAbstrato implements EstadoInterface {
    private User adm;

    @Override
    public void publicar() {}

    @Override
    public void setDocumento(Documento documento) {}

    @Override
    public void setAdm(User adm) {
    validar(adm);
    this.adm = adm;
    }

    public void isAdm() {
        if(Valida.isNull(adm) || !adm.isAdm()) throw new IllegalArgumentException("Adm inválido");
    }

    public void validar(Object object) {
        if (Valida.isNull(object)) throw new IllegalArgumentException("Não pode ser null");
    }
    
    public void validarAdm(Object object) {
        if(Valida.isNull(adm) || !adm.isAdm()) throw new IllegalArgumentException("Adm inválido");
    } 
}
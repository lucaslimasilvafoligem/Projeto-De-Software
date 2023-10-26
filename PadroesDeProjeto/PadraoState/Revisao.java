public class Revisao extends EstadoAbstrato {
    private Documento documento;

    @Override
    public void setDocumento(Documento documento) {
        validar(documento);
        this.documento = documento;
    }

    @Override
    public void publicar() {
        super.isAdm();
        EstadoInterface estadoInterface = new Publicadora();
        estadoInterface.setDocumento(documento);
        documento.mudarEstado(estadoInterface);
    }
}
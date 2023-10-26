public class Rascunho extends EstadoAbstrato{
    private Documento documento;

    @Override
    public void setDocumento(Documento documento) {
        validar(documento);
        this.documento = documento;
    }

    @Override
    public void publicar() {
        EstadoInterface estadoInterface = new Revisao();
        estadoInterface.setDocumento(documento);
        documento.mudarEstado(estadoInterface);
    }
}
public class Publicadora extends EstadoAbstrato{
    private Documento documento;

    @Override
    public void setDocumento(Documento documento) {
        validar(documento);
        this.documento = documento;
    }

    @Override
    public void publicar() {
        System.out.println(documento.getTexto());
    }
}
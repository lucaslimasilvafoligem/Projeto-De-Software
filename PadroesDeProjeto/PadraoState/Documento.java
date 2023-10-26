public class Documento {

    private EstadoInterface documento;
    private String texto;

    public Documento(EstadoInterface estadoInterface, String texto) {
        validar(estadoInterface);
        validar(texto);
        this.documento = estadoInterface;
        this.texto = texto;
        this.documento.setDocumento(this);
    }

    public void publicar() {this.documento.publicar();}

    public void mudarEstado(EstadoInterface estadoInterface) {
        validar(estadoInterface);
        this.documento = estadoInterface;
    }

    public String getTexto() {
        return texto;
    }

    public void validar(Object object) {
        if (Valida.isNull(object)) throw new IllegalArgumentException();
    }

    public void inserirAdm(User user) {
        documento.setAdm(user);
    }
}
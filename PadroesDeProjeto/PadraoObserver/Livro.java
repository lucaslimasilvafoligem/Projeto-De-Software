public class Livro {
    private String titulo;
    private String texto;
    private String autor;
    private String aData;

    public Livro (String titulo, String texto, String autor, String aData) {
        validar(titulo);
        validar(texto);
        validar(autor);
        validar(aData);
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.aData = aData;
    }

    public String getaData() {return aData;}

    public String getTitulo() {return titulo;}

    private void validar(String valor) {
        if (!Valid.validarString(valor)) {
            throw new IllegalArgumentException("Parametro invalido em Livro");
        }
    }
}

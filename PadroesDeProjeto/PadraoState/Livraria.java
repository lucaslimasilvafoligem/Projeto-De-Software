public class Livraria {
    public static void main(String[] args) {
        User user = new User("Lucas", true);
        String texto = "Voce têm brio?";
        EstadoInterface estadoInterface = new Rascunho();
        Documento documento = new Documento(estadoInterface, texto);
        documento.publicar();
        documento.inserirAdm(user);
        documento.publicar();
        documento.publicar();
    }
}

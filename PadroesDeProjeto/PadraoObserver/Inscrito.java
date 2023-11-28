
public class Inscrito implements InscritoInterface {
    private String nome;
    private Livro livro;
    
    public Inscrito(String nome) {
        validarString(nome);
        this.nome = nome;
    }

    @Override
    public void notificar(String titulo) {
        System.out.println("Olá " + this.nome + " há uma novidade no livro: " + titulo);
    }

    @Override
    public void atualizar(Livro livro) {
        validar(livro);
        this.livro = livro;
    }

    private void validar(Object obj) {
        if (Valid.isNull(obj)) throw new IllegalArgumentException("Livro invalido");
    }

    private void validarString(String valor) {
        if (!Valid.validarString(valor)) {
            throw new IllegalArgumentException("Parametro invalido em Livro");
        }
    }

}

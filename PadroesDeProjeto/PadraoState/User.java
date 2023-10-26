
public class User {
    private String nome;
    private boolean adm;

    public User(String nome, boolean adm) {
        validar(nome);
        this.nome = nome;
        this.adm = adm;
    }

    private void validar(String nome) {
        if (Valida.isNull(nome) || nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome nao pode ser null");
        }
    }

    public boolean isAdm() {return adm;}

    @Override
    public String toString() {return "Adm: " + nome;}
}

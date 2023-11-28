import java.util.ArrayList;
import java.util.List;

public class PublicadoraL {
    private List<InscritoInterface> inscritos;
    private Livro livro;

    public PublicadoraL(Livro livro) {
        validar(livro);
        this.livro = livro;
        this.inscritos = new ArrayList<>();
    }

    public void addInscrito(InscritoInterface inscrito) {
        validar(inscrito);
        this.inscritos.add(inscrito);
    }

    public void removeInscrito(InscritoInterface inscrito) {
        validar(inscrito);
        this.inscritos.remove(inscrito);
    }

    public void notificar() {
        for (InscritoInterface inscritoInterface : inscritos) {
            inscritoInterface.notificar(livro.getTitulo());
        }
    }

    public void atualizar() {
        for (InscritoInterface inscritoInterface : inscritos) inscritoInterface.atualizar(this.livro);
    }

    public void setLivro(Livro livro) {
        validar(livro);
        this.livro = livro;
    }

    private void validar(Object obj) {
        if (Valid.isNull(obj)) throw new IllegalStateException("Publicadora: Livro invalido");
    }
}

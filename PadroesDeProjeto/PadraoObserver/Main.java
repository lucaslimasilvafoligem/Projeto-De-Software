public class Main {
    public static void main(String[] args) {
        InscritoInterface inscrito1 = new Inscrito("Lucas");
        InscritoInterface inscrito2 = new Inscrito("outro Lucas");
        Livro livro = new Livro("Blade Runner", "Todos esses momentos ficarão perdidos no tempo, como lágrimas na chuva...", "Roy", "1982");
        PublicadoraL pub = new PublicadoraL(livro);
        pub.addInscrito(inscrito1);
        pub.addInscrito(inscrito2);
        pub.notificar();
        Livro l2 = new Livro("A", "B", "C", "D");
        pub.setLivro(l2);
        pub.atualizar();
        pub.notificar();
        pub.removeInscrito(inscrito2);
        pub.notificar();
    } 
}

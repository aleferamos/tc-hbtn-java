public class Program {
    public static void main(String[] args) {

        try {
            Livro livro1 = new Livro(
                    "As barbas do imperador: D. Pedro II",
                    "Lilia Moritz Schwarcz",
                    56);

            returnLivro(livro1);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            LivroEdicaoOuro livroEdicaoOuro1 = new LivroEdicaoOuro(
                    "Xato",
                    "Fernando Morais",
                    38.30);

            returnLivro(livroEdicaoOuro1);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            LivroEdicaoOuro livroEdicaoOuro2 = new LivroEdicaoOuro(
                    "Ladrao de Raios",
                    "Rick",
                    21.88);

            returnLivro(livroEdicaoOuro2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            Livro livro2 = new Livro(
                    "ab",
                    "Jane Doe",
                    15.99);

            returnLivro(livro2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            Livro livro3 = new Livro(
                    "Harry Potter e o enigma do principe",
                    "J.K. Rowling",
                    0);

            returnLivro(livro3);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }

    private static void returnLivro(Livro livro){
        System.out.printf("Titulo: %s - Autor: %s - Preco: %.4s0\n",
                livro.getTitulo(),
                livro.getAutor(),
                String.valueOf(livro.getPreco()).replace(".",","));
    }

    private static void returnLivro(LivroEdicaoOuro livro){
        System.out.printf("Titulo: %s - Autor: %s - Preco: %.4s0\n",
                livro.getTitulo(),
                livro.getAutor(),
                String.valueOf(livro.getPreco()).replace(".",","));
    }
}

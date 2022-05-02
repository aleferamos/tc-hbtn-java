public class Program {
    public static void main(String[] args) {
        try {
            Livro livro1 = new Livro();
            livro1.setTitulo("As barbas do imperador: D. Pedro II");
            livro1.setAutor("Lilia Moritz Schwarcz");
            livro1.setPreco(56);

            returnLivro(livro1);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            LivroEdicaoOuro livroEdicaoOuro1 = new LivroEdicaoOuro();

            livroEdicaoOuro1.setTitulo("Xato");
            livroEdicaoOuro1.setAutor("Fernando Morais");
            livroEdicaoOuro1.setPreco(38.30);

            returnLivro(livroEdicaoOuro1);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            LivroEdicaoOuro livroEdicaoOuro2 = new LivroEdicaoOuro();
            livroEdicaoOuro2.setTitulo("Ladrao de Raios");
            livroEdicaoOuro2.setAutor("Rick");
            livroEdicaoOuro2.setPreco(21.88);

            returnLivro(livroEdicaoOuro2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            Livro livro2 = new Livro();
            livro2.setTitulo("ab");
            livro2.setAutor("Jane Doe");
            livro2.setPreco(15.99);

            returnLivro(livro2);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            Livro livro3 = new Livro();
            livro3.setTitulo("Harry Potter e o enigma do principe");
            livro3.setAutor("J.K. Rowling");
            livro3.setPreco(0);

            returnLivro(livro3);

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }

    private static void returnLivro(Livro livro){
        System.out.println();
        System.out.printf("Titulo: %s - Autor: %s - Preco: %.9s\n",
                livro.getTitulo(),
                livro.getAutor(),
                new DecimalFormat("#,###.00").format(livro.getPreco()));
    }

    private static void returnLivro(LivroEdicaoOuro livro){
        System.out.printf("Titulo: %s - Autor: %s - Preco: %.5s\n",
                livro.getTitulo(),
                livro.getAutor(),
                new DecimalFormat("#,###.00").format(livro.getPreco()));
    }
}

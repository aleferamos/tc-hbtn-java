public class Program {
    public static void main(String[] args) {
        try {
            Livro livro1 = new Livro();
            livro1.setTitulo("As barbas do imperador: D. Pedro II");
            livro1.setAutor("Lilia Moritz Schwarcz");
            livro1.setPreco(56);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livro1.getTitulo(),
                    livro1.getAutor(),
                    livro1.getPreco());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            LivroEdicaoOuro livroEdicaoOuro1 = new LivroEdicaoOuro();

            livroEdicaoOuro1.setTitulo("Xato");
            livroEdicaoOuro1.setAutor("Fernando Morais");
            livroEdicaoOuro1.setPreco(38.30);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livroEdicaoOuro1.getTitulo(),
                    livroEdicaoOuro1.getAutor(),
                    livroEdicaoOuro1.getPreco());

        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            LivroEdicaoOuro livroEdicaoOuro2 = new LivroEdicaoOuro();
            livroEdicaoOuro2.setTitulo("Ladrao de Raios");
            livroEdicaoOuro2.setAutor("Rick");
            livroEdicaoOuro2.setPreco(21.88);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livroEdicaoOuro2.getTitulo(),
                    livroEdicaoOuro2.getAutor(),
                    livroEdicaoOuro2.getPreco());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            Livro livro2 = new Livro();
            livro2.setTitulo("ab");
            livro2.setAutor("Jane Doe");
            livro2.setPreco(15.99);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livro2.getTitulo(),
                    livro2.getAutor(),
                    livro2.getPreco());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }

        try {
            Livro livro3 = new Livro();
            livro3.setTitulo("Harry Potter e o enigma do principe");
            livro3.setAutor("J.K. Rowling");
            livro3.setPreco(0);

            System.out.printf("Titulo: %s - Autor: %s - Preco: %.2f\n",
                    livro3.getTitulo(),
                    livro3.getAutor(),
                    livro3.getPreco());
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + "\n");
        }
    }
}

public class LivroEdicaoOuro extends Livro{
    public LivroEdicaoOuro(String titulo, String autor, double preco) {
        super(titulo, autor, preco);
    }

    public LivroEdicaoOuro() {

    }


    @Override
    public double getPreco() {
        return (super.getPreco() * 0.3) + super.getPreco();
    }
}

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    String nome;
    Double preco;
    Double percentualMarkUp;

    Supplier<Double> precoComMarkUp;

    Consumer<Double> atualizarMarkUp;

    public Produto(Double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.percentualMarkUp = 0.10;
        this.precoComMarkUp = new Supplier<Double>() {
            @Override
            public Double get() {
                return (preco * percentualMarkUp) + preco;
            }
        };
        this.atualizarMarkUp = new Consumer<Double>() {
            @Override
            public void accept(Double valor) {
                percentualMarkUp = ( valor / 100);
            }
        };
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

}

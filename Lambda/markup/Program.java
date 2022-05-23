import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    String nome;
    Double preco;
    Double percentualMarkUp;
    Supplier<Double> precoComMarkUp;


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

    }
    Consumer<Double> atualizarMarkUp = valor ->  this.percentualMarkUp = (valor / 100);
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPercentualMarkUp(Double percentualMarkUp) {
        this.percentualMarkUp = percentualMarkUp;
    }
}

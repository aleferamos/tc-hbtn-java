import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    String nome;
    Double preco;
    Double percentualMarkUp;
    Supplier<Double> precoComMarkUp;
    Consumer<Double> atualizarMarkup;

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
        this.atualizarMarkup = new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                percentualMarkUp = (aDouble / 100);
            }
        };
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPercentualMarkUp() {
        return percentualMarkUp;
    }

    public void setPercentualMarkUp(Double percentualMarkUp) {
        this.percentualMarkUp = percentualMarkUp;
    }

    public Supplier<Double> getPrecoComMarkUp() {
        return precoComMarkUp;
    }

    public void setPrecoComMarkUp(Supplier<Double> precoComMarkUp) {
        this.precoComMarkUp = precoComMarkUp;
    }

    public Consumer<Double> getAtualizarMarkup() {
        return atualizarMarkup;
    }

    public void setAtualizarMarkup(Consumer<Double> atualizarMarkup) {
        this.atualizarMarkup = atualizarMarkup;
    }
}

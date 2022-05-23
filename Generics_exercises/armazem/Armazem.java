import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Armazem<T> implements Armazenavel{

    Map<String, T> dados;

    public Armazem() {
        this.dados = new HashMap<>();
    }


    @Override
    public void adicionarAoInventario(Object nome, Object valor) {
        dados.put((String) nome, (T) valor);
    }

    @Override
    public T obterDoInventario(Object nome) {
        return (T) dados.get(nome);
    }
}

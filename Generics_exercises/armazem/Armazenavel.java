public interface Armazenavel<T> {

    void adicionarAoInventario(T nome, T valor);

    T obterDoInventario(T nome);
}

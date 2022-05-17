import java.util.*;

public class Blog {

    public ArrayList<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post){
        this.postagens.add(post);
    }

    public Set<Object> obterTodosAutores(){

        var autores = new TreeSet<>();

        for (var postagem :this.postagens) {
            autores.add(postagem.autor);
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){

        TreeMap<String, Integer> categorias = new TreeMap<>();
        var nR = new ArrayList<>();

        for (var p :this.postagens) {
            nR.add(p.categoria);
            categorias.put(p.categoria, Collections.frequency(nR, p.categoria));
        }


        return categorias;
    }
}

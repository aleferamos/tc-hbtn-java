import java.util.*;

public class Blog {

    public ArrayList<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post post){
        this.postagens.add(post);
    }

    public Set obterTodosAutores(){

        var autores = new TreeSet<>();

        for (var postagem :this.postagens) {
            autores.add(postagem.autor);
        }

        return autores;
    }

    public Map obterContagemPorCategoria(){

        var categorias = new TreeMap();
        var nR = new ArrayList<>();

        for (var p :this.postagens) {
            nR.add(p.categoria);
            categorias.put(p.categoria, Collections.frequency(nR, p.categoria));
        }


        return categorias;
    }
}

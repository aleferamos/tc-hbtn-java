import java.util.Objects;

public class Post implements Comparable<Post>{
    public Autor autor;

    public String titulo;

    public String corpo;

    public Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }


    public String getTitulo() {
        return titulo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(autor, post.autor) && Objects.equals(titulo, post.titulo) && Objects.equals(corpo, post.corpo) && categoria == post.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, titulo, corpo, categoria);
    }

    @Override
    public int compareTo(Post o) {
        return this.titulo.toString().compareTo(o.getTitulo().toString());
    }

    @Override
    public String toString() {
        return titulo;
    }

}

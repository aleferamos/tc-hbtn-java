public class Pessoa implements Comparable<Pessoa>{

    int codigo;
    String nome;
    String cargo;
    int idade;
    double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.nome.compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "[" + codigo + "] " +  nome + " " + cargo + " " + idade + " " + "R$ " + salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }
}

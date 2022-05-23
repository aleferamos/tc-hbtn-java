public class FolhaPagamento {

    static Double calcularLiquido(Funcionario funcionario, CalculadorDeSalario calculadorDeSalario){
        return calculadorDeSalario.calcular(funcionario.salario);
    }
}

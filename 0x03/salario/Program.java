public class Program {
    public static void main(String[] args) {
        Departamento departamentoEngenharia = new Departamento(1000, 1100);
        Departamento departamentoDocumentacao = new Departamento(1000, 800);

        Empregado empregadoEngenharia1 = new Empregado(2300);
        Empregado empregadoEngenharia2 = new Empregado(3650);
        Gerente gerenteEngenharia = new Gerente(5800);

        Empregado empregadoDocumentacao1 = new Empregado(2500);
        Empregado empregadoDocumentacao2 = new Empregado(3000);
        Gerente gerenteDocumentacao = new Gerente(4980);


        returnEmpregado(empregadoEngenharia1, departamentoEngenharia);

        returnEmpregado(empregadoEngenharia2, departamentoEngenharia);

        returnGerente(gerenteEngenharia, departamentoEngenharia);

        returnEmpregado(empregadoDocumentacao1, departamentoDocumentacao);

        returnEmpregado(empregadoDocumentacao2, departamentoDocumentacao);

        returnGerente(gerenteDocumentacao, departamentoDocumentacao);

    }

    private static void returnEmpregado(Empregado empregado, Departamento departamento){
        System.out.printf("Salario Fixo: %.9s0 - Salario Total: %.9s0 - Valor Bonus: %.9s0\n",
                String.valueOf(empregado.getSalarioFixo()).replace(".",","),
                String.valueOf(empregado.calcularSalarioTotal(departamento)).replace(".",","),
                String.valueOf(empregado.calcularBonus(departamento)).replace(".",","));
    }

    private static void returnGerente(Gerente gerente, Departamento departamento){
        System.out.printf("Salario Fixo: %.9s0 - Salario Total: %.9s0 - Valor Bonus: %.9s0\n",
                String.valueOf(gerente.getSalarioFixo()).replace(".",","),
                String.valueOf(gerente.calcularSalarioTotal(departamento)).replace(".",","),
                String.valueOf(gerente.calcularBonus(departamento)).replace(".",","));
    }
}

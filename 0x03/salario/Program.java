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

        System.out.printf("Salario Fixo: %.9s0 - Salario Total: %.9s0 - Valor Bonus: %.9s0\n",
                String.valueOf(empregadoEngenharia1.getSalarioFixo()).replace(".",","),
                String.valueOf(empregadoEngenharia1.calcularSalarioTotal(departamentoEngenharia)).replace(".",","),
                String.valueOf(empregadoEngenharia1.calcularBonus(departamentoEngenharia)).replace(".",","));

        System.out.printf("Salario Fixo: %.9s0 - Salario Total: %.9s0 - Valor Bonus: %.9s0\n",
                String.valueOf(empregadoEngenharia2.getSalarioFixo()).replace(".",","),
                String.valueOf(empregadoEngenharia2.calcularSalarioTotal(departamentoEngenharia)).replace(".",","),
                String.valueOf(empregadoEngenharia2.calcularBonus(departamentoEngenharia)).replace(".",","));

        System.out.printf("Salario Fixo: %.9s0 - Salario Total: %.9s0 - Valor Bonus: %.9s0\n",
                String.valueOf(gerenteEngenharia.getSalarioFixo()).replace(".",","),
                String.valueOf(gerenteEngenharia.calcularSalarioTotal(departamentoEngenharia)).replace(".",","),
                String.valueOf(gerenteEngenharia.calcularBonus(departamentoEngenharia)).replace(".",","));

        System.out.printf("Salario Fixo: %.9s0 - Salario Total: %.9s0 - Valor Bonus: %.9s0\n",
                String.valueOf(empregadoDocumentacao1.getSalarioFixo()).replace(".",","),
                String.valueOf(empregadoDocumentacao1.calcularSalarioTotal(departamentoDocumentacao)).replace(".",","),
                String.valueOf(empregadoDocumentacao1.calcularBonus(departamentoDocumentacao)).replace(".",","));

        System.out.printf("Salario Fixo: %.9s0 - Salario Total: %.9s0 - Valor Bonus: %.9s0\n",
                String.valueOf(empregadoDocumentacao2.getSalarioFixo()).replace(".",","),
                String.valueOf(empregadoDocumentacao2.calcularSalarioTotal(departamentoDocumentacao)).replace(".",","),
                String.valueOf(empregadoDocumentacao2.calcularBonus(departamentoDocumentacao)).replace(".",","));

        System.out.printf("Salario Fixo: %.9s0 - Salario Total: %.9s0 - Valor Bonus: %.9s0\n",
                String.valueOf(gerenteDocumentacao.getSalarioFixo()).replace(".",","),
                String.valueOf(gerenteDocumentacao.calcularSalarioTotal(departamentoDocumentacao)).replace(".",","),
                String.valueOf(gerenteDocumentacao.calcularBonus(departamentoDocumentacao)).replace(".",","));
    }
}

public class Empregado {

    private double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        if(departamento.alcancouMeta()){
            return (salarioFixo * 0.1);
        }
        return 0;
    }

    public double calcularSalarioTotal(Departamento departamento){
        return calcularBonus(departamento) + salarioFixo;
    }
}

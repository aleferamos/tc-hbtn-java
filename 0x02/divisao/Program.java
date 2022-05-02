public class Program {
public static void main(String[] args) {
        int a, b;

        a = 4;
        b = 3;

        try {

        } catch (ArithmeticException e){
            System.out.println("Não é possivel calcular divisão por 0");
        } finally {
            Numero.dividir(a, b);
        }
    }
}

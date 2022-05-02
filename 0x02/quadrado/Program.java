public class Program {
    public static void main(String[] args) {
        try {
            double lado1 = 5;
            if(lado1 < 0){
                throw new IllegalArgumentException("Lado deve possuir valor positivo");
            } else {
                double resultado = Quadrado.area(lado1);
                System.out.println(resultado);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

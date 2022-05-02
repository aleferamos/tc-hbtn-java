public class Quadrado {
    public static double area(double lado){
        try {
            if(lado < 0){
                throw new IllegalArgumentException("Lado deve possuir valor positivo");
            }
            return Math.pow(lado, 2);
        } catch (Exception e){
            System.out.println(e);
        }
        return 0;
    }
}

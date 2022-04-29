package trace;

public class Println {

    public static void main(String[] args) {

        String piInString = String.valueOf((Math.PI));
        float pi = Float.parseFloat(piInString);

        System.out.printf("Valor de pi:  %.3f %n",  (pi));
    }
}

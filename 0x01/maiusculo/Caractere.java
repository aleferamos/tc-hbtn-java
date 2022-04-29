public class Caractere {
    public static void main(String[] args) {

        boolean caractereEhMaiusculo1 = Caractere.EhMaiusculo('c');

        System.out.printf("%b\n", caractereEhMaiusculo1);
    }

    public static boolean EhMaiusculo(char a){
        return Character.isUpperCase(a);
    }
}

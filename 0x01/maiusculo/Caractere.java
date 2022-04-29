package trace;

import java.util.ArrayList;
import java.util.List;

public class Caractere {
    public static void main(String[] args) {
        List<Character> c = new ArrayList<>();
        c.addAll(List.of('a', 'B', 'd', 'f', 'G'));

            EhMaiusculo(c);
    }

    public static void EhMaiusculo(List<Character>  c){
        for (var a: c) {
            System.out.println(Character.isUpperCase(a));
        }
    }
}

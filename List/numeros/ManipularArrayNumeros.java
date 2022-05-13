import java.util.ArrayList;
import java.util.List;

public class ManipularArrayNumeros {


    public static int buscarPosicaoNumero(List<Integer> numeros, int i){
        if(numeros.contains(i)){
            return numeros.indexOf(i);
        }else{
            return -1;
        }

    }

    public static void adicionarNumero(List<Integer> numeros, int i) {
        if(buscarPosicaoNumero(numeros, i) == -1){
            numeros.add(i);
        }else{
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
    }


    public static void removerNumero(List<Integer> numeros, int i) {
        if(buscarPosicaoNumero(numeros, i) == -1){
            System.out.println("Numero nao encontrado na lista");
        }else{
            numeros.remove(buscarPosicaoNumero(numeros, i));

        }
    }


    public static void substituirNumero(List<Integer> numeros, int i, int i1) {
        if(buscarPosicaoNumero(numeros, i)== -1){
            numeros.add(i1);
        }else{
            numeros.set(buscarPosicaoNumero(numeros, i), i1);
        }
    }
}

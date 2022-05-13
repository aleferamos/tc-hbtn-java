import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManipularArrayNumeros {

    static int buscarPosicaoNumero(List<Integer> numeros, int buscaNumero){
        for (var numero :numeros) {
            if(buscaNumero == numero){
                return numeros.indexOf(numero);
            }
        }
        return 0;
    }

    static void adicionarNumero(List<Integer> numeros, int addNumero){

        if(!numeros.contains(addNumero)){
            numeros.add(addNumero);
        } else {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }

    }
    static void removerNumero(List<Integer> numeros, int removeNumero){

        if(!numeros.contains(removeNumero)){
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        } else {
            numeros.remove(buscarPosicaoNumero(numeros, removeNumero));
        }
    }

    static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto){

        if(numeros.contains(numeroSubstituto)){
            numeros.set(buscarPosicaoNumero(numeros, numeroSubstituto), numeroSubstituir);
        } else {
            numeros.add(numeroSubstituir);
        }
    }

}

package trace;

import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        System.out.printf("Valor: " + NumberFormat.getCurrencyInstance(new Locale("pt","BR"))
                .format(valor) + "\n" + "Taxa: %.2f%%\n", taxa);
    }
}

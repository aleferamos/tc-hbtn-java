package trace;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
        var valorConvert = nf.format(valor);
        var taxaConvert = new DecimalFormat("#,##0.00").format(taxa);

        System.out.println("Valor: " + valorConvert + "\n" + "Taxa: " + taxaConvert + "%");
    }
}

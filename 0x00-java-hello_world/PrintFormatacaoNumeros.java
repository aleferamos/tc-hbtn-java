package trace;
import java.text.NumberFormat;
public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        var valor = 7654.321f;
        var valorConvert = NumberFormat.getCurrencyInstance().format(valor);
        var taxaConvert = NumberFormat.getCurrencyInstance().format(taxa);
        System.out.println("Valor: " + valorConvert + "\n" + "Taxa: " + taxaConvert + "%");
    }
}

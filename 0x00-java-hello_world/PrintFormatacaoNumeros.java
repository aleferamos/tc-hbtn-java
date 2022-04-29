public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;

        var valorConvert = NumberFormat.getCurrencyInstance().format(valor);
        var taxaConvert = new DecimalFormat("#,##0.00").format(taxa);

        System.out.println("Valor: " + valorConvert + "\n" + "Taxa: " + taxaConvert + "%");
    }
}

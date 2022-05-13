public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(String valor) {
        if(Integer.parseInt(valor) > 0 ){
            setValor(Integer.parseInt(valor));
        }else{
            exception();
        }
    }

    public InteiroPositivo(Integer valor) {
        if(valor > 0){
            setValor(valor);
        }else{
            exception();
        }
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        if(valor > 0 ){
            this.valor = valor;
        }else{
            exception();
        }
    }

    public void exception(){
        throw new IllegalArgumentException ("Valor nao eh um valor inteiro positivo");
    }

    public boolean ehPrimo(){
        int resultado=0;
        int i = 1;
        while (i <=getValor()){
            if(getValor() % i == 0){
                resultado +=1;
            }
            i++;
        }
        if(resultado == 2){
            return true;
        }else{
            return false;
        }
    }
}

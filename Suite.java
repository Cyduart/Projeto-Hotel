package estudos;

public class Suite extends Quarto {
    private int numeroCama;

    public Suite(String codigo, String descricao, double preco, int numeroCamas) {
        super(codigo, descricao, preco);
        this.numeroCama = numeroCamas;
    }

    public void setNumeroCama(int numeroCama){
        this.numeroCama = numeroCama;
    }

    public int getNumeroCama() {
        return numeroCama;
    }
}

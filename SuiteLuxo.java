package estudos;

public class SuiteLuxo extends Suite {
    private boolean jacuzzi;

    public SuiteLuxo(String codigo, String descricao, double preco, int numeroCamas, boolean jacuzzi) {
        super(codigo, descricao, preco, numeroCamas);
        this.jacuzzi = jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public boolean getJacuzzi() {
        return jacuzzi;
    }
}

package estudos;

public class SuiteMasterr extends SuiteLuxo{
    private String VistaPanoramica;


    public SuiteMasterr(String codigo, String descricao, double preco, int numeroCamas,
                        boolean jacuzzi, String VistaPanoramica){

        super(String codigo, String descricao, double preco, int numeroCamas, boolean jacuzzi);
        this.VistaPanoramica = VistaPanoramica;

    }

    public void setVistaPanoramica(String VistaPanoramica){
        this.VistaPanoramica = VistaPanoramica;
    }

    public String getVistaPanoramica() {
        return VistaPanoramica;
    }


}
package System;
import ENUM.TipoQuarto;

public class Quarto {
    private String codigo;
    private String descricao;
    private double preco;
    private TipoQuarto tipo;


    public Quarto() {
    }


    public Quarto(String codigo, String descricao, double preco, TipoQuarto tipo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.tipo = tipo;
    }


    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public TipoQuarto getTipo() {
        return tipo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(TipoQuarto tipo) {
        this.tipo = tipo;
    }
}

package System;

public class Reserva {
    private String codigo;
    private String nome;
    private String telefone;
    private String email;
    private int qtdAdultos;
    private int qtdCriancas;
    private Data checkIn;
    private Data checkOut;
    private Quarto quarto;

    // Default constructor
    public Reserva() {
    }

    // Constructor
    public Reserva(String codigo, String nome, String telefone, String email, int qtdAdultos, int qtdCriancas, Data checkIn, Data checkOut, Quarto quarto) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.qtdAdultos = qtdAdultos;
        this.qtdCriancas = qtdCriancas;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.quarto = quarto;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public int getQtdAdultos() {
        return qtdAdultos;
    }

    public int getQtdCriancas() {
        return qtdCriancas;
    }

    public Data getCheckIn() {
        return checkIn;
    }

    public Data getCheckOut() {
        return checkOut;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQtdAdultos(int qtdAdultos) {
        this.qtdAdultos = qtdAdultos;
    }

    public void setQtdCriancas(int qtdCriancas) {
        this.qtdCriancas = qtdCriancas;
    }

    public void setCheckIn(Data checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(Data checkOut) {
        this.checkOut = checkOut;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
}

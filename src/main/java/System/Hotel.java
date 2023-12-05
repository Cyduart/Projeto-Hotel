package System;

import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ArrayList<Quarto> quartos;

    // Default constructor
    public Hotel() {
        this.quartos = new ArrayList<>();
    }

    // Constructor
    public Hotel(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.quartos = new ArrayList<>();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Quarto> getQuartos() {
        return quartos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQuartos(ArrayList<Quarto> quartos) {
        this.quartos = quartos;
    }
}

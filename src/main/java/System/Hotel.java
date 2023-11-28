package System;

import lombok.*;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Hotel {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ArrayList<Quarto> quartos;


    public Hotel() {
        this.quartos = new ArrayList<>();
    }


    public Hotel(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.quartos = new ArrayList<>();
    }
}

package System;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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

}

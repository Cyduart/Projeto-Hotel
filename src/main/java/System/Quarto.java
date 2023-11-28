package System;
import ENUM.TipoQuarto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Quarto {
    private String codigo;
    private String descricao;
    private double preco;
    private TipoQuarto tipo;
}

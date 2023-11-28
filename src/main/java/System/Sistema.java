package System;

import lombok.*;

import java.util.ArrayList;
import java.util.Iterator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Sistema {
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private ArrayList<Hotel> hotels = new ArrayList<>();



    public void removeReserva(String codigo) {

        Iterator<Reserva> iterator = reservas.iterator();
        while (iterator.hasNext()) {
            Reserva reserva = iterator.next();
            if (reserva.getCodigo().equals(codigo)) {
                iterator.remove();
                break;
            }
        }
    }

}

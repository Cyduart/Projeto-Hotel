package System;

import java.util.ArrayList;
import java.util.Iterator;

public class Sistema {
    private ArrayList<Reserva> reservas;
    private ArrayList<Hotel> hotels;


    public Sistema() {
        this.reservas = new ArrayList<>();
        this.hotels = new ArrayList<>();
    }


    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }


    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

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

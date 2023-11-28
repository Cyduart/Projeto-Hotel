import System.*;
import ENUM.TipoQuarto;

public class TestSystem {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Reserva reserva = new Reserva();
        Quarto quarto = new Quarto();
        Hotel hotel = new Hotel();

        reserva.setCodigo("R001");
        reserva.setNome("João Silva");
        reserva.setTelefone("(11) 98765-4321");
        reserva.setEmail("joao.silva@email.com");
        reserva.setQtdAdultos(2);
        reserva.setQtdCriancas(1);
        reserva.setCheckIn(new Data(10, 10, 2021));
        reserva.setCheckOut(new Data(15, 10, 2021));
        reserva.setQuarto(quarto);

        quarto.setCodigo("Q001");
        quarto.setDescricao("Quarto Duplo");
        quarto.setPreco(400.00);
        quarto.setTipo(TipoQuarto.DOUBLE);

        hotel.setNome("Hotel Plaza");
        hotel.setEndereco("Avenida Paulista, 1000");
        hotel.setTelefone("(11) 1234-5678");
        hotel.setEmail("contato@hotelplaza.com");
        hotel.getQuartos().add(quarto);


        sistema.getReservas().add(reserva);
        sistema.getHotels().add(hotel);


        System.out.println("Reservas: " + sistema.getReservas());
        System.out.println("Hotéis: " + sistema.getHotels());


        sistema.removeReserva("R001");
        System.out.println("Reservas após remoção: " + sistema.getReservas());
    }
}

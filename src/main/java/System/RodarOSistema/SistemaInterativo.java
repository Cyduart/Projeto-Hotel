package System.RodarOSistema;

import java.util.Scanner;
import System.*;
import ENUM.*;

public class SistemaInterativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Sistema sistema = new Sistema();
        Reserva reserva = new Reserva();
        Quarto quarto = new Quarto();
        Hotel hotel = new Hotel();

        boolean finalizarReserva = false;

        while (!finalizarReserva) {

            System.out.println("Informe os detalhes da reserva:");
            System.out.print("Código da Reserva: ");
            reserva.setCodigo(scanner.nextLine());
            System.out.print("Nome do Cliente: ");
            reserva.setNome(scanner.nextLine());
            System.out.print("Telefone do Cliente: ");
            reserva.setTelefone(scanner.nextLine());
            System.out.print("E-mail do Cliente: ");
            reserva.setEmail(scanner.nextLine());
            System.out.print("Quantidade de Adultos: ");
            reserva.setQtdAdultos(scanner.nextInt());
            System.out.print("Quantidade de Crianças: ");
            reserva.setQtdCriancas(scanner.nextInt());
            System.out.print("Data de Check-In (DD MM AAAA): ");
            int diaCheckIn = scanner.nextInt();
            int mesCheckIn = scanner.nextInt();
            int anoCheckIn = scanner.nextInt();
            reserva.setCheckIn(new Data(diaCheckIn, mesCheckIn, anoCheckIn));
            System.out.print("Data de Check-Out (DD MM AAAA): ");
            int diaCheckOut = scanner.nextInt();
            int mesCheckOut = scanner.nextInt();
            int anoCheckOut = scanner.nextInt();
            reserva.setCheckOut(new Data(diaCheckOut, mesCheckOut, anoCheckOut));


            System.out.println("Informe os detalhes do quarto:");
            System.out.print("Número do Quarto: ");  // Alteração aqui
            quarto.setCodigo(scanner.next());
            System.out.println("Tipo do Quarto:");
            System.out.println("1 - SINGLE");
            System.out.println("2 - DOUBLE");
            System.out.println("3 - SUITE");
            System.out.print("Escolha o tipo de Quarto (1, 2 ou 3): ");
            int tipoQuartoEscolhido = scanner.nextInt();

            TipoQuarto tipoQuarto;
            String descricaoQuarto;
            double precoQuarto;

            switch (tipoQuartoEscolhido) {
                case 1 -> {
                    tipoQuarto = TipoQuarto.SIMPLES;
                    descricaoQuarto = "Quarto Single - Uma cama de solteiro";
                    precoQuarto = 100.0;
                }
                case 2 -> {
                    tipoQuarto = TipoQuarto.DOUBLE;
                    descricaoQuarto = "Quarto Double - Uma cama de casal";
                    precoQuarto = 150.0;
                }
                case 3 -> {
                    tipoQuarto = TipoQuarto.SUITE;
                    descricaoQuarto = "Suíte - Quarto com área de estar";
                    precoQuarto = 200.0;
                }
                default -> {
                    System.out.println("Opção inválida. Usando tipo padrão: SINGLE");
                    tipoQuarto = TipoQuarto.SIMPLES;
                    descricaoQuarto = "Quarto Single - Uma cama de solteiro";
                    precoQuarto = 100.0;
                }
            }

            quarto.setTipo(tipoQuarto);
            quarto.setDescricao(descricaoQuarto);
            quarto.setPreco(precoQuarto);


            System.out.println("Informe os detalhes do hotel:");
            System.out.print("Nome do Hotel: ");
            hotel.setNome(scanner.next());
            System.out.print("Endereço do Hotel: ");
            hotel.setEndereco(scanner.next());
            System.out.print("Telefone do Hotel: ");
            hotel.setTelefone(scanner.next());
            System.out.print("E-mail do Hotel: ");
            hotel.setEmail(scanner.next());

            hotel.getQuartos().add(quarto);
            sistema.getReservas().add(reserva);
            sistema.getHotels().add(hotel);


            System.out.println("Reservas: " + sistema.getReservas());
            System.out.println("Hotéis: " + sistema.getHotels());


            System.out.print("Deseja finalizar a reserva? (S para Sim, qualquer outra tecla para não): ");
            String respostaFinalizar = scanner.next();

            if (respostaFinalizar.equalsIgnoreCase("S")) {
                finalizarReserva = true;


                System.out.println("\n===== Detalhes da Reserva =====");
                System.out.printf("\nCódigo da Reserva: %s\n", reserva.getCodigo());
                System.out.printf("Nome do Cliente: %s\n", reserva.getNome());
                System.out.printf("Telefone do Cliente: %s\n", reserva.getTelefone());
                System.out.printf("E-mail do Cliente: %s\n", reserva.getEmail());
                System.out.printf("Check-In: %s\n", reserva.getCheckIn());
                System.out.printf("Check-Out: %s\n", reserva.getCheckOut());

                System.out.println("\n===== Detalhes do Quarto =====");
                System.out.printf("\nNúmero do Quarto: %s\n", quarto.getCodigo());
                System.out.printf("Descrição do Quarto: %s\n", quarto.getDescricao());
                System.out.printf("Preço do Quarto: %.2f\n", quarto.getPreco());
            } else {

                scanner.nextLine();
            }
        }

        scanner.close();
    }
}

package tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.application;

import tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.model.entities.Reservation;
import tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Boa {

    public static void main(String[] args)  {

        //Solução boa utilizando tratamento de exceções

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room Number: ");
            int number = sc.nextInt();

            System.out.println("Check-in date (dd/MM/yyyy");
            Date checkin = sdf.parse(sc.next()); //Lendo a data de checkin

            System.out.println("Check-out date (dd/MM/yyyy");
            Date checkout = sdf.parse(sc.next()); //Lendo a data de checkout

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation" + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(sc.next());

            System.out.println("Check-out date (dd//MM/yyyy");
            checkout = sdf.parse(sc.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();

    }

}

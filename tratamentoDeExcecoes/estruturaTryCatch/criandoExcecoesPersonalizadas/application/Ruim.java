package tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.application;

import tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ruim {

    public static void main(String[] args) throws ParseException {

//        //Vamos passar a logica de delegação para a classe reserva,e ai, quando houver um erro, ela retornara uma String com mensagem de erro
//
//
//        Scanner sc = new Scanner(System.in);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//        System.out.println("Room Number: ");
//        int number = sc.nextInt();
//
//        System.out.println("Check-in date (dd/MM/yyyy");
//        Date checkin = sdf.parse(sc.next()); //Lendo a data de checkin
//
//        System.out.println("Check-out date (dd/MM/yyyy");
//        Date checkout = sdf.parse(sc.next()); //Lendo a data de checkout
//
//        if (!checkout.after(checkin)) {
//            System.out.println("Error in reservation: Check-out date must be after check-in date");
//        } else {
//            Reservation reservation = new Reservation(number, checkin, checkout);
//            System.out.println("Reservation" + reservation);
//
//            System.out.println();
//            System.out.println("Enter data to update the reservation");
//
//            System.out.print("Check-in date (dd/MM/yyyy): ");
//            checkin = sdf.parse(sc.next());
//
//            System.out.println("Check-out date (dd//MM/yyyy");
//            Date checkOut = sdf.parse(sc.next());
//
//            Date now = new Date();
//            //String error = reservation.updateDates(checkin, checkout);
//
//            if (error != null) {
//                System.out.println("Reservation: " + error);
//            } else {
//                System.out.println("Reservation: " + reservation);
//            }
//        }
//            sc.close();
//
        }
}

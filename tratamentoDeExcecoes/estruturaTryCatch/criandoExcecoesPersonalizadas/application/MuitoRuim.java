package tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.application;

import tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MuitoRuim {

    public static void main (String [] args) throws ParseException {

        /*
        Sugestão de pacotes "model"

        model: Representa os dados do sistema e a transformação desses dados conforme as regras de negocio
            entities: representa as regras de negocio, tipo: produto, cliente...
            enums:
            exception:
            services:
        */

        //Primeira solução - muito ruim
        //é muito ruim pois a logica de validação da reserva, colocamos ela no programa principal e nao na reserva. isso é um problema de delegação, quem deve ser responsavel por essa problematica é a propria reserva

        Scanner sc = new Scanner(System.in);

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
//        }
//
//        else {
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
//            if (checkin.before(now) || checkOut.before(now)) {
//                System.out.println("Error in reservation dates for update must be future dates");
//            }
//
//            else if (!checkOut.after(checkin)) {
//                System.out.println("Error in reservation: Check-out date must be after check-in date");
//            }
//            else {
//                reservation.updateDates(checkin, checkout);
//                System.out.println("Reservation: " + reservation);
//            }
//
//        }

        sc.close();

    }
}

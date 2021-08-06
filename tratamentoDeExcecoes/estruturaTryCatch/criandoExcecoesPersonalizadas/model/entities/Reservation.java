package tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.model.entities;

import tratamentoDeExcecoes.estruturaTryCatch.criandoExcecoesPersonalizadas.model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {

    }

    public Reservation(Integer roomNumber, Date checkin, Date checkout)  {
        if (!checkout.after(checkin)) {
            throw new DomainException( "Error in reservation: Check-out date must be after check-in date");
        }

        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration() {
        //Calcular a diferença entre duas datas por milisegundos
        long diff = checkout.getTime() - checkin.getTime(); // essa função me traz a quantidade de milisegundos daquela data
        //agora vamos converter os milisegundos para dias
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates( Date checkin, Date checkout) {
        Date now = new Date();
        if (checkin.before(now) || checkout.before(now)) {
            throw new DomainException("Error in reservation dates for update must be future dates");
        }

        if (!checkout.after(checkin)) {
            throw new DomainException( "Error in reservation: Check-out date must be after check-in date");
        }

        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room"
                + roomNumber
                + ", Check-in: "
                + sdf.format(checkin)
                + ", check-out: "
                + sdf.format(checkout)
                + ", "
                + duration()
                + "nights";
    }

}

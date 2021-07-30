package date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Calendar {

    public static void main (String [] args) {
    /*
    Somando uma unidade de tempo:
     */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2021-07-19T13:52:00Z"));

        System.out.println(sdf.format(d));

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(d);
        cal.add(java.util.Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sdf.format(d));

        /*
        Obtendo uma unidade de tempo
         */

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date dt = Date.from(Instant.parse("2021-07-19T15:42:07Z"));

        System.out.println(sdf.format(dt));

        java.util.Calendar calnd = java.util.Calendar.getInstance();
        calnd.setTime(dt);
        int minutes = cal.get(java.util.Calendar.MINUTE);
        int month = 1 + calnd.get(java.util.Calendar.MONTH);

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

    }
}

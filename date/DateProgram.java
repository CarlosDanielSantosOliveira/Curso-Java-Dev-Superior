package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class DateProgram {

    public static void main (String [] args) throws ParseException {

        /*
        Date:
        Representa um Instante
        Pacote: java.util

        Um objeto Date internamente armazena:
            O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT (UTC)
            GMT: Greenwich mean time (time zone)
            UTC: Coordinated Universal time (time standard)

        SimpleDateFormat

            Define formatos para conversão entre Date e String

            dd/mm/yyyy -> 08/07/2021
            dd/mm/yyyy HH:mm:ss -> 08/07/2021 12:27:08

            Padrão ISO 8601 e classe instant = padrao para armazenar datas em formato de texto.

                Formato: yyyy-MM-ddTHH:mm:ssZ

                Exemplo: 2018-06-25T15:42:07Z T-ime Z-one

                Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
         */

        Scanner entrada = new Scanner(System.in);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //instanciei o objeto do date
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //instanciei o objeto do date
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //instanciei o objeto do date
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("08/07/2021");
        Date y2 = sdf2.parse("08/07/2021 12:56:09");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        Date x1 = new Date(); //Vai criar uma data com o horario atual.
        Date x2 = new Date(System.currentTimeMillis()); //Ele pega o instante do meu sistema, converte em millisegundos e cria a data e o horario de agora
        Date x3 = new Date(0L); //É a primeira data registrada em GMT
        Date x4 = new Date(1000L * 60L * 60L * 5L); //Assim crio uma data as 5 da manha de 01/01/1979


        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));
        System.out.println("-----------------------");

        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));
        System.out.println("-----------------------");

        entrada.close();


    }
}

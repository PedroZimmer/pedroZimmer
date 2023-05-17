package Aula111;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {


        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d04 = LocalDate.parse("2023-04-16");
        System.out.println("D04 = " + d04.format(dtf1));
        System.out.println("D04 = " + dtf1.format(d04));
        System.out.println("D04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        LocalDateTime d05 = LocalDateTime.parse("2023-04-16T15:42:07");
        System.out.println("D05 = " + d05.format(dtf2));
        System.out.println("D05 = " + dtf4.format(d05));

        Instant d06 = Instant.parse("2023-04-16T02:42:07Z");
        System.out.println("D06 = " + dtf3.format(d06));
        System.out.println("D06 = " + dtf5.format(d06));








    }

}

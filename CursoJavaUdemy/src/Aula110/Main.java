package Aula110;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2023-04-16");
        LocalDateTime d05 = LocalDateTime.parse("2023-04-16T15:42:07");
        Instant d06 = Instant.parse("2023-04-16T15:42:07Z");
        Instant d07 = Instant.parse("2023-04-16T15:42:07-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2021", dtf);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2021 15:42:07", dtf2);

        LocalDate d10 = LocalDate.of(2021, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2021, 7, 20, 15, 42, 07);


        System.out.println("Data atual" + d01);
        System.out.println("Data e hora atual" + d02);
        System.out.println("Data e hora atual Londres" + d03);
        System.out.println("Data manual" + d04);
        System.out.println("Data e hora manual" + d05);
        System.out.println("Data e hora manual global" + d06);
        System.out.println("Data e hora manual global" + d07);

        System.out.println("Data e hora manual global" + d08);
        System.out.println("Data e hora manual global" + d09);
        System.out.println("Data e hora manual global" + d10);
        System.out.println("Data e hora manual global" + d11);





    }

}

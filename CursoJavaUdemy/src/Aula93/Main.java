package Aula93;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Guest[] rooms = new Guest[10];

        System.out.println("How many rooms will be rented? ");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Rent #" + (i + 1) + ":");

            System.out.print("Name: ");
            input.nextLine(); // Consumes the \n from the previous input
            String guestName = input.nextLine(); // Consumes the \n from the previous input

            System.out.print("Email: ");
            String guestEmail = input.nextLine();

            System.out.print("Room: ");
            int roomNumber = input.nextInt();

            rooms[roomNumber] = new Guest(guestName, guestEmail, roomNumber);
        }

        Guest.busyRooms(rooms);






        input.close();


    }
}

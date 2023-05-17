package Aula93;

public class Guest {

    private String guestName;
    private String guestEmail;
    private int roomNumber;

    public Guest(String guestName, String guestEmail, int roomNumber) {
        this.guestName = guestName;
        this.guestEmail = guestEmail;
        this.roomNumber = roomNumber;
    }

    public String getGuestName() {
        return guestName;
    }


    public String getGuestEmail() {
        return guestEmail;
    }

    public static void busyRooms(Guest[] rooms) {
        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                System.out.println(i + ": " + rooms[i].getGuestName() + ", " + rooms[i].getGuestEmail());
            }
        }
    }


}

package ticketbookingapp;

import java.util.*;

public class BusinessLogic {

    public static void main(String[] args) {

        String pvrCinema = "PVR Cinema";
        String Inox = "INOX";
        String cinePolis = "CinePolis";
        Theater t1 = new Theater(pvrCinema, 10);
        Theater t2 = new Theater(Inox, 15);
        Theater t3 = new Theater(cinePolis, 8);

        List<Theater> theaters = Arrays.asList(t1, t2, t3);

        Ticketsnow ticketsNow = new Ticketsnow(theaters);
        Ticket bookmyShow = new BookmyShow(theaters);

        ticketsNow.showAvailableTickets();
        bookmyShow.showAvailableTickets();

        int ticketsCount = 7;
        int ticketCount = 10;

        ticketsNow.bookTicket(pvrCinema, ticketsCount);
        bookmyShow.bookTicket(Inox, ticketCount);

        ticketsNow.showAvailableTickets();
        bookmyShow.showAvailableTickets();
    }
}
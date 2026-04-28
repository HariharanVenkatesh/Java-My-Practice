package ticketbookingapp;

public class Theater {

    private final String theaterName;
    private int ticketsAvailable;

    public Theater(String theaterName, int ticketsAvailable) {
        this.theaterName = theaterName;
        this.ticketsAvailable = ticketsAvailable;
    }

    public String getTheaterName() {

        return theaterName;
    }

    public int getTicketsAvailable() {

        return ticketsAvailable;
    }

    public void setTicketsAvailable(int ticketsAvailable) {

        this.ticketsAvailable = ticketsAvailable;
    }
}
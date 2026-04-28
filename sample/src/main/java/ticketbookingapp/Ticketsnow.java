package ticketbookingapp;

import java.util.List;

public class Ticketsnow extends Ticket {


    public Ticketsnow(List<Theater> theaters) {
        super("TicketsNow", theaters);
    }

    @Override
    public double getPlatformFee() {
        return 40;
    }

    @Override
    public double getDiscount() {
        return 15;
    }
}
package ticketbookingapp;

import java.util.List;

public class BookmyShow extends Ticket {

    public BookmyShow(List<Theater> theaters) {
        super("BookmyShow", theaters);
    }

    @Override
    public double getPlatformFee() {
        return super.platformFee;
    }

    @Override
    public double getDiscount() {

        return 10;
    }
}
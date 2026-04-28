package ticketbookingapp;

import java.util.List;

public abstract class Ticket {

    protected String appName;
    protected List<Theater> theaters;

    double platformFee = 20;
    double discount = 5;

    public void setPlatformFee(double platformFee) {
        this.platformFee = platformFee;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Ticket(String appName, List<Theater> theaters) {
        this.appName = appName;
        this.theaters = theaters;
    }

    public void showAvailableTickets() {

        System.out.println("\nAvailable tickets on " + appName + " ->");

        for (Theater t : theaters) {
            System.out.println(t.getTheaterName() + " -> " + t.getTicketsAvailable());
        }
    }

    public void bookTicket(String theaterName, int tickets) {

        for (Theater t : theaters) {

            if (t.getTheaterName().equalsIgnoreCase(theaterName)) {

                if (t.getTicketsAvailable() >= tickets) {

                    int remaining = t.getTicketsAvailable() - tickets;
                    t.setTicketsAvailable(remaining);

                    double price = TicketPrice(200, tickets);

                    System.out.println("Ticket booked in " + theaterName + " using " + appName);
                    System.out.println("Remaining Tickets: " + remaining);
                    System.out.println("Total Price: " + price);

                } else {
                    System.out.println("Not enough tickets available");
                }

                return;
            }
        }

        System.out.println("Theater not found");
    }

    double calculateDiscount(double totalPrice, double discountPercent) {
        return totalPrice - (totalPrice*(discountPercent/100));
    }

    public double TicketPrice(double basePrice, int tickets) {
        double totalPrice = basePrice * tickets;
        System.out.println("Booking with platform fee - " + getPlatformFee() + " and Discount - "+ getDiscount());
        return totalPrice + getPlatformFee() - calculateDiscount(totalPrice, getDiscount());
    }

    public abstract double getPlatformFee();

    public abstract double getDiscount();
}
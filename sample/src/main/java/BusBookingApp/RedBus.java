package BusBookingApp;

class RedBus extends BusApp {

    private String busType;
    private String timing;
    private double bookingFee;

    public RedBus(String busName, String source, String destination, double fare,
                  String busType, String timing, double bookingFee) {

        super(busName, source, destination, fare);
        this.busType = busType;
        this.timing = timing;
        this.bookingFee = bookingFee;
    }



    @Override
    public void displayBusDetails() {
        System.out.println("----- RedBus Details -----");
        System.out.println("Bus Name: " + getBusName());
        System.out.println("Source: " + getSource());
        System.out.println("Destination: " + getDestination());
        System.out.println("Bus Type: " + busType);
        System.out.println("Timing: " + timing);
        System.out.println("Fare: " + getFare());
        System.out.println("Booking Fee: " + bookingFee);
    }
}
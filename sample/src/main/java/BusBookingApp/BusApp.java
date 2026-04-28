package BusBookingApp;

abstract class BusApp {

    private String busName;
    private String source;
    private String destination;
    private double fare;


    public BusApp(String busName, String source, String destination, double fare) {
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }


    public String getBusName() {
        return busName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }


    public abstract void displayBusDetails();
}
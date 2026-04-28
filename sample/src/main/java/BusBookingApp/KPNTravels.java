package BusBookingApp;

class KPNTravels {

    private String travelsName;
    private String busNumber;
    private String driverName;
    private int totalSeats;

    public KPNTravels(String travelsName, String busNumber, String driverName, int totalSeats) {
        this.travelsName = travelsName;
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.totalSeats = totalSeats;
    }

    public void displayKPNDetails() {
        System.out.println("---- KPN Travels ----");
        System.out.println("Travels Name: " + travelsName);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Total Seats: " + totalSeats);
    }
}
package BusBookingApp;

class SBLTTravels {

    private String travelsName;
    private String busNumber;
    private String conductorName;
    private int totalSeats;

    public SBLTTravels(String travelsName, String busNumber, String conductorName, int totalSeats) {
        this.travelsName = travelsName;
        this.busNumber = busNumber;
        this.conductorName = conductorName;
        this.totalSeats = totalSeats;
    }

    public void displaySBLTDetails() {
        System.out.println("---- SBLT Travels ----");
        System.out.println("Travels Name: " + travelsName);
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Conductor Name: " + conductorName);
        System.out.println("Total Seats: " + totalSeats);
    }
}
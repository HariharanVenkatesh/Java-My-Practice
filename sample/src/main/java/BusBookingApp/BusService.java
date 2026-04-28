package BusBookingApp;

public class BusService {

    public static double calculateTotalFare(double fare, double bookingFee) {
        return fare + bookingFee;
    }

    public static void main(String[] args) {

        BusApp abhiBus = new AbhiBus(
                "Vetri Travels",
                "Chennai",
                "Coimbatore",
                850,
                "AC Sleeper",
                "10:00 PM",
                40
        );

        BusApp redBus = new RedBus(
                "Sri Bhakyalakshmi Travels",
                "Madurai",
                "Bangalore",
                950,
                "Ultra Deluxe",
                "09:30 PM",
                50
        );

        KPNTravels kpn = new KPNTravels(
                "KPN Travels",
                "TN45AB1234",
                "Ramesh",
                40
        );

        SBLTTravels sblt = new SBLTTravels(
                "Sri Bhakyalakshmi Travels",
                "TN32CD5678",
                "Suresh",
                35
        );

        abhiBus.displayBusDetails();
        System.out.println("----------------");

        redBus.displayBusDetails();
        System.out.println("----------------");

        kpn.displayKPNDetails();
        System.out.println("----------------");

        sblt.displaySBLTDetails();
        System.out.println("----------------");

        double total = calculateTotalFare(850, 40);
        System.out.println("Total Fare: " + total);
    }
}
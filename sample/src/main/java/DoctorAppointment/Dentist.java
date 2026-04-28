package DoctorAppointment;

class Dentist extends Doctor{

    private int generalCheckupFee = 300;
    private int fullCheckupFee = 1200;


    public void showFees() {
        System.out.println("Dentist Fees");
        System.out.println("General Checkup Fee : " + generalCheckupFee);
        System.out.println("Full Checkup Fee    : " + fullCheckupFee);
        System.out.println("-----------------------------------");
    }
}

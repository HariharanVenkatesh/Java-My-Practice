package DoctorAppointment;

class Cardiology extends Doctor {

    private int generalCheckupFee = 500;
    private int fullCheckupFee = 2000;

    public Cardiology() {
    }


    public void showFees() {
        System.out.println("Cardiology Fees");
        System.out.println("General Checkup Fee : " + generalCheckupFee);
        System.out.println("Full Checkup Fee    : " + fullCheckupFee);
        System.out.println("-----------------------------------");
    }
}

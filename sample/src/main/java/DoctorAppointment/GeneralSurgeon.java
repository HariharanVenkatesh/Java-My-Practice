package DoctorAppointment;

class GeneralSurgeon extends Doctor {

    private int generalCheckupFee = 400;
    private int fullCheckupFee = 1500;


    public void showFees() {
        System.out.println("General Surgeon Fees");
        System.out.println("General Checkup Fee : " + generalCheckupFee);
        System.out.println("Full Checkup Fee    : " + fullCheckupFee);
        System.out.println("-----------------------------------");
    }
}


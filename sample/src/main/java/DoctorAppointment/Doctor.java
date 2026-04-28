package DoctorAppointment;

public class Doctor {

    private String doctorName;
    private String specialization;

    Doctor(String doctorName, String specialization) {

        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public Doctor() {
    }

    public void doctorDetails(){
        System.out.println("Doctor Name   : " + doctorName);
        System.out.println("Specialization: " + specialization);

    }

    public void AppointmentSystem() {

        if (specialization.equalsIgnoreCase("Cardiology")) {
            Cardiology a = new Cardiology();
            a.showFees();

        } else if (specialization.equalsIgnoreCase("Dentist")) {
            Dentist b = new Dentist();
            b.showFees();

        } else if (specialization.equalsIgnoreCase("GeneralSurgeon")) {
            GeneralSurgeon c = new GeneralSurgeon();
            c.showFees();

        } else {
            System.out.println("Specialist not available");
        }
    }
}




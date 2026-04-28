package DoctorAppointment;

import java.util.Arrays;

public class AppointmentSystem {

    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr.Ravi", "Cardiology");
        Doctor d2 = new Doctor("Dr.Ashok", "GeneralSurgeon");
        Doctor d3 = new Doctor("Aanandhan", "Dentist");

        Hospital a = new Hospital("Sm Hospital");
        Hospital b = new Hospital("BS Hospital");
        Hospital c = new Hospital("Brindha hospital");
        a.setDoctorList(Arrays.asList(d1, d2, d3));
        a.hospitalDetail();
        d1.doctorDetails();
        d1.AppointmentSystem();

        b.setDoctorList(Arrays.asList(d1, d2, d3));
        b.hospitalDetail();
        d2.doctorDetails();
        d2.AppointmentSystem();

        c.setDoctorList(Arrays.asList(d1, d2, d3));
        c.hospitalDetail();
        d3.doctorDetails();
        d3.AppointmentSystem();

    }
}
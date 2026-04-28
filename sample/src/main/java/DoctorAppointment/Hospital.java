package DoctorAppointment;

import java.util.List;

public class Hospital {
    private String hospitalName;

    public List<Doctor> getDoctorList() {

        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {

        this.doctorList = doctorList;
    }

    public String getHospitalName() {

        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {

        this.hospitalName = hospitalName;
    }

    private List<Doctor> doctorList;

    Hospital(String hospitalName) {

        this.hospitalName = hospitalName;
    }
    public void hospitalDetail() {

        System.out.println("Hospital Name : " + hospitalName);
        }
}

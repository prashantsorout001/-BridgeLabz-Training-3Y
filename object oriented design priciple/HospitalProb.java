
import java.util.*;

class Patient {
    String name;
    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.name);
    }
}

class Hospital {
    String hname;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String hname) {
        this.hname = hname;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }
}

public class HospitalProb {
    public static void main(String args[]) {
        Hospital h = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Lee");
        Patient p1 = new Patient("Alice");

        h.addDoctor(d1);
        h.addPatient(p1);

        d1.consult(p1);
    }
}

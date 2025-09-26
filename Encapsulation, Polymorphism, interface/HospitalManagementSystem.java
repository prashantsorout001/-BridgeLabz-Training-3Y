// Hospital Patient Management - student style
import java.util.*;

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    public Patient(String id, String name, int age) { this.patientId = id; this.name = name; this.age = age; }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void getPatientDetails() {
        System.out.println("ID:" + patientId + " Name:" + name + " Age:" + age);
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String rec);
    List<String> viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int days;
    private List<String> records = new ArrayList<>();

    public InPatient(String id, String name, int age, int days) { super(id,name,age); this.days = days; }

    @Override public double calculateBill() {
        return days * 2000 + 5000; // room + treatment
    }

    @Override public void addRecord(String rec) { records.add(rec); }
    @Override public List<String> viewRecords() { return records; }
}

class OutPatient extends Patient implements MedicalRecord {
    private int visits;
    private List<String> records = new ArrayList<>();

    public OutPatient(String id, String name, int age, int visits) { super(id,name,age); this.visits = visits; }

    @Override public double calculateBill() {
        return visits * 500; // visit charge
    }

    @Override public void addRecord(String rec) { records.add(rec); }
    @Override public List<String> viewRecords() { return records; }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P001", "Aditya", 30, 5);
        Patient p2 = new OutPatient("P002", "Nitin", 25, 2);

        p1.getPatientDetails();
        System.out.println("Bill:" + p1.calculateBill());
        ((MedicalRecord)p1).addRecord("Surgery done");
        System.out.println("Records:" + ((MedicalRecord)p1).viewRecords());

        System.out.println("----");
        p2.getPatientDetails();
        System.out.println("Bill:" + p2.calculateBill());
        ((MedicalRecord)p2).addRecord("Checkup ok");
        System.out.println("Records:" + ((MedicalRecord)p2).viewRecords());
    }
}

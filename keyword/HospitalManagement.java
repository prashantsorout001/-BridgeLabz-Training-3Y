class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name, ailment;
    private int age;
    private final int patientID; // Final unique identifier

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("PatientID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment + ", Hospital: " + hospitalName);
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient("Rahul", 30, "Fever", 501);
        Patient p2 = new Patient("Sneha", 25, "Cough", 502);

        p1.displayDetails();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}

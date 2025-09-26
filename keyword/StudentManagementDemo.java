class StudentManagement {
    static String universityName = "XYZ University";
    private static int totalStudents = 0;

    private String studentName;
    private final int rollNumber; // Final
    private String grade;

    public StudentManagement(String studentName, int rollNumber, String grade) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void showDetails() {
        if (this instanceof StudentManagement) {
            System.out.println("Name: " + studentName + ", Roll: " + rollNumber + ", Grade: " + grade + ", University: " + universityName);
        }
    }
}

public class StudentManagementDemo {
    public static void main(String[] args) {
        StudentManagement s1 = new StudentManagement("Ravi", 401, "A");
        StudentManagement s2 = new StudentManagement("Maya", 402, "B");

        s1.showDetails();
        s2.showDetails();

        StudentManagement.displayTotalStudents();
    }
}

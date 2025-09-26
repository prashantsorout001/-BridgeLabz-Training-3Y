class Staff {
    static String organizationName = "Global Tech Ltd.";
    private static int staffCount = 0;

    private String staffName, role;
    private final int staffId; // Final staff ID

    public Staff(String staffName, int staffId, String role) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.role = role;
        staffCount++;
    }

    public static void displayStaffCount() {
        System.out.println("Total Staff Members: " + staffCount);
    }

    public void showDetails() {
        if (this instanceof Staff) {
            System.out.println("Name: " + staffName + ", ID: " + staffId + ", Role: " + role + ", Organization: " + organizationName);
        }
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Staff s1 = new Staff("Arjun", 301, "Team Lead");
        Staff s2 = new Staff("Priya", 302, "Software Engineer");

        s1.showDetails();
        s2.showDetails();

        Staff.displayStaffCount();
    }
}

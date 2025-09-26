// Employee Management System - student style
import java.util.*;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double s) { this.baseSalary = s; }

    public void displayDetails() {
        System.out.println("ID:" + employeeId + " Name:" + name + " Base:" + baseSalary);
    }

    public abstract double calculateSalary();
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String dept;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // full time gets base salary + fixed allowance
        return getBaseSalary() + 2000;
    }

    public void assignDepartment(String dept) { this.dept = dept; }
    public String getDepartmentDetails() { return "Dept:" + dept; }
}

class PartTimeEmployee extends Employee implements Department {
    private String dept;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, hourlyRate);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        // baseSalary used as hourly rate here
        return getBaseSalary() * hoursWorked;
    }

    public void assignDepartment(String dept) { this.dept = dept; }
    public String getDepartmentDetails() { return "Dept:" + dept; }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(101, "Aditya", 30000);
        Employee e2 = new PartTimeEmployee(102, "Nitin", 200, 80);

        // assign departments via Department reference
        ((Department)e1).assignDepartment("IT");
        ((Department)e2).assignDepartment("Support");

        Employee[] emps = {e1, e2};
        for(Employee e: emps) {
            e.displayDetails();
            System.out.println("Calculated Salary: " + e.calculateSalary());
            System.out.println(((Department)e).getDepartmentDetails());
            System.out.println("----");
        }
    }
}

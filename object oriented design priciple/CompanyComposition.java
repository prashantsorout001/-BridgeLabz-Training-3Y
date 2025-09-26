

import java.util.*;

class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String dname;
    ArrayList<Employee> employees;

    Department(String dname) {
        this.dname = dname;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showEmployees() {
        System.out.println("Department: " + dname);
        for(Employee e : employees) {
            e.show();
        }
    }
}

class Company {
    String cname;
    ArrayList<Department> depts;

    Company(String cname) {
        this.cname = cname;
        depts = new ArrayList<>();
    }

    public void addDept(Department d) {
        depts.add(d);
    }

    public void showCompany() {
        System.out.println("Company: " + cname);
        for(Department d : depts) {
            d.showEmployees();
        }
    }
}

public class CompanyComposition {
    public static void main(String args[]) {
        Company c = new Company("Tech Corp");
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        d1.addEmployee(new Employee("Sam"));
        d1.addEmployee(new Employee("Rita"));
        d2.addEmployee(new Employee("Tom"));

        c.addDept(d1);
        c.addDept(d2);

        c.showCompany();
    }
}

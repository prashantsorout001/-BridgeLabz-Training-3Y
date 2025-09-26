

import java.util.*;

class Faculty {
    String name;
    Faculty(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentU {
    String dname;
    DepartmentU(String dname) {
        this.dname = dname;
    }
    public void show() {
        System.out.println("Department: " + dname);
    }
}

class University {
    String uname;
    ArrayList<DepartmentU> depts;
    ArrayList<Faculty> faculties;

    University(String uname) {
        this.uname = uname;
        depts = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    public void addDept(DepartmentU d) {
        depts.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void show() {
        System.out.println("University: " + uname);
        for(DepartmentU d : depts) d.show();
        for(Faculty f : faculties) f.show();
    }
}

public class UniversityProb {
    public static void main(String args[]) {
        University u = new University("National University");
        DepartmentU d1 = new DepartmentU("Computer Science");
        DepartmentU d2 = new DepartmentU("Physics");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. John");

        u.addDept(d1);
        u.addDept(d2);
        u.addFaculty(f1);
        u.addFaculty(f2);

        u.show();
    }
}



import java.util.*;

class Professor {
    String name;
    Professor(String name) {
        this.name = name;
    }
}

class CourseU {
    String cname;
    Professor professor;
    ArrayList<StudentU> students;
    CourseU(String cname) {
        this.cname = cname;
        students = new ArrayList<>();
    }
    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println("Professor " + p.name + " assigned to " + cname);
    }
    public void enroll(StudentU s) {
        students.add(s);
        System.out.println(s.name + " enrolled in " + cname);
    }
}

class StudentU {
    String name;
    StudentU(String name) {
        this.name = name;
    }
    public void enrollCourse(CourseU c) {
        c.enroll(this);
    }
}

public class UniManagement {
    public static void main(String args[]) {
        Professor prof1 = new Professor("Dr. Adams");
        CourseU c1 = new CourseU("Math");
        CourseU c2 = new CourseU("Physics");

        StudentU s1 = new StudentU("Alice");
        StudentU s2 = new StudentU("Bob");

        c1.assignProfessor(prof1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c2);
    }
}

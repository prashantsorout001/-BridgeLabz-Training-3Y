
import java.util.*;

class Course {
    String cname;
    ArrayList<Student> students;
    Course(String cname) {
        this.cname = cname;
        students = new ArrayList<>();
    }
    public void enrollStudent(Student s) {
        students.add(s);
    }
    public void showStudents() {
        System.out.println("Course: " + cname);
        for(Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;
    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }
    public void enroll(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }
    public void showCourses() {
        System.out.println("Student: " + name);
        for(Course c : courses) {
            System.out.println(c.cname);
        }
    }
}

class School {
    String sname;
    ArrayList<Student> students;
    School(String sname) {
        this.sname = sname;
        students = new ArrayList<>();
    }
    public void addStudent(Student s) {
        students.add(s);
    }
}

public class SchoolStudents {
    public static void main(String args[]) {
        School school = new School("Central High");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s1.enroll(c2);
        s2.enroll(c1);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.showCourses();
        c1.showStudents();
    }
}

// Base class
class Course {
    String courseName;
    int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

// Subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

// Sub-subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
        System.out.println("Fee: " + fee + ", Discount: " + discount + "%");
    }
}

public class CourseDemo {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java OOP", 6, "Udemy", true, 3000, 20);
        poc.displayCourseDetails();
    }
}


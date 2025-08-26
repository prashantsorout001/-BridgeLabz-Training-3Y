import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = sc.nextInt();

        double percentage = (physics + chemistry + maths) / 3.0;
        String grade, remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 75) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 40) {
            grade = "C";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Average Marks: " + percentage);
        System.out.println("Grade: " + grade + " (" + remarks + ")");
    }
}

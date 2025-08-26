public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        int pps = totalPens / students;  
        int rp = totalPens % students; 
        System.out.println("The Pen Per Student is " + pps + " and the remaining pen not distributed is " + rp);
    }
}


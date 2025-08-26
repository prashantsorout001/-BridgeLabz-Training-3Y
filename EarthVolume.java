public class EarthVolume {
    public static void main(String[] args) {
        double rk = 6378;   
        double pi = 3.14;
        double vk = (4.0 / 3.0) * pi * rk * rk * rk;  
        double rm = rk * 0.62;  
        double vm = (4.0 / 3.0) * pi * rm * rm * rm; 
        System.out.println("volume of earth in ck is " + vk);
        System.out.println("volume of earth in cm is " + vm);
    }
}


// Vehicle Rental System - student style
import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNo; // sensitive

    public Car(String num, double rate, String policyNo) {
        super(num, "Car", rate);
        this.policyNo = policyNo;
    }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate()*days; }

    @Override
    public double calculateInsurance() { return 2500; }

    @Override
    public String getInsuranceDetails() { return "CarPolicy:" + policyNo; }
}

class Bike extends Vehicle implements Insurable {
    private String policyNo;
    public Bike(String num, double rate, String policyNo) {
        super(num, "Bike", rate); this.policyNo = policyNo;
    }
    @Override public double calculateRentalCost(int days) { return getRentalRate()*days; }
    @Override public double calculateInsurance() { return 700; }
    @Override public String getInsuranceDetails() { return "BikePolicy:" + policyNo; }
}

class Truck extends Vehicle implements Insurable {
    private String policyNo;
    public Truck(String num, double rate, String policyNo) {
        super(num, "Truck", rate); this.policyNo = policyNo;
    }
    @Override public double calculateRentalCost(int days) { return getRentalRate()*days; }
    @Override public double calculateInsurance() { return 5000; }
    @Override public String getInsuranceDetails() { return "TruckPolicy:" + policyNo; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] arr = {
            new Car("MH12AB1111", 1500, "CP123"),
            new Bike("MH12XY2222", 400, "BP456"),
            new Truck("MH12TR3333", 3000, "TP789")
        };

        for(Vehicle v: arr) {
            System.out.println(v.getType() + " " + v.getVehicleNumber());
            System.out.println("Rental for 3 days: " + v.calculateRentalCost(3));
            if(v instanceof Insurable) {
                Insurable ins = (Insurable)v;
                System.out.println("Insurance: " + ins.calculateInsurance());
                // policy number is sensitive - only show via method
                System.out.println(ins.getInsuranceDetails());
            }
            System.out.println("----");
        }
    }
}

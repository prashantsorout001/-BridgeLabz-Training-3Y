// Ride-Hailing Application - student style
import java.util.*;

abstract class VehicleRide {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public VehicleRide(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId; this.driverName = driverName; this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public void getVehicleDetails() {
        System.out.println("ID:" + vehicleId + " Driver:" + driverName + " RatePerKm:" + ratePerKm);
    }

    public abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String loc);
}

class CarRide extends VehicleRide implements GPS {
    private String loc = "Unknown";
    public CarRide(String id, String driver, double rate) { super(id,driver,rate); }
    @Override public double calculateFare(double distance) { return getRatePerKm()*distance + 20; } // base charge
    @Override public String getCurrentLocation() { return loc; }
    @Override public void updateLocation(String l) { loc = l; }
}

class BikeRide extends VehicleRide implements GPS {
    private String loc = "Unknown";
    public BikeRide(String id, String driver, double rate) { super(id,driver,rate); }
    @Override public double calculateFare(double distance) { return getRatePerKm()*distance; }
    @Override public String getCurrentLocation() { return loc; }
    @Override public void updateLocation(String l) { loc = l; }
}

class AutoRide extends VehicleRide implements GPS {
    private String loc = "Unknown";
    public AutoRide(String id, String driver, double rate) { super(id,driver,rate); }
    @Override public double calculateFare(double distance) { return getRatePerKm()*distance + 10; }
    @Override public String getCurrentLocation() { return loc; }
    @Override public void updateLocation(String l) { loc = l; }
}

public class RideHailingApp {
    public static void main(String[] args) {
        VehicleRide[] rides = {
            new CarRide("V101", "Aditya", 12),
            new BikeRide("V102", "Nitin", 8),
            new AutoRide("V103", "Rahul", 6)
        };

        for(VehicleRide r: rides) {
            r.getVehicleDetails();
            System.out.println("Fare for 10km: " + r.calculateFare(10));
            if(r instanceof GPS) {
                GPS g = (GPS)r;
                g.updateLocation("Station"); System.out.println("Loc:" + g.getCurrentLocation());
            }
            System.out.println("----");
        }
    }
}

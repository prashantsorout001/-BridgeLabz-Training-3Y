// Superclass
class Device {
    String deviceId;
    String status;

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

// Subclass
class Thermostat extends Device {
    int temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding method
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call Device’s displayStatus
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH001", "ON", 24);
        t1.displayStatus();
    }
}



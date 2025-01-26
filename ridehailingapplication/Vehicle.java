package ridehailingapplication;

// Creating abstract class
abstract class Vehicle  {
    // Creating Attributes
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Creating Inheritance
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Creating  Abstract Method
    public abstract double calculateFare(double distance);

    // Creating Concrete Method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per km: " + ratePerKm);
    }

    // Getter methods for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
}
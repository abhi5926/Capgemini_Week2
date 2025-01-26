package ridehailingapplication;

// Creating Subclass
class Car extends Vehicle implements GPS {
    // Creating Attributes
    private String currentLocation;

    // Creating  Constructor
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
    public String getCurrentLocation() {
        return currentLocation;
    }
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
        System.out.println("Current Location updated to: " + currentLocation);
    }
}

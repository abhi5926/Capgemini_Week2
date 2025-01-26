package ridehailingapplication;

// Creating Bike class
class Bike extends Vehicle implements GPS  {
    // Creating Attributes
    private String currentLocation;

    // Creating Constructor
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
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

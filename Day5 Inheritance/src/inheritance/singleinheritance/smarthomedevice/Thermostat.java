package inheritance.singleinheritance.smarthomedevice;

// Creating subclass as Thermostat it is Subclass
public class Thermostat extends Device {
    // Attributes
    String tempratureSetting;

    // Creating Constructor
    public Thermostat(String deviceId,String deviceStatus,String tempratureSetting) {
        super(deviceId, deviceStatus);
        this.tempratureSetting = tempratureSetting;
    }

    // Creating Method to Display Details
    public void displayStatus(){
        System.out.println("The Device Id is : "+deviceId);
        System.out.println("The Device Status is : "+deviceStatus);
        System.out.println("The Device Temprature Setting is :"+tempratureSetting);
    }

}


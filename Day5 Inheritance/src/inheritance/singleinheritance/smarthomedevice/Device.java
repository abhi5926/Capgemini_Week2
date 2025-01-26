package inheritance.singleinheritance.smarthomedevice;

// Creating class Name as Device Super class
public class Device {
    //Attributes
    String deviceId;
    String deviceStatus;

    // Creating Constructer
    public Device(String deviceId, String deviceStatus){
        this.deviceId=deviceId;
        this.deviceStatus=deviceStatus;
    }
}


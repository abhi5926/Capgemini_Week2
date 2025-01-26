package inheritance.singleinheritance.smarthomedevice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creating ojects
        Device ob =new Device("123","New Device");

        // Creating object of Thermostat Class
        Thermostat ob1 = new Thermostat("1G3","Old Device","9");
        // Calling Display Method to display details
        ob1.displayStatus();
    }
}

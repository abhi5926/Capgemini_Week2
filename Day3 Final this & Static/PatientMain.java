import java.util.Scanner;

class Patient {
    // Creating static variable
    static String hospitalName = "LBS Hospital";

    // Instance variables
    String name;
    int age;
    String ailment;
    final String patientId;
    static int count = 0; // static to keep track of the number of Patient objects

    // Parameterized constructor
    public Patient(String name, int age, String ailment, String patientId) {
        count++;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
    }

    // Display method to show patient details
    public void display() {
        System.out.println("The name of the patient is: " + name);
        System.out.println("The age of the patient is: " + age);
        System.out.println("The ailment of the patient is: " + ailment);
        System.out.println("The patientId of the patient is: " + patientId);
    }
}

public class PatientMain {
    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.println("Please Enter the name of the patient:");
        String name = sc.nextLine();

        System.out.println("Please Enter the age of the patient:");
        int age = sc.nextInt();
		sc.nxtLine();
        

        System.out.println("Please Enter the ailment of the patient:");
        String ailment = sc.nextLine();

        System.out.println("Please Enter the patientId of the patient:");
        String patientId = sc.nextLine();

        // Creating object of Patient class
        Patient ob = new Patient(name, age, ailment, patientId);

        // Checking if the object ob belongs to Patient class or not
        if (ob instanceof Patient) {
            System.out.println("The object ob belongs to Patient class.");
        } else {
            System.out.println("The object ob does not belong to Patient class.");
        }

        // Displaying patient details
        ob.display();
        
        // Output the number of Patient instances created
        System.out.println("Total number of patients created: " + Patient.count);
    }
}

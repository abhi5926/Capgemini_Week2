package hospitalpatientmanagement;

// Creating class as abstract
abstract class Patient {
    //Attributes
    private String patientId;
    private String name;
    private int age;

    //Creating Constructer
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Creating abstract method
    public abstract double calculateBill();

    // Creating Concrete method to display data
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    // Getter methods for encapsulation
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


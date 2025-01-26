package hospitalpatientmanagement;

// Creating class
public class HospitalPatientManagement {
    // Creating Main Method
    public static void main(String[] args){
        // Creating object
        Patient ob = new InPatient("IP001", "Abhishek", 45, 5000.00, 2000.00);
        Patient ob1 = new OutPatient("OP001", "Neeraj", 30, 300.00);

        // display the details
        ob.getPatientDetails();
        ob1.getPatientDetails();

    }
}

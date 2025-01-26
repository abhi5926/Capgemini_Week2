package hospitalpatientmanagement;

// Creating Subclass
class InPatient extends Patient implements MedicalRecord {
    // Creating Attributes
    private double roomCharges;
    private double surgeryCharges;
    private String medicalHistory;

    // Creating Constructor
    public InPatient(String patientId, String name, int age, double roomCharges, double surgeryCharges) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.surgeryCharges = surgeryCharges;
    }

    public double calculateBill() {
        return roomCharges + surgeryCharges;
    }
    public void addRecord(String record) {
        this.medicalHistory = record;
        System.out.println("Medical record added: " + record);
    }
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}

package hospitalpatientmanagement;

// Creating class
class OutPatient extends Patient implements MedicalRecord {
    // Creating Attributes
    private double consultationFee;
    private String medicalHistory;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord(String record) {
        this.medicalHistory = record;
        System.out.println("Medical record added: " + record);
    }

    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}


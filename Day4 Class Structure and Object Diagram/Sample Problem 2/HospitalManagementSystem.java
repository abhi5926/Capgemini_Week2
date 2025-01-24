class Consultation {
	//Attributes
    private Doctor doctor;
    private Patient patient;
    private String details;

    // Constructor 
    public Consultation(Doctor doctor, Patient patient, String details) {
        this.doctor = doctor;
        this.patient = patient;
        this.details = details;
    }

    // Display consultation details
    public void displayConsultationDetails() {
        System.out.println("Consultation Details:");
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Patient: " + patient.getName());
        System.out.println("Consultation: " + details);
    }
}
class Doctor {
	//Attributes
    private String name;
    private Consultation[] consultations; 
    private int consultationCount;

    private static final int MAX_CONSULTATIONS = 10; 

    // Constructor to initialize doctor with a name
    public Doctor(String name) {
        this.name = name;
        this.consultations = new Consultation[MAX_CONSULTATIONS];
        this.consultationCount = 0;
    }

    // Getter for doctor's name
    public String getName() {
        return name;
    }

    // Method for doctor to consult with a patient
    public void consult(Patient patient, String details) {
        if (consultationCount < MAX_CONSULTATIONS) {
            Consultation consultation = new Consultation(this, patient, details);
            consultations[consultationCount] = consultation;
            consultationCount++;
            consultation.displayConsultationDetails();  // Display consultation details
        } else {
            System.out.println("Maximum consultation limit reached for Dr. " + name);
        }
    }
}
class Patient {
    private String name;

    // Constructor to initialize patient with a name
    public Patient(String name) {
        this.name = name;
    }

    // Getter for patient's name
    public String getName() {
        return name;
    }
}
class Hospital {
    private Doctor[] doctors;  
    private Patient[] patients; 
    private int doctorCount;
    private int patientCount;

    private static final int MAX_DOCTORS = 5;
    private static final int MAX_PATIENTS = 10;

    // Constructor to initialize the hospital
    public Hospital() {
        this.doctors = new Doctor[MAX_DOCTORS];
        this.patients = new Patient[MAX_PATIENTS];
        this.doctorCount = 0;
        this.patientCount = 0;
    }

    // Method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (doctorCount < MAX_DOCTORS) {
            doctors[doctorCount] = doctor;
            doctorCount++;
        } else {
            System.out.println("Cannot add more doctors to the hospital.");
        }
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        if (patientCount < MAX_PATIENTS) {
            patients[patientCount] = patient;
            patientCount++;
        } else {
            System.out.println("Cannot add more patients to the hospital.");
        }
    }

    // Method to get a doctor by index
    public Doctor getDoctor(int index) {
        if (index >= 0 && index < doctorCount) {
            return doctors[index];
        }
        return null;
    }

    // Method to get a patient by index
    public Patient getPatient(int index) {
        if (index >= 0 && index < patientCount) {
            return patients[index];
        }
        return null;
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create the hospital
        Hospital hospital = new Hospital();

        // Create some doctors
        Doctor doctor1 = new Doctor("Dr. Sanjay");
        Doctor doctor2 = new Doctor("Dr. Anuj");

        // Create some patients
        Patient patient1 = new Patient("Abhishek");
        Patient patient2 = new Patient("Rajan");

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Doctor 1 consults with Patient 1
        doctor1.consult(patient1, "Regular check-up, all vitals normal.");

        // Doctor 2 consults with Patient 2
        doctor2.consult(patient2, "Cough and cold, prescribed medication.");

        // Doctor 1 consults with Patient 2
        doctor1.consult(patient2, "Routine consultation, no major issues.");
    }
}


// Student class
class Student {
    // Access modifiers used
    public int rollNumber;      
    protected String name;      
    private double CGPA;        

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access the private CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify the private CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {  
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. CGPA should be between 0 and 10.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// PostgraduateStudent class (subclass of Student)
class PostgraduateStudent extends Student {

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        // Accessing protected 'name' member from the superclass (Student)
        System.out.println("Postgraduate Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("CGPA: " + getCGPA()); // Using public method to access CGPA
    }
}

// Main class to test the functionality
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create an instance of Student
        Student student = new Student(101, "Rajan", 8.5);
        student.displayStudentDetails();
        
        // Modify CGPA using public setter
        student.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student.getCGPA());

        // Create an instance of PostgraduateStudent (subclass of Student)
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Sachin", 8.7);
        pgStudent.displayPostgraduateDetails();
    }
}

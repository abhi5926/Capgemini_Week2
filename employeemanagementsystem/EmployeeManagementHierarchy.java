package employeemanagementsystem;

// Main class to run the program
public class EmployeeManagementHierarchy {
    public static void main(String[] args) {
        // Create employee objects
        Employee emp = new FullTimeEmployee(12, "Abhishek", 200000, 50000);
        Employee ob = new PartTimeEmployee(123, "Neeraj", 20000, 20, 15);

        // Create DepartmentDetails object
        DepartmentDetails department = new DepartmentDetails();
        department.assignDepartmentName("Computer Science");

        // Display full-time employee details
        emp.displayDetails();
        department.getDepartmentDetails();  // Show department details

        System.out.println();  // Blank line for clarity

        // Display part-time employee details
        ob.displayDetails();
        department.getDepartmentDetails();  // Show department details
    }
}

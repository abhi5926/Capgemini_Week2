// Employee class
class Employee {
    // Instance variables with different access modifiers
    public int employeeID;  
    protected String department; 
    private double salary;  

    // Constructor to initialize Employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify the salary (setter)
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Public method to get the salary 
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Manager that inherits from Employee
class Manager extends Employee {

    // Constructor for Manager, calling the superclass constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);  
    }

    // Method to display Manager details, demonstrating access to protected and public members
    public void displayManagerDetails() {
        // Accessing public member 'employeeID' and protected member 'department'
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);  
        System.out.println("Department: " + department);   
        System.out.println("Salary: $" + getSalary());   
    }
}

// Main class to test the functionality
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create Employee and Manager instances
        Employee employee = new Employee(1001, "Sales", 50000);
        employee.displayEmployeeDetails();

        // Create Manager instance
        Manager manager = new Manager(2001, "Marketing", 80000);
        manager.displayManagerDetails();

        // Modify the salary using the public method
        employee.setSalary(55000);  // Modify salary for Employee

        // Display updated salary for Employee
        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();
    }
}

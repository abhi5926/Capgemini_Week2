package inheritance.assitedproblem.employeemanagementsystem;

// Creating class to create object
class EmployeeManagementMain {
    // Main Method
    public static void main(String[] args){
        // Create object of Employee class
        Employee emp = new Employee("Abhishek","12CS3",12500.67);
        // Call Display Method to Display Details
        emp.displayDetails();

        // Create object of Manager class
        Manager man = new Manager("Neeraj","12Cs34",50000);
        // Method to get Team size
        man.getDetail(12);
        // Call Display Method to Display Details
        man.displayDetails();

        // Create object of Developer class
        Developer dev = new Developer("Rajan" ,"12Cs46",45000);
        // Method to assign Programming Language
        dev.getDetail("Java");
        // Call Display Method to Display Details
        dev.displayDetails();

        // Create object of Intern class
        Intern in = new Intern("Sachin","12Cs56",15000);
        // Call Display Method to Display Details
        in.displayDetails();
    }
}

// import java.util.*;

//creating class Employee
class Employee {
// Employee class Attribute
    String name;
    String position;
      
	  //parameterized constructer
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

     //Method to display Employee data
    public void displayEmployee() {
        System.out.println("The Name of Employee is: " + name);
        System.out.println("The Position of Employee is: " + position);
    }
}

//class Department
class Department {
// Department Class Attribute
    String deptName;
    Employee[] employees;
    int employeeCount;
     
	 
	 //Parameterized constructer
    public Department(String deptName, int maxEmployees) {
        this.deptName = deptName;
        this.employees = new Employee[maxEmployees];
        this.employeeCount = 0;
    }

     // add Employee Method
    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Cannot add more employees, department is full.");
        }
    }

    public void showEmployee() {
        for (int i = 0; i < employeeCount; i++) {
            employees[i].displayEmployee();
        }
    }

   // display the department details
    public void displayDepartment() {
        System.out.println("The Department Name is: " + deptName);
    }
}

// Creating class Name as Company
class Company {
// Attributes
    String companyName;
    Department[] departments;
    int departmentCount;


   // Parameterized Constructer 
    public Company(String companyName, int maxDepartments) {
        this.companyName = companyName;
        this.departments = new Department[maxDepartments];
        this.departmentCount = 0;
    }
    // Method to add Department
    public void addDepartment(Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments, company is full.");
        }
    }
 // Method to show company details
    public void showCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        for (int i = 0; i < departmentCount; i++) {
            departments[i].displayDepartment();
            departments[i].showEmployee();
        }
    }
}

public class CompanyDepartmentMain {

    public static void main(String[] args) {
	     // Creating object of Company class
        Company company = new Company("Capgemini", 5);  
         
		 //Method calling through object
        Department itDept = new Department("IT", 10);  

        itDept.addEmployee(new Employee("Abhishek", "Software Engineer"));
        

        company.addDepartment(itDept);

        company.showCompanyDetails();
    }
}

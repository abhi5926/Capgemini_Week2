package inheritance.assitedproblem.employeemanagementsystem;

// Creating class as Employee super class
class Employee {
    // Creating Attributes
    String name;
    String id;
    double salary;

    //Constructor Parameterized
    public Employee(String name,String id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Mehod to display details

    public void displayDetails(){
        System.out.println("The name of Employee is :"+name);
        System.out.println("The Id of Employee is :"+id);
        System.out.println("The Salary of Employee is :"+salary);
    }
}

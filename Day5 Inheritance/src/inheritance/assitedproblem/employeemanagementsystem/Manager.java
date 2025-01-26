package inheritance.assitedproblem.employeemanagementsystem;

// Creating class Manager
class Manager extends Employee {
    // Attributes
    int teamSize;

    // Constructor
    public Manager(String name,String id,double salary){
        super(name,id,salary);
    }

    // Method
    public void getDetail(int teamSize){
        this.teamSize = teamSize;
    }

    // Mehod to display details
    @Override
    public void displayDetails(){
        System.out.println("The name of Manager is :"+name);
        System.out.println("The Id of Manager is :"+id);
        System.out.println("The Salary of Manager is :"+salary);
        System.out.println("The Team Size of Manager is :"+teamSize);
    }
}

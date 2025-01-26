package inheritance.assitedproblem.employeemanagementsystem;


// Creating class Intern
class Intern extends Developer {
    // Parameterized Constructer
    public Intern(String name,String id,double salary){
        super(name,id,salary);
    }
    // Mehod to display details
    @Override
    public void displayDetails(){
        System.out.println("The name of Intern is :"+name);
        System.out.println("The Id of Intern is :"+id);
        System.out.println("The Salary of Intern is :"+salary);

    }
}

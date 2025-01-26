package inheritance.assitedproblem.employeemanagementsystem;

// creating class Developer
class Developer extends Manager {
    // Attributes
    String programmingLanguage;

    // Parameterized Constructer
    public Developer(String name,String id,double salary){
        super(name,id,salary);


    }
    //Method
    public void getDetail(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    // Mehod to display details
    @Override
    public void displayDetails(){
        System.out.println("The name of Developer is :"+name);
        System.out.println("The Id of Developer is :"+id);
        System.out.println("The Salary of Developer is :"+salary);
        System.out.println("The Programmini Language Of Developer is :"+programmingLanguage);
    }
}

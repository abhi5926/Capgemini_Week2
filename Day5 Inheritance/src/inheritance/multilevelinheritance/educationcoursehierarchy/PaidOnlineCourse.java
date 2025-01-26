package inheritance.multilevelinheritance.educationcoursehierarchy;



import java.security.spec.RSAOtherPrimeInfo;

// Creating class name as PaidOnlineCourse
public class PaidOnlineCourse extends OnlineCourse {
    // Attributes
    double fee;
    double discount;

    // Constructor
    public PaidOnlineCourse(String courseName,String courseDuration,String platform, String isRecorded,double fee,double discount){
        super(courseName,courseDuration,platform,isRecorded);
        this.fee =fee;
        this.discount = discount;
    }
    // Method to Display Details
    public void display(){
        System.out.println("The Name of the Course :"+ courseName);
        System.out.println("The Course Duration  is :"+courseDuration);
        System.out.println("The Course Platform  is :"+platform);
        System.out.println("The Course is Recorded :"+isRecorded);
        System.out.println("The fee of the course :"+fee);
        System.out.println("The Discount for the Course :"+discount);
    }
}


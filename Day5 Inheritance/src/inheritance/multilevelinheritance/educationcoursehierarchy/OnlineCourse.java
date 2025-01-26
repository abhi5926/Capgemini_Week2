package inheritance.multilevelinheritance.educationcoursehierarchy;



// Creating class name as OnlineCourse
public class OnlineCourse extends Course{
    //Attributes
    String platform;
    String isRecorded;

    // Constructor
    public OnlineCourse(String courseName,String courseDuration,String platform, String isRecorded){
        super(courseName,courseDuration);
        this.platform = platform;
        this.isRecorded =isRecorded;
    }
}


// Course class
class Course {
    // Instance variables
    String courseName;
    int duration;  // Duration in months
     double fee;

    // Class variable 
    static String instituteName;

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to modify the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Setting the institute name initially (using the class method)
        Course.updateInstituteName("Tech Academy");

        // Create course instances
        Course course1 = new Course("Java Programming", 6, 500);
        Course course2 = new Course("Web Development", 4, 400);
        Course course3 = new Course("Data Science", 12, 1200);

        // Display details for each course
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();
        System.out.println("\nCourse 3 Details:");
        course3.displayCourseDetails();

        // Updating the institute name for all courses
        Course.updateInstituteName("Global Tech Institute");

        // Display details again to show the updated institute name
        System.out.println("\nUpdated Course Details:");
        System.out.println("\nCourse 1 Details:");
        course1.displayCourseDetails();
        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();
        System.out.println("\nCourse 3 Details:");
        course3.displayCourseDetails();
    }
}

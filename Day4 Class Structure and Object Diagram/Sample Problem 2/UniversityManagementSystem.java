class Course {
    private String courseName;
    private Professor professor; 
    private Student[] students; 
    private int studentCount;   
    private static final int MAX_STUDENTS = 50; 

    // Constructor 
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    // Method 
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Cannot enroll more students in " + courseName);
        }
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Enrolled Students: ");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName());
        }
    }
    
    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}
class Professor {
    private String name;

    // Constructor to initialize professor's name
    public Professor(String name) {
        this.name = name;
    }

    // Getter for professor name
    public String getName() {
        return name;
    }

    // Method to assign a professor to a course
    public void assignToCourse(Course course) {
        course.assignProfessor(this);
    }
}
class Student {
    private String name;

    // Constructor to initialize student's name
    public Student(String name) {
        this.name = name;
    }

    // Getter for student's name
    public String getName() {
        return name;
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        course.enrollStudent(this);
    }
}
class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        

        // Create courses
        Course course1 = new Course("Mathematics");
       

        // Assign professors to courses
        professor1.assignToCourse(course1);
       

        // Create students
        Student student1 = new Student("Abhishek");
       

        // Enroll students in courses
        student1.enrollInCourse(course1);
        

        // Display course details
        course1.displayCourseDetails();
        
    }
}

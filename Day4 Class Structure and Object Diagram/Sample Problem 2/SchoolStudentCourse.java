class Course {
	//Attributes
    private String courseName;
    private Student[] students; 
    private int studentCount; 

    // Constructor  
    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    // Method to enroll a student in the course
    public void enrollStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Cannot enroll more students in " + courseName);
        }
    }

    // Method to display 
    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
class Student {
    private String name;
    private Course[] courses; 
    private int courseCount; 

    // Constructor 
    public Student(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses];
        this.courseCount = 0;
    }

    // Method 
    public void enrollInCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            course.enrollStudent(this); 
            courseCount++;
        } else {
            System.out.println(name + " cannot enroll in more courses.");
        }
    }

    // Method to display 
    public void displayCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}
class School {
    private String schoolName;
    private Student[] students; 
    private int studentCount; 

    // Constructor 
    public School(String schoolName, int maxStudents) {
        this.schoolName = schoolName;
        this.students = new Student[maxStudents];
        this.studentCount = 0;
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("School is at full capacity, cannot add more students.");
        }
    }

    // Method to display 
    public void displayStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName());
        }
    }
}
class SchoolStudentCourse {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Technocrats", 5);

        // Create students
        Student student1 = new Student("Abhishek", 3);
        Student student2 = new Student("Rajan", 3);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course math = new Course("Math", 3);
        Course science = new Course("Science", 3);

        // Students enroll in courses
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(math);

        // Display 
        school.displayStudents();

        // Display courses 
        student1.displayCourses();
        student2.displayCourses();

       
    }
}

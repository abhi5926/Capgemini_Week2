
class Subject {
	// Subject class Attribute
    String name;
    int marks;
   // Constructer
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

// Student class 
class Student {
	//Attribute 
    String name;
    Subject[] subjects;
    int subjectCount;

   // Constructer
    public Student(String name, int maxSubjects) {
        this.name = name;
        this.subjects = new Subject[maxSubjects];
        this.subjectCount = 0;
    }
     //Method to add subject
    public void addSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount++] = subject;
        }
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getSubjectCount() {
        return subjectCount;
    }
}

// GradeCalculator class to calculate grade based on marks
class GradeCalculator {
    public String calculateGrade(Student student) {
        int totalMarks = 0;

        for (int i = 0; i < student.getSubjectCount(); i++) {
            totalMarks += student.getSubjects()[i].marks;
        }

        double average = (double) totalMarks / student.getSubjectCount();

        if (average >= 90) return "A+";
        if (average >= 80) return "A";
        if (average >= 70) return "B";
        if (average >= 60) return "C";
        if (average >= 50) return "D";
        return "F";
    }
}

public class SchoolResultsApp {
    public static void main(String[] args) {
        // Create a student with a maximum of 5 subjects
        Student student = new Student("Abhishek", 5);

        // Add subjects
        student.addSubject(new Subject("Maths", 90));
        student.addSubject(new Subject("Science", 85));

        // Calculate grade
        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(student);

        // Display results
        System.out.println("Student: " + student.name);
        System.out.println("Grade: " + grade);
    }
}

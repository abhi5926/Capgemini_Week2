class Faculty {
    private String name;

    // Constructor 
    public Faculty(String name) {
        this.name = name;
    }

    // Method 
    public String getName() {
        return name;
    }
}
class Department {
    private String departmentName;
    private Faculty[] facultyMembers;
    private int facultyCount;

    // Constructor 
    public Department(String departmentName, int maxFaculty) {
        this.departmentName = departmentName;
        this.facultyMembers = new Faculty[maxFaculty];
        this.facultyCount = 0;
    }

    // Method 
    public void addFaculty(Faculty faculty) {
        if (facultyCount < facultyMembers.length) {
            facultyMembers[facultyCount] = faculty;
            facultyCount++;
        } else {
            System.out.println("Cannot add more faculty members to " + departmentName);
        }
    }

    // Method 
    public void displayFaculty() {
        System.out.println("Faculty members in " + departmentName + ":");
        for (int i = 0; i < facultyCount; i++) {
            System.out.println(facultyMembers[i].getName());
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
class University {
    private String universityName;
    private Department[] departments;
    private int departmentCount;

    // Constructor  
    public University(String universityName, int maxDepartments) {
        this.universityName = universityName;
        this.departments = new Department[maxDepartments];
        this.departmentCount = 0;
    }

    // Method 
    public void addDepartment(Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments to " + universityName);
        }
    }

    // Method 
    public void displayDepartments() {
        System.out.println("Departments in " + universityName + ":");
        for (int i = 0; i < departmentCount; i++) {
            System.out.println(departments[i].getDepartmentName());
        }
    }

    // Method 
    public void deleteUniversity() {
        for (int i = 0; i < departmentCount; i++) {
            departments[i] = null; 
        }
        departmentCount = 0;
        System.out.println("University and all its departments have been deleted.");
    }
}
class UniversityMain {
    public static void main(String[] args) {
        // Create Faculty members
        Faculty faculty1 = new Faculty("Dr. Sanjay");
        Faculty faculty2 = new Faculty("Dr. Sachin");
        Faculty faculty3 = new Faculty("Dr. Ram");
        
        // Create Departments
        Department csDepartment = new Department("Computer Science", 3);
        Department mathDepartment = new Department("Mathematics", 2);

        // Add Faculty to Departments
        csDepartment.addFaculty(faculty1);
        csDepartment.addFaculty(faculty2);
        mathDepartment.addFaculty(faculty3);

        // Create University
        University university = new University("RGPV University", 2);

        // Add Departments to the University
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Display all Departments in the University
        university.displayDepartments();

        // Display Faculty in each Department
        csDepartment.displayFaculty();
        mathDepartment.displayFaculty();

        // Delete the University 
        university.deleteUniversity();

       
    }
}

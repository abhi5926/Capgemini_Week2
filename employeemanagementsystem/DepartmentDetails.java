package employeemanagementsystem;

// Class implementing Department interface
class DepartmentDetails implements Department {
    private String departmentName;

    public void assignDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void getDepartmentDetails() {
        System.out.println("Department Name is: " + departmentName);
    }
}

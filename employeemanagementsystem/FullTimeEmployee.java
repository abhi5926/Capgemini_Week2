package employeemanagementsystem;

// FullTimeEmployee class
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor: employeeId should be int, not String
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double monthlySalary) {
        super(employeeId, name, baseSalary);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

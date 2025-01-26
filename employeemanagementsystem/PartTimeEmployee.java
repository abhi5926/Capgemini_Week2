package employeemanagementsystem;

// PartTimeEmployee class
class PartTimeEmployee extends Employee {
    private int workHour;
    private double hourRate;

    // Constructor: employeeId should be int, not String
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHour, double hourRate) {
        super(employeeId, name, baseSalary);
        this.workHour = workHour;
        this.hourRate = hourRate;
    }

    @Override
    public double calculateSalary() {
        return hourRate * workHour;
    }
}

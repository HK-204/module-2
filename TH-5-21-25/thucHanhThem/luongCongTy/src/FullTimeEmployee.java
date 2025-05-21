public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(){}

    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String getType() {
        return "Full-Time";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

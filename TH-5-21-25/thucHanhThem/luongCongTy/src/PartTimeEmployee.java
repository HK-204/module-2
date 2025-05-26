public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee() {}

    public PartTimeEmployee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(String name, String id, String email, int hoursWorked, double hourlyRate) {
        super(name, id, email);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getHoursWorked() * getHourlyRate();
    }

    @Override
    public String getType() {
        return "Part-Time";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

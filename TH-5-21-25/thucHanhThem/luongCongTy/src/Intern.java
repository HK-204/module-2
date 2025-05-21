public class Intern extends Employee{
    private double allowance;

    public Intern(){}

    public Intern(double allowance) {
        this.allowance = allowance;
    }

    public Intern(String name, double allowance) {
        super(name);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return allowance;
    }

    @Override
    public String getType() {
        return "Intern";
    }

    public void attendTraining() {
        System.out.println(getName() + " is attending training.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

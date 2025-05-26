public class FullTimeEmployee extends Employee implements Assignable{
    private double bonus;

    public FullTimeEmployee(){}

    public FullTimeEmployee(double bonus) {
        this.bonus = bonus;
    }

    public FullTimeEmployee(String name, String id, String email, double baseSalary, double bonus) {
        super(name, id, email, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + getBonus();
    }

    @Override
    public String getType() {
        return "Full-Time";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void assignToProject(Project project) {
        project.addMember(this);
    };
}

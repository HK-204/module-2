public class Intern extends Employee {
    private String mentorName;

    public Intern(){}

    public Intern(String mentorName) {
        this.mentorName = mentorName;
    }

    public Intern(String name, String id, String email, double baseSalary, String mentorName) {
        super(name, id, email, baseSalary);
        this.mentorName = mentorName;
    }

    public String getMentorName() {
        return mentorName;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public String getType() {
        return "Intern";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

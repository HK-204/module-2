public class Employee {
    private String name;

    public Employee() {}

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    public String getType() {
        return "General Employee";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " " + getType() + " " + calculateSalary();
    }
}

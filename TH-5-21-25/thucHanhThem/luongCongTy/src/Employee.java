public abstract class Employee {
    private String name;
    private String id;
    private String email;
    private double baseSalary;

    public Employee() {}

    public Employee(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public Employee(String name, String id, String email, double baseSalary) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public abstract String getType();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "ID: " + getId() +
                "\nHọ Tên: " + getName() +
                "\nKiểu: " + getType() +
                "\nEmail" + getEmail() +
                "\nLương: " + calculateSalary();
    }
}

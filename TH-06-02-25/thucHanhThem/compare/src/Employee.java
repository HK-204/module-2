public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name.trim();
    }

    public String getFirstName() {
        String[] parts = name.split("\\s+");
        return parts[0];
    }

    public String getLastName() {
        String[] parts = name.split("\\s+");
        return parts[parts.length - 1];
    }

    @Override
    public String toString() {
        return name;
    }
}

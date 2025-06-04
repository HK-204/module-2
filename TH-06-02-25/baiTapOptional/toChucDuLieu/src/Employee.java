import java.util.Comparator;

public class Employee {
    private String name;
    private String gender;
    private int day, month, year;

    public Employee(String name, String gender, int day, int month, int year) {
        this.name = name;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + ", " + gender + ", " + day + "/" + month + "/" + year;
    }

    public static Comparator<Employee> sortByBirthday = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.year != o2.year) {
                return o1.year - o2.year;
            }
            if (o1.month != o2.month) {
                return o1.month - o2.month;
            }
            return o1.day - o2.day;
        }
    };
}

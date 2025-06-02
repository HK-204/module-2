import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nguyễn Bình Minh"));
        employees.add(new Employee("Hoàng Văn Quyết"));
        employees.add(new Employee("Trịnh Hoài An"));
        employees.add(new Employee("Hoàng Minh An"));
        employees.add(new Employee("Nguyễn Trung Quyết"));
        employees.add(new Employee("Trần Hoàng Trung"));

        Collections.sort(employees, new CompareLastThenFirst());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
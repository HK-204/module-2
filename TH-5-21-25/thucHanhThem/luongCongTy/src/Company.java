import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Đã thêm " + employee.getName());
    }

    public void addProject(Project project) {
        projects.add(project);
        System.out.println("Đã thêm dự án " + project.getProjectName());
    }

    public void displayAllSalaries() {
        for (Employee employee : employees) {
            System.out.println("Lương nhân viên " + employee.getName() + " là " + employee.calculateSalary());
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Project> getProjects() {
        return projects;
    }
}

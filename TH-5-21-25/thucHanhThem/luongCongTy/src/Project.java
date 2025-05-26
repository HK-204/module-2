import java.util.ArrayList;
import java.util.List;

public class Project {
    private String projectId;
    private String projectName;
    private List<Employee> members = new ArrayList<>();

    public Project(String projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public void addMember(Employee employee) {
        members.add(employee);
        System.out.println("Đã thêm " + employee.getName() + " vào dự án " + getProjectName());
    }

    public void displayProjectMembers() {
        System.out.println("Danh sách nhân viên tham gia dự án: " + getProjectName());
        for (Employee employee : members) {
            System.out.println("- ID: " + employee.getId() + " _ Họ tên: " + employee.getName());
        }
    }

    public String getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public List<Employee> getMembers() {
        return members;
    }
}

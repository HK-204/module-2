import java.util.List;

public class PayrollSystem {
    public static void main(String[] args) {
        Company company = new Company();

        List<Employee> employees = List.of(
                new FullTimeEmployee("Nguyen Trung Hoang", "HoangNT001", "hoangnt001@gmail.com", 10000000, 2000000),
                new FullTimeEmployee("Nguyen Minh Anh", "AnhNM006", "anhnm006@gmail.com", 11000000, 2500000),
                new FullTimeEmployee("Tran Thi Tuong Vi", "ViTTT002", "vittt002@gmail.com", 14000000, 2000000),
                new FullTimeEmployee("Le Minh Khuong", "KhuongLM001", "khuonglm001@gmail.com", 10500000, 2500000),
                new PartTimeEmployee("Nguyen Thi Huong Thao", "ThaoNTH002", "thaonth002@gmail.com", 150, 38000),
                new PartTimeEmployee("Hoang Tran Trung Nguyen", "NguyenHTT003", "nguyenhtt003@gmail.com", 170, 38000),
                new PartTimeEmployee("Bui Khanh Linh", "LinhBK008", "linhbk008@gmail.com", 160, 38000),
                new PartTimeEmployee("Bui Minh Luong", "LuongBM003", "luongbm003@gmail.com", 135, 38000),
                new Intern("Le Hoang Minh Trung", "TrungLHM006", "trunglhm006@gmail.com", 4000000, "Nguyen Tien Dat"),
                new Intern("Tran Van Minh", "MinhTV022", "minhtv022@gmail.com", 4000000, "Nguyen Tien Dat")
        );

        employees.forEach(company::addEmployee);

        Project prj1 = new Project("AI001", "AI Garram Training");
        company.addProject(prj1);

        for (Employee employee : employees) {
            if (employee instanceof FullTimeEmployee) {
                ((FullTimeEmployee) employee).assignToProject(prj1);
            }
        }

        company.displayAllSalaries();
        System.out.println();
        prj1.displayProjectMembers();
    }
}

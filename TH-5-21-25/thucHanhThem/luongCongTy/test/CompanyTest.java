import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void testAddEmployee() {
        Company company = new Company();
        FullTimeEmployee emp1 = new FullTimeEmployee("Nguyen Minh Anh", "AnhNM006", "anhnm006@gmail.com", 11000000, 2500000);
        company.addEmployee(emp1);
        assertTrue(company.getEmployees().contains(emp1));
    }

    @Test
    void testAddProject() {
        Company company = new Company();
        Project project = new Project("AI002", "AI project");
        company.addProject(project);
        assertTrue(company.getProjects().contains(project));
    }

}
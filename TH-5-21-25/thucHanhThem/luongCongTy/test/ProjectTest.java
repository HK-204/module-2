import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @Test
    void testProjectInfo() {
        Project project = new Project("AI002", "AI project");
        assertEquals("AI002", project.getProjectId());
        assertEquals("AI project", project.getProjectName());
    }

    @Test
    void testAddMember() {
        Project project = new Project("AI002", "AI project");
        FullTimeEmployee fullTime1 = new FullTimeEmployee("Hoang Nhan Trung", "Trung002", "trung@gmail.com", 90000, 200);

        project.addMember(fullTime1);
        List<Employee> member = project.getMembers();
        assertEquals(member.size(), 1);
        assertEquals(member.get(0).getName(), "Hoang Nhan Trung");
        assertEquals(member.get(0).getId(), "Trung002");
    }

    @Test
    void testMultiMembers() {
        Project project = new Project("AI002", "AI project");
        FullTimeEmployee emp1 = new FullTimeEmployee("Hoang Nhan Trung", "Trung002", "trung@gmail.com", 90000, 200);
        FullTimeEmployee emp2 = new FullTimeEmployee("Hoang Nhat Minh", "Minh002", "minh@gmail.com", 90000, 200);
        project.addMember(emp1);
        project.addMember(emp2);

        List<Employee> member = project.getMembers();
        assertEquals(member.size(), 2);
        assertTrue(member.contains(emp1));
        assertTrue(member.contains(emp2));
    }

}
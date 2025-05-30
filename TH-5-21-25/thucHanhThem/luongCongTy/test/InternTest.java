import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternTest {

    @Test
    void testInternInfo() {
        Intern intern = new Intern("Tran Van Minh", "MinhTV022", "minhtv022@gmail.com", 4000000, "Nguyen Tien Dat");

        assertEquals("Tran Van Minh", intern.getName());
        assertEquals("MinhTV022", intern.getId());
        assertEquals("minhtv022@gmail.com", intern.getEmail());
        assertEquals(4000000, intern.getBaseSalary());
        assertEquals("Nguyen Tien Dat", intern.getMentorName());
    }

}
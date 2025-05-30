import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartTimeEmployeeTest {

    @Test
    void testCalculateSalary() {
        PartTimeEmployee employee = new PartTimeEmployee("Bui Khanh Linh", "LinhBK008", "linhbk008@gmail.com", 160, 38000);

        assertEquals(6080000, employee.calculateSalary());
    }

    @Test
    void testCalculateSalary2() {
        PartTimeEmployee employee = new PartTimeEmployee("Nguyen Thi Huong Thao", "ThaoNTH002", "thaonth002@gmail.com", 150, 38000);

        assertEquals(5700000, employee.calculateSalary());
    }
}
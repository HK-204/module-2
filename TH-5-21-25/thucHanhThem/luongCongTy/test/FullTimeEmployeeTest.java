import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullTimeEmployeeTest {

    @Test
    void testCalculateSalary() {
        FullTimeEmployee emp1 = new FullTimeEmployee("Nguyen Minh Anh", "AnhNM006", "anhnm006@gmail.com", 11000000, 2500000);

        assertEquals(13500000, emp1.calculateSalary());
    }

    @Test
    void testFullTimeEmployee() {
        FullTimeEmployee emp1 = new FullTimeEmployee("Nguyen Minh Anh", "AnhNM006", "anhnm006@gmail.com", 11000000, 2500000);

        assertEquals("Nguyen Minh Anh", emp1.getName());
        assertEquals("AnhNM006", emp1.getId());
        assertEquals("anhnm006@gmail.com", emp1.getEmail());
        assertEquals(11000000, emp1.getBaseSalary());
        assertEquals(2500000, emp1.getBonus());
    }
}
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testGetNextDay0() {
        LocalDate today = LocalDate.of(2018, 1, 1);
        LocalDate tomorrow = LocalDate.of(2018, 1, 2);
        LocalDate actual = NextDayCalculator.getNextDay(today);
        assertEquals(tomorrow, actual);
    }

    @Test
    void testGetNextDay1() {
        LocalDate today = LocalDate.of(2018, 1, 31);
        LocalDate tomorrow = LocalDate.of(2018, 2, 1);
        LocalDate actual = NextDayCalculator.getNextDay(today);
        assertEquals(tomorrow, actual);
    }

    @Test
    void testGetNextDay2() {
        LocalDate today = LocalDate.of(2018, 4, 30);
        LocalDate tomorrow = LocalDate.of(2018, 5, 1);
        LocalDate actual = NextDayCalculator.getNextDay(today);
        assertEquals(tomorrow, actual);
    }

    @Test
    void testGetNextDay3() {
        LocalDate today = LocalDate.of(2018, 2, 28);
        LocalDate tomorrow = LocalDate.of(2018, 3, 1);
        LocalDate actual = NextDayCalculator.getNextDay(today);
        assertEquals(tomorrow, actual);
    }

    @Test
    void testGetNextDay4() {
        LocalDate today = LocalDate.of(2020, 2, 29);
        LocalDate tomorrow = LocalDate.of(2020, 3, 1);
        LocalDate actual = NextDayCalculator.getNextDay(today);
        assertEquals(tomorrow, actual);
    }

    @Test
    void testGetNextDay5() {
        LocalDate today = LocalDate.of(2018, 12, 31);
        LocalDate tomorrow = LocalDate.of(2019, 1, 1);
        LocalDate actual = NextDayCalculator.getNextDay(today);
        assertEquals(tomorrow, actual);
    }
}
import java.time.LocalDate;

public class NextDayCalculator {
    public static LocalDate getNextDay(LocalDate currentDate) {
        return currentDate.plusDays(1);
    }
}

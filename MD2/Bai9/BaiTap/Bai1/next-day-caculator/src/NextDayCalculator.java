import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NextDayCalculator {
    public static String findNextDay(String inputStringDay) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate localDate = LocalDate.parse(inputStringDay, dateTimeFormatter);
        LocalDate nextDay = localDate.plusDays(1);
        return String.valueOf(nextDay.format(dateTimeFormatter));
    }
}

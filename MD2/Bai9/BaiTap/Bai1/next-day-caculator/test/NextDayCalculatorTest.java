import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test
    public void findNextDay112018To212018() {
        String inpDay = "1/1/2018";
        String expDay = "2/1/2018";

        String result = NextDayCalculator.findNextDay(inpDay);
        assertEquals(expDay, result);
    }

    @Test
    public void findNextDay3112018To122018() {
        String inpDay = "31/1/2018";
        String expDay = "1/2/2018";

        String result = NextDayCalculator.findNextDay(inpDay);
        assertEquals(expDay, result);
    }

    @Test
    public void findNextDay3042018To3142018() {
        String inpDay = "30/4/2018";
        String expDay = "1/5/2018";

        String result = NextDayCalculator.findNextDay(inpDay);
        assertEquals(expDay, result);
    }

    @Test
    public void findNextDay2822018To132018() {
        String inpDay = "28/2/2018";
        String expDay = "1/3/2018";

        String result = NextDayCalculator.findNextDay(inpDay);
        assertEquals(expDay, result);
    }

    @Test
    public void findNextDay2922018To132018() {
        String inpDay = "29/2/2018";
        String expDay = "1/3/2018";

        String result = NextDayCalculator.findNextDay(inpDay);
        assertEquals(expDay, result);
    }

    @Test
    public void findNextDay31122028To112019() {
        String inpDay = "31/12/2018";
        String expDay = "1/1/2019";

        String result = NextDayCalculator.findNextDay(inpDay);
        assertEquals(expDay, result);
    }
}
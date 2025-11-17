import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {

    @Test
    public void testFindAbsolute() {
        int number = 0;
        int expNumber = 0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expNumber, result);
    }

    @Test
    public void testFindAbsolute1() {
        int number = 1;
        int expNumber = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expNumber, result);
    }

    @Test
    public void testFindAbsoluteNegative() {
        int number = -1;
        int expNumber = 1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expNumber, result);
    }
}
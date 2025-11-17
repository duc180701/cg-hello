import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void translateLess0() {
        int number = -1;
        String expResult = "Input not valid!";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }

    @Test
    public void translateMore100() {
        int number = 101;
        String expResult = "Input not valid!";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }

    @Test
    public void translate15() {
        int number = 15;
        String expResult = "FizzBuzz";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }

    @Test
    public void translate3() {
        int number = 3;
        String expResult = "Fizz";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }

    @Test
    public void translate5() {
        int number = 5;
        String expResult = "Buzz";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }

    @Test
    public void translate23() {
        int number = 23;
        String expResult = "Fizz";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }

    @Test
    public void translate26() {
        int number = 26;
        String expResult = "Hai Sáu";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }

    @Test
    public void translate52() {
        int number = 52;
        String expResult = "Buzz";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }

    @Test
    public void translate47() {
        int number = 47;
        String expResult = "Bốn Bảy";

        String result = FizzBuzz.translate(number);
        assertEquals(expResult, result);
    }
}
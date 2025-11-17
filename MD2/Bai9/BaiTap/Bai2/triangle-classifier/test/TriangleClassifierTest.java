import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifierTest {

    @Test
    public void triangleTest222() {
        int a = 2, b = 2, c = 2;
        String expString = "tam giác đều";

        String result = TriangleClassifier.triangleTest(a, b, c);
        assertEquals(expString, result);
    }

    @Test
    public void triangleTest223() {
        int a = 2, b = 2, c = 3;
        String expString = "tam giác cân";

        String result = TriangleClassifier.triangleTest(a, b, c);
        assertEquals(expString, result);
    }

    @Test
    public void triangleTest345() {
        int a = 3, b = 4, c = 5;
        String expString = "tam giác thường";

        String result = TriangleClassifier.triangleTest(a, b, c);
        assertEquals(expString, result);
    }

    @Test
    public void triangleTest823() {
        int a = 8, b = 2, c = 3;
        String expString = "không phải là tam giác";

        String result = TriangleClassifier.triangleTest(a, b, c);
        assertEquals(expString, result);
    }

    @Test
    public void triangleTestMinus121() {
        int a = -1, b = 2, c = 1;
        String expString = "không phải là tam giác";

        String result = TriangleClassifier.triangleTest(a, b, c);
        assertEquals(expString, result);
    }

    @Test
    public void triangleTest011() {
        int a = 0, b = 1, c = 1;
        String expString = "không phải là tam giác";

        String result = TriangleClassifier.triangleTest(a, b, c);
        assertEquals(expString, result);
    }
}
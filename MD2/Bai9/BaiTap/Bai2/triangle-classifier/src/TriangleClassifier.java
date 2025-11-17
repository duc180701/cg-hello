public class TriangleClassifier {
    public static String triangleTest(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a) {
            return "không phải là tam giác";
        } else if (a == b && b == c) {
            return "tam giác đều";
        } else if (a == b || b == c) {
            return "tam giác cân";
        } else {
            return "tam giác thường";
        }
    }
}

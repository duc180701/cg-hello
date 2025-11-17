package MD2.Bai7.ThucHanh.Bai2;

import java.util.Arrays;

public class CompareCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println("Circle: ("
                    + comparableCircle.getRadius()
                    + ", " + comparableCircle.getColor()
                    + ", " + comparableCircle.isFilled() + ")");
        }
        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle comparableCircle : circles) {
            System.out.println("Circle: ("
                    + comparableCircle.getRadius()
                    + ", " + comparableCircle.getColor()
                    + ", " + comparableCircle.isFilled() + ")");
        }
    }
}

package MD2.Bai15.ThucHanh.Bai3;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Enter y:");
        int y = sc.nextInt();
        calculate(x, y);
    }

    private static void calculate(int x, int y) {
        try {
            System.out.println("Tổng: " + (x + y));
            System.out.println("Hiệu: " + (x - y));
            System.out.println("Tích: " + (x * y));
            System.out.println("Thương: " + (x / y));
        } catch (Exception e) {
            System.out.println("Have exception: " + e.getMessage());
        }
    }
}

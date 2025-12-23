package MD2.Bai15.ThucHanh.Bai4;

import MD2.Bai12.ThucHanh.Bai4.Tree;

import java.util.Scanner;

public class TriangleTestException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first side:");
            int a = sc.nextInt();
            System.out.println("Enter second side:");
            int b = sc.nextInt();
            System.out.println("Enter third side:");
            int c = sc.nextInt();
            checkTriangle(a, b, c);
        } catch (IllegalTriangleException e) {
            System.out.println("Triangle error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Data invalid!");
        } finally {
            sc.close();
        }
    }

    private static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Triangle side must be > 0!");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("The sum of two sides must be greater than the remaining side");
        }
    }
}

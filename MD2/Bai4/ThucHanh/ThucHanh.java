package MD2.Bai4.ThucHanh;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        double length = sc.nextDouble();
        System.out.println("Enter the width:");
        double width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.printf("The area is: %.2f\n", rectangle.getArea());
        System.out.printf("The perimeter is: %.2f\n", rectangle.getPerimeter());
        rectangle.display();
    }
}

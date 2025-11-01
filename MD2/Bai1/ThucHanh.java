package MD2.Bai1;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        System.out.println("--------Bai 1--------");
        Date date = new Date();
        System.out.println("Now: " + date);
        System.out.println("--------Bai 2--------");
        int i = 10;
        float f = 20.5f;
        double d = 100.25;
        boolean b = true;
        char c = 'a';
        String s = "Hà Nội";
        System.out.println(
                "Số nguyên: " + i + "\n"
                        + "Số thực: " + f + "\n"
                        + "Số thực lớn: " + d + "\n"
                        + "Logic: " + b + "\n"
                        + "Ký tự: " + c + "\n"
                        + "Chuỗi: " + s
        );
        System.out.println("--------Bai 3--------");
        float height;
        float width;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = sc.nextFloat();
        System.out.println("Enter width: ");
        width = sc.nextFloat();
        float area = height * width;
        System.out.println("Area = " + area);
        System.out.println("--------Bai 4--------");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        System.out.println("a: ");
        double n1 = sc.nextDouble();
        System.out.println("b: ");
        double n2 = sc.nextDouble();
        System.out.println("c: ");
        double n3 = sc.nextDouble();
        if (n1 == 0) {
            System.out.println("No solution!");
        } else if (n2 == n3) {
            System.out.println("Solution is all x!");
        } else {
            double x = (n3 - n2) / n1;
            System.out.println("x = " + x);
        }
        System.out.println("--------Bai 5--------");
        System.out.println("Enter month: ");
        int month = sc.nextInt();
        switch (month) {
            case 2:
                System.out.println("The month '2' has 28 or 29 days!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month '" + month + "' has 31 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month '" + month + "' has 30 days!");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
        System.out.println("--------Bai 6--------");
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        boolean isDivAble4 = year % 4 == 0;
        if (isDivAble4) {
            boolean isDivAble100 = year % 100 == 0;
            if (isDivAble100) {
                boolean isDivAble400 = year % 400 == 0;

                if (isDivAble400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println("The year " + year + " is a leap year!");
        } else {
            System.out.println("The year " + year + " is NOT a leap year!");
        }
        System.out.println("--------Bai 7--------");
        System.out.println("Enter your height (cm): ");
        int urHeight = sc.nextInt();
        System.out.println("Enter your weight (kg): ");
        int urWeight = sc.nextInt();
        float bmi = ((float) urWeight) / (((float) urHeight) / 100);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Your BMI is: " + df.format(bmi));
        if (bmi < 18.5) {
            System.out.println("--> Underweight");
        } else if (18.5 <= bmi && bmi < 25.0) {
            System.out.println("--> Normal");
        } else if (25.0 <= bmi && bmi < 30.0) {
            System.out.println("--> Overweight");
        } else if (30.0 <= bmi) {
            System.out.println("--> Obese");
        } else {
            System.out.println("Invalid Input!");
        }
    }
}


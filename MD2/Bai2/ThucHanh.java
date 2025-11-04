package MD2.Bai2;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("-----MENU-----");
            System.out.println("1. Bai 1");
            System.out.println("2. Bai 2");
            System.out.println("3. Bai 3");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("-----Bai 1-----");
                    System.out.println("Enter a number:");
                    int number = sc.nextInt();
                    if (number < 2) {
                        System.out.println("Number is not a prime");
                    } else if (number == 2) {
                        System.out.println("Number is a prime");
                    } else {
                        int i = 2;
                        boolean isPrime = true;
                        while (i <= Math.sqrt(number)) {
                            if (number % i == 0) {
                                isPrime = false;
                                break;
                            }
                            i++;
                        }
                        if (isPrime) {
                            System.out.println("Number is a prime");
                        } else {
                            System.out.println("Number is not a prime");
                        }
                    }
                    break;
                case 2:
                    System.out.println("-----Bai 2-----");
                    System.out.println("Enter investment amount:");
                    long investAmount = sc.nextLong();
                    System.out.println("Enter number of month:");
                    int month = sc.nextInt();
                    System.out.println("Enter annual interest rate in percentage:");
                    double rate = sc.nextDouble();
                    double totalInterest = investAmount + investAmount * (rate / 100) * month;
                    System.out.printf("Total Investment: %,.0f VND\n", totalInterest);
                    break;
                case 3:
                    System.out.println("-----Bai 3-----");
                    System.out.println("Enter first number:");
                    int a = sc.nextInt();
                    System.out.println("Enter second number:");
                    int b = sc.nextInt();
                    int aABS = Math.abs(a);
                    int bABS = Math.abs(b);
                    if (a == 0 || b == 0) {
                        System.out.println("No greatest common factor");
                    }
                    while (aABS != bABS) {
                        if (aABS > bABS) {
                            aABS -= bABS;
                        } else {
                            bABS -= aABS;
                        }
                    }
                    System.out.println("Greatest common factor of " + a + " and " + b + " is: " + aABS);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

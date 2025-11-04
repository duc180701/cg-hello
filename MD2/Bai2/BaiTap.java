package MD2.Bai2;

import java.util.Scanner;

public class BaiTap {
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
                    System.out.println("1. Print the rectangle");
                    System.out.println("2. Print the square triangle");
                    System.out.println("3. Print isosceles triangle");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice:");
                    int choiceBai1 = sc.nextInt();
                    if (choiceBai1 == 1) {
                        System.out.println("Enter width:");
                        int width = sc.nextInt();
                        System.out.println("Enter height:");
                        int height = sc.nextInt();
                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } else if (choiceBai1 == 2) {
                        System.out.println("Enter the side length:");
                        int side = sc.nextInt();
                        int j = 1;
                        for (int i = 0; i < side; i++) {
                            for (int k = 0; k < j; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                            j++;
                        }
                    } else if (choiceBai1 == 3) {
                        System.out.println("Enter the side length:");
                        int side = sc.nextInt();
                        int j = 1;
                        for (int i = 0; i < side; i++) {
                            for (int k = 0; k < j; k++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                            j++;
                        }
                    } else if (choiceBai1 == 4){
                        System.out.println("Exiting....");
                    } else {
                        System.out.println("No choice!");
                    }
                    break;
                case 2:
                    int count = 0;
                    int check = 2;
                    String result = "";
                    while (count < 20) {
                        boolean isPrime = true;
                        for (int i = 2; i <= Math.sqrt(check); i++) {
                            if (check % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            result += check + " ";
                            count++;
                        }
                        check++;
                    }
                    System.out.println("The first 20 number prime: " + result);
                    break;
                case 3:
                    String resultBai3 = "";
                    for (int j = 2; j < 101; j++) {
                        boolean isPrime = true;
                        for (int i = 2; i <= Math.sqrt(j); i++) {
                            if (j % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            resultBai3 += j + " ";
                        }
                    }
                    System.out.println("Prime numbers less than 100: " + resultBai3);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Out of ability!");
            }
        }
    }
}

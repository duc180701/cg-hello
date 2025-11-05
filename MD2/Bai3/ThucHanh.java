package MD2.Bai3;

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
            System.out.println("4. Bai 4");
            System.out.println("5. Bai 5");
            System.out.println("6. Bai 6");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a size:");
                    int size = sc.nextInt();
                    if (size > 20) {
                        System.out.println("Size does not exceed 20");
                    } else if (size < 0) {
                        System.out.println("Size does not be less than 0");
                    } else {
                        int[] arr = new int[size];
                        System.out.println("Enter elements of array:");
                        for (int i = 0; i < size; i++) {
                            arr[i] = sc.nextInt();
                        }
                        for (int i = 0; i < (size / 2); i++) {
                            int temp = arr[i];
                            arr[i] = arr[size - i - 1];
                            arr[size - i - 1] = temp;
                        }
                        System.out.println("Array after reverse:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                            "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
                    sc.nextLine();
                    System.out.println("Enter name you want to find:");
                    String inputName = sc.nextLine();
                    boolean check = false;
                    for (int i = 0; i < students.length; i++) {
                        if (students[i].equals(inputName)) {
                            System.out.println("Position of student " + students[i] + " in the list is: " + (i + 1));
                            check = true;
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("Not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter a size:");
                    int sizeBai3 = sc.nextInt();
                    if (sizeBai3 > 20) {
                        System.out.println("Size does not exceed 20");
                    } else if (sizeBai3 < 0) {
                        System.out.println("Size does not be less than 0");
                    } else {
                        long[] array = new long[sizeBai3];
                        System.out.println("Enter elements of array:");
                        for (int i = 0; i < sizeBai3; i++) {
                            array[i] = sc.nextLong();
                        }
                        long maxValue = array[0];
                        int pos = 0;
                        for (int i = 0; i < sizeBai3; i++) {
                            if (array[i] > maxValue) {
                                maxValue = array[i];
                                pos = i + 1;
                            }
                        }
                        System.out.println("Max value of array is: " + maxValue + " at the " + pos + " position");
                    }
                    break;
                case 4:
                    System.out.println("1. Fahrenheit to Celsius");
                    System.out.println("2. Celsius to Fahrenheit");
                    System.out.println("0. Exit");
                    System.out.println("Enter your choice:");
                    int choiceBai4 = sc.nextInt();
                    switch (choiceBai4) {
                        case 1:
                            System.out.println("Enter fahrenheit:");
                            double fahrenheit = sc.nextDouble();
                            System.out.printf("Fahrenheit to Celsius: %.2f \n", fahrenheitToCelsius(fahrenheit));
                            break;
                        case 2:
                            System.out.println("Enter celsius:");
                            double celsius = sc.nextDouble();
                            System.out.printf("Celsius to Fahrenheit: %.2f \n", celsiusToFahrenheit(celsius));
                            break;
                        case 0:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("No choice!");
                    }
                    break;
                case 5:
                    System.out.println("Enter a size:");
                    int sizeBai5 = sc.nextInt();
                    if (sizeBai5 < 0) {
                        System.out.println("Size does not be less than 0");
                    } else {
                        int[] arrBai5 = new int[sizeBai5];
                        System.out.println("Enter elements of array:");
                        for (int i = 0; i < sizeBai5; i++) {
                            arrBai5[i] = sc.nextInt();
                        }
                        System.out.println("Min value of array is: " + minValue(arrBai5));
                    }
                    break;
                case 6:
                    System.out.println("Enter a size:");
                    int sizeBai6 = sc.nextInt();
                    if (sizeBai6 > 30) {
                        System.out.println("Size does not exceed 30");
                    } else if (sizeBai6 < 0) {
                        System.out.println("Size does not be less than 0");
                    } else {
                        float[] arrBai6 = new float[sizeBai6];
                        System.out.println("Enter elements of array:");
                        for (int i = 0; i < sizeBai6; i++) {
                            arrBai6[i] = sc.nextFloat();
                        }
                        int count = 0;
                        for (int i = 0; i < sizeBai6; i++) {
                           if (arrBai6[i] >= ((float) 5) && arrBai6[i] <= ((float) 10)) {
                               count++;
                           }
                        }
                        System.out.println("Number of students pass the exam: " + count);
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius / (5.0 / 9)) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit -32);
    }

    public static int minValue(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
}

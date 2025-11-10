package MD2.Bai4.BaiTap;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("-----MENU-----");
            System.out.println("1. QuadraticEquation");
            System.out.println("2. StopWatch");
            System.out.println("3. Fan");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter a:");
                    double a = sc.nextDouble();
                    System.out.println("Enter b:");
                    double b = sc.nextDouble();
                    System.out.println("Enter c:");
                    double c = sc.nextDouble();
                    QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
                    double delta = quadraticEquation.getDiscriminant();
                    if (delta > 0) {
                        System.out.printf("X1 = %.2f\n", quadraticEquation.getRoot1());
                        System.out.printf("X2 = %.2f\n", quadraticEquation.getRoot2());
                    } else if (delta == 0) {
                        System.out.printf("X1 = X2 = %.2f\n", quadraticEquation.getRoot1());
                    } else {
                        System.out.println("The equation has no roots!");
                    }
                    break;
                case 2:
                    List<Integer> initList = IntStream.range(0, 100_000).boxed().collect(Collectors.toList());
                    Collections.shuffle(initList);
                    StopWatch stopWatch = new StopWatch();
                    stopWatch.start();
                    int minValue = initList.get(0);
                    int i = 0;
                    int pos = -1;
                    while (i < 100000) {
                        for (int j = i; j < initList.size(); j++) {
                            if (initList.get(j) < minValue) {
                                minValue = initList.get(j);
                                pos = j;
                            }
                        }
                        if (minValue != initList.get(i) && pos != -1) {
                            int tmp = initList.get(i);
                            initList.set(i, minValue);
                            initList.set(pos, tmp);
                        }
                        i++;
                        pos = -1;
                        if (i < 100000) {
                            minValue = initList.get(i);
                        }
                    }
                    stopWatch.stop();
                    System.out.println("Time to execute selected sort algorithm: " + stopWatch.getElapsedTime() + " ms");
                    break;
                case 3:
                    Fan fanDefault = new Fan();
                    Fan fan1 = new Fan(Fan.FAST, true, 10, "yellow");
                    Fan fan2 = new Fan(Fan.MEDIUM, false, 5, "blue");
                    System.out.println("-----\nFan Default: \n" + fanDefault.toString());
                    System.out.println("-----\nFan 1: \n" + fan1.toString());
                    System.out.println("-----\nFan 2: \n" + fan2.toString());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
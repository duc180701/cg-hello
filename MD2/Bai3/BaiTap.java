package MD2.Bai3;

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
            System.out.println("4. Bai 4");
            System.out.println("5. Bai 5");
            System.out.println("6. Bai 6");
            System.out.println("7. Bai 7");
            System.out.println("8. Bai 8");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int[] initArr = {10, 4, 6, 7, 8, 6, 3, 1, 2, 9};
                    System.out.println("Init Array:");
                    for (int i = 0; i < initArr.length; i++) {
                        System.out.print(initArr[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Enter number want to delete:");
                    int inputDel = sc.nextInt();
                    boolean check = false;
                    int pos = 0;
                    for (int i = 0; i < initArr.length; i++) {
                        if (initArr[i] == inputDel) {
                            pos = i;
                            check = true;
                            if (pos == (initArr.length - 1)) {
                                initArr[pos] = 0;
                            } else {
                                for (int j = pos; j < initArr.length - 1; j++) {
                                    initArr[j] = initArr[j + 1];
                                }
                                initArr[initArr.length - 1] = 0;
                            }
                            break;
                        }
                    }
                    if (!check) {
                        System.out.println("No value " + inputDel + " in init array!");
                    }
                    System.out.println("Array after delete:");
                    for (int i = 0; i < initArr.length; i++) {
                        System.out.print(initArr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    int[] initArr2 = {10, 4, 6, 7, 8, 6, 3, 1, 2, 9};
                    System.out.println("Init Array:");
                    for (int i = 0; i < initArr2.length; i++) {
                        System.out.print(initArr2[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Enter number want to insert:");
                    int inputIns = sc.nextInt();
                    System.out.println("Enter position want to insert:");
                    int position = sc.nextInt();
                    if (position <= 0 || position > initArr2.length) {
                        System.out.println("Position out of range!");
                        break;
                    }
                    if (position == initArr2.length) {
                        initArr2[initArr2.length - 1] = inputIns;
                    } else {
                        for (int i = initArr2.length - 1; i > position - 1; i--) {
                            initArr2[i] = initArr2[i - 1];
                        }
                        initArr2[position - 1] = inputIns;
                    }
                    System.out.println("Array after insert:");
                    for (int i = 0; i < initArr2.length; i++) {
                        System.out.print(initArr2[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the size of first array:");
                    int firstSize = sc.nextInt();
                    int[] firstArray = new int[firstSize];
                    System.out.println("Enter elements of first array:");
                    for (int i = 0; i < firstSize; i++) {
                        firstArray[i] = sc.nextInt();
                    }
                    System.out.println("Enter the size of second array:");
                    int secondSize = sc.nextInt();
                    int[] secondArray = new int[secondSize];
                    System.out.println("Enter elements of second array:");
                    for (int i = 0; i < secondSize; i++) {
                        secondArray[i] = sc.nextInt();
                    }
                    int[] thirdArray = new int[firstSize + secondSize];
                    for (int i = 0; i < firstSize; i++) {
                        thirdArray[i] = firstArray[i];
                    }
                    for (int i = 0; i < secondSize; i++) {
                        thirdArray[firstSize + i] = secondArray[i];
                    }
                    System.out.println("Array after combine:");
                    for (int i = 0; i < thirdArray.length; i++) {
                        System.out.print(thirdArray[i] + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    int[][] arr2D = {{10, 4}, {6, 7}, {8, 6}, {3, 1}, {2, 9}};
                    int maxValue = 0;
                    System.out.println("Init array 2D:");
                    for (int i = 0; i < arr2D.length; i++) {
                        for (int j = 0; j < arr2D[i].length; j++) {
                            System.out.print(arr2D[i][j] + " ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < arr2D.length; i++) {
                        for (int j = 0; j < arr2D[i].length; j++) {
                            if (arr2D[i][j] > maxValue) {
                                maxValue = arr2D[i][j];
                            }
                        }
                    }
                    System.out.println("Max value in array 2D is: " + maxValue);
                    break;
                case 5:
                    int[][] arr2DBai5 = {{10, 4}, {6, 7}, {8, 6}, {3, 1}, {2, 9}};
                    int minValue = 999999999;
                    System.out.println("Init array 2D:");
                    for (int i = 0; i < arr2DBai5.length; i++) {
                        for (int j = 0; j < arr2DBai5[i].length; j++) {
                            System.out.print(arr2DBai5[i][j] + " ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < arr2DBai5.length; i++) {
                        for (int j = 0; j < arr2DBai5[i].length; j++) {
                            if (arr2DBai5[i][j] < minValue) {
                                minValue = arr2DBai5[i][j];
                            }
                        }
                    }
                    System.out.println("Max value in array 2D is: " + minValue);
                    break;
                case 6:
                    System.out.println("Enter size of array 2D, separates by spaces: (ex: 2 5)");
                    sc.nextLine();
                    String sizeStr = sc.nextLine();
                    String[] sizeArr = sizeStr.split(" ");
                    int size1 = Integer.parseInt(sizeArr[0]);
                    int size2 = Integer.parseInt(sizeArr[1]);
                    double[][] array2DBai6 = new double[size1][size2];
                    for (int i = 0; i < array2DBai6.length; i++) {
                        for (int j = 0; j < array2DBai6[i].length; j++) {
                            array2DBai6[i][j] = sc.nextDouble();
                        }
                    }
                    System.out.println("Enter the numbers of column want to sum:");
                    int column = sc.nextInt();
                    double sum = 0;
                    for (int i = 0; i < array2DBai6.length; i++) {
                        sum += array2DBai6[i][column - 1];
                    }
                    System.out.println("Sum of column " + column + " in array 2D is: " + sum);
                    break;
                case 7:
                    System.out.println("Enter size of array 2D (square array 2D):");
                    int sizeSquare = sc.nextInt();
                    double[][] squareArr = new double[sizeSquare][sizeSquare];
                    for (int i = 0; i < sizeSquare; i++) {
                        for (int j = 0; j < sizeSquare; j++) {
                            squareArr[i][j] = sc.nextDouble();
                        }
                    }
                    double sumMainDiagonal = 0;
                    for (int i = 0; i < sizeSquare; i++) {
                        sumMainDiagonal += squareArr[i][i];
                    }
                    System.out.println("Sum numbers of main diagonal: " + sumMainDiagonal);
                    break;
                case 8:
                    System.out.println("Enter init string:");
                    sc.nextLine();
                    String initStr = sc.nextLine();
                    System.out.println("Enter character want to count in init string:");
                    char inputChar = sc.next().charAt(0);
                    int count = 0;
                    for (int i = 0; i < initStr.length(); i++) {
                        if (inputChar == initStr.charAt(i)) {
                            count++;
                        }
                    }
                    System.out.println("Number of occurrences of the character " + inputChar + " is: " + count);
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

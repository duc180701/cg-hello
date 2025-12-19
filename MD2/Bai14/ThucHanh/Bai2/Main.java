package MD2.Bai14.ThucHanh.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter each element: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("-----------");
        System.out.print("Init list:");
        printList(list);
        bubbleSort(list);
        System.out.println("-----------");
        System.out.print("List after bubble sort:");
        printList(list);
    }

    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    System.out.println("-----------");
                    System.out.println("Swap:" + list[j - 1] + " at position " + (j - 1) + " with " + list[j] + " at position " + (j));
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;

                    System.out.print("List after swap: ");
                    printList(list);
                }
            }
        }
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}

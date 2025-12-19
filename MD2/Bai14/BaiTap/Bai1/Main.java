package MD2.Bai14.BaiTap.Bai1;

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
        System.out.print("List after insertion sort:");
        printList(list);
    }

    public void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {

        }
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}

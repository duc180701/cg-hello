package MD2.Bai14.BaiTap.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {4, 2, 6, 8, 3, 9, 1, 10, 7, 5};
        insertionSort(list);
        System.out.println("-----------");
        System.out.print("List after insertion sort: ");
        printList(list);
    }

    public static void insertionSort(int[] list) {
        if (list.length > 1) {
            for (int i = 0; i < list.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (list[i] < list[j]) {
                        int temp = list[i];
                        for (int k = i; k > j; k--) {
                            list[k] = list[k - 1];
                        }
                        list[j] = temp;
                        break;
                    }
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

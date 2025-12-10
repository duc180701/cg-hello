package MD2.Bai13.BaiTap.Bai2;

import javax.swing.*;
import java.util.Arrays;

public class BinarySearch {
    static int[] list = {4, 7, 24, 1, 89, 5, 70, 2, 22, 44, 17, 27, 15, 61, 78};

    static int binarySearch(int[] list, int left, int right, int value) {
        if (left == right && left == list.length) {
            return -1;
        }
        if (left <= right) {
            int middle = (left + right) / 2;
            if (value == list[middle]) {
                return middle;
            } else if (value < list[middle]) {
                return binarySearch(list, left, middle - 1, value);
            } else if (value > list[middle]) {
                return binarySearch(list, middle + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] listSorted = Arrays.stream(list).sorted().toArray();
        for (int i = 0; i < listSorted.length; i++) {
            System.out.print(listSorted[i] + " ");
        }
        System.out.println();
        System.out.println(binarySearch(listSorted, 0, listSorted.length, 44));
        System.out.println(binarySearch(listSorted, 0, listSorted.length, 1));
        System.out.println(binarySearch(listSorted, 0, listSorted.length, 3));
        System.out.println(binarySearch(listSorted, 0, listSorted.length, 99));
        System.out.println(binarySearch(listSorted, 0, listSorted.length, 89));
        System.out.println(binarySearch(listSorted, 0, listSorted.length, 0));
    }
}

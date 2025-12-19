package MD2.Bai14.ThucHanh.Bai1;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        printList(list);
    }

    public static void bubbleSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
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

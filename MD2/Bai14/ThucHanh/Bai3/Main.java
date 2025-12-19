package MD2.Bai14.ThucHanh.Bai3;

public class Main {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        printList(list);
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int pos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    pos = j;
                }
            }
            if (pos != i) {
                double temp = list[i];
                list[i] = min;
                list[pos] = temp;
            }
        }
    }

    public static void printList(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}

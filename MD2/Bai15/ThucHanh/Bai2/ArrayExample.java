package MD2.Bai15.ThucHanh.Bai2;

import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List element of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }
}

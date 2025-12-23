package MD2.Bai15.ThucHanh.Bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        System.out.println("Enter position of a element: ");
        int pos = sc.nextInt();
        try {
            System.out.println("Value of element at " + pos + " is " + arr[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound!");
        }
    }
}

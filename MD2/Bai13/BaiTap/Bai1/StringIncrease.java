package MD2.Bai13.BaiTap.Bai1;

import java.util.Scanner;

public class StringIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        int temp = -1;
        for (int i = 0; i < str.length(); i++) {
            int current = (int) str.charAt(i);
            if (current > temp) {
                temp = current;
                System.out.print(str.charAt(i));
            }
        }
    }
}

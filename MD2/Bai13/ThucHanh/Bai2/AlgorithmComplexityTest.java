package MD2.Bai13.ThucHanh.Bai2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < str.length(); i++) {
            frequentChar[(int) str.charAt(i)] += 1;
        }

        int max = 0;
        char c = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (frequentChar[i] > max) {
                max = frequentChar[i];
                c = (char) i;
            }
        }

        System.out.println("The most appearing letter is '" + c + "' with a frequency of " + max + " times");
    }
}

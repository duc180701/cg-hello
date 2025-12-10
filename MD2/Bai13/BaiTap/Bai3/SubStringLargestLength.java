package MD2.Bai13.BaiTap.Bai3;

import java.util.Scanner;

public class SubStringLargestLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        StringBuilder subString = new StringBuilder();
        String result = "";
        int largestLength = -1;
        int i = 1;
        subString.append(str.charAt(0));
        while (i < str.length()) {
            if ((int) str.charAt(i) > (int) str.charAt(i - 1)) {
                subString.append(str.charAt(i));
            } else {
                if (largestLength < subString.length()) {
                    largestLength = subString.length();
                    result = String.valueOf(subString);
                }
                subString = new StringBuilder();
                if ((i + 1) < str.length()) {
                    subString.append(str.charAt(i));
                }
            }
            i++;
        }
        if (largestLength < subString.length()) {
            largestLength = subString.length();
            result = String.valueOf(subString);
        }
        System.out.println("Largest SubString: " + result + " with length: " + largestLength);
    }
}

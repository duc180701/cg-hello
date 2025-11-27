package MD2.Bai11.BaiTap.Bai5;

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {
        MyStack<String> stackStr = new MyStack<>();
        MyQueue<String> queueStr = new MyQueue<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        System.out.println("Init String: " + str);
        for (int i = 0; i < str.length(); i++) {
            String character = String.valueOf(str.charAt(i)).toLowerCase();
            stackStr.push(character);
            queueStr.push(character);
        }
        System.out.println("String from Stack: " + stackStr.print());
        System.out.println("String from Queue: " + queueStr.print());
        if (stackStr.print().equals(queueStr.print())) {
            System.out.println("Init string is Palindrome!");
        } else {
            System.out.println("Init string is not Palindrome!");
        }
    }
}

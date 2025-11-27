package MD2.Bai11.BaiTap.Bai4;

import java.util.Scanner;

public class StackClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();

        MyStack<Integer> stack = new MyStack<>();
        do {
            stack.push(number % 2);
            number /= 2;
        } while (number != 0);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

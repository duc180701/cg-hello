package MD2.Bai11.BaiTap.Bai6;

import java.util.Scanner;

public class CheckParam {
    public static void main(String[] args) {
        MyStack<String> stackParam = new MyStack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your param:");
        String param = sc.nextLine();
        if (check(param, stackParam)) {
            System.out.println("Well!");
        } else {
            System.out.println("Nah!");
        }
    }

    public static boolean check(String param, MyStack<String> stackParam) {
        for (int i = 0; i < param.length(); i++) {
            String symbol = String.valueOf(param.charAt(i));
            if ("(".equals(symbol)) {
                stackParam.push(symbol);
            }
            if (")".equals(symbol)) {
                if (stackParam.isEmpty()) {
                    return false;
                } else {
                    stackParam.pop();
                }
            }
        }
        return stackParam.isEmpty();
    }
}

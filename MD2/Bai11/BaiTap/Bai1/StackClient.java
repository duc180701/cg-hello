package MD2.Bai11.BaiTap.Bai1;

public class StackClient {
    public static void main(String[] args) {
        int[] initArr = {1, 2, 3, 4, 5, 6, 7};
        MyStack<Integer> stack = new MyStack<Integer>(initArr.length);
        for (int i = 0; i < initArr.length; i++) {
            stack.push(initArr[i]);
        }
        for (int i = 0 ; i < initArr.length; i++) {
            initArr[i] = stack.pop();
        }
        System.out.println("Array after reverse: ");
        for (int i = 0; i < initArr.length; i++) {
            System.out.print(initArr[i] + " ");
        }
        System.out.println();

        String initString = "Hello TranTrungDuc!";
        MyStack<String> stringStack = new MyStack<String>(initString.length());
        for (int i = 0; i < initString.length(); i++) {
            stringStack.push(String.valueOf(initString.charAt(i)));
        }
        StringBuilder reverseString = new StringBuilder();
        for (int i = 0; i < initString.length(); i++) {
            reverseString.append(stringStack.pop());
        }
        System.out.println(reverseString);
    }
}

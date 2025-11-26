package MD2.Bai11.ThucHanh.Bai4;

public class StackClient {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        System.out.println("1. Size of stack after push operations: " + myStack.size());
        System.out.println("2. Pop elements from stack: ");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " ");
        }
        System.out.println("\n3. Size of stack after pop operations: " + myStack.size());
    }
}

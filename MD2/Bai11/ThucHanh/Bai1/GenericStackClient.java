package MD2.Bai11.ThucHanh.Bai1;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfIntegers();
        System.out.println("----------");
        stackOfIStrings();
    }

    public static void stackOfIStrings() {
        MyGenericStack<String> myGenericStack = new MyGenericStack<String>();
        myGenericStack.push("Five");
        myGenericStack.push("Four");
        myGenericStack.push("Three");
        myGenericStack.push("Two");
        myGenericStack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + myGenericStack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!myGenericStack.isEmpty()) {
            System.out.print(myGenericStack.pop() + " ");
        }
        System.out.println("\n1.3 Size of stack after pop operations: " + myGenericStack.size());
    }

    public static void stackOfIntegers() {
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<Integer>();
        myGenericStack.push(5);
        myGenericStack.push(4);
        myGenericStack.push(3);
        myGenericStack.push(2);
        myGenericStack.push(1);
        System.out.println("1.1 Size of stack after push operations: " + myGenericStack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!myGenericStack.isEmpty()) {
            System.out.print(myGenericStack.pop() + " ");
        }
        System.out.println("\n1.3 Size of stack after pop operations: " + myGenericStack.size());
    }
}

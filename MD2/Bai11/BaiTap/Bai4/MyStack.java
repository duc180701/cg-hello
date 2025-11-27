package MD2.Bai11.BaiTap.Bai4;

public class MyStack<T> {
    public int size = 0;
    public Node top;

    public MyStack() {
        top = null;
        this.size = 0;
    }

    public MyStack(int data) {
        top = new Node(data);
        this.size = 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (top == null) {
            top = newNode;
            size++;
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (top == null) {
            System.out.println("Stack is empty !");
            return null;
        }
        T data = (T) top.data;
        top = top.next;
        size--;
        return data;
    }
}

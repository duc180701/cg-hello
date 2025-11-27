package MD2.Bai11.BaiTap.Bai5;

public class MyStack<T> {
    public NodeStack<T> top;
    public int size = 0;

    public MyStack() {
        this.top = null;
    }

    public MyStack(T data) {
        this.top = new NodeStack<>(data);
        this.size = 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(T data) {
        NodeStack<T> newNode = new NodeStack<>(data);
        if (isEmpty()) {
            top = newNode;
            size++;
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty !");
            return null;
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public String print() {
        NodeStack<T> temp = top;
        StringBuilder result = new StringBuilder();
        while (temp.next != null) {
            result.append(temp.data);
            temp = temp.next;
        }
        result.append(temp.data);
        return String.valueOf(result);
    }
}

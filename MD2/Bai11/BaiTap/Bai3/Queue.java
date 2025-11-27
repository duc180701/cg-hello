package MD2.Bai11.BaiTap.Bai3;

public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }
}

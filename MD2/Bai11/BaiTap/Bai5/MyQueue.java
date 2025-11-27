package MD2.Bai11.BaiTap.Bai5;

public class MyQueue<T> {
    public int size = 0;
    public NodeQueue<T> front;
    public NodeQueue<T> rear;

    public MyQueue() {
        this.front = this.rear = null;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void push(T data) {
        NodeQueue<T> newNode = new NodeQueue<>(data);
        if (isEmpty()) {
            this.front = this.rear = newNode;
            this.rear.link = this.front;
            this.size++;
        } else {
            this.rear.link = newNode;
            this.rear = newNode;
            this.rear.link = this.front;
            this.size++;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty !");
            return null;
        }
        T data = this.front.data;
        this.front = this.front.link;
        this.rear.link = this.front;
        size--;
        return data;
    }

    public String print() {
        StringBuilder result = new StringBuilder();
        NodeQueue<T> temp = this.front;
        do {
            result.append(temp.data);
            temp = temp.link;
        } while (temp.link != this.front);
        result.append(temp.data);
        return String.valueOf(result);
    }
}

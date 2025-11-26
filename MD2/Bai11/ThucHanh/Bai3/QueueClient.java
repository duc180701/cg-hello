package MD2.Bai11.ThucHanh.Bai3;

public class QueueClient {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.displayQueue();
        queue.enqueue(4);
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        queue.enqueue(56);
        queue.displayQueue();
        queue.enqueue(2);
        queue.displayQueue();
        queue.enqueue(67);
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        queue.enqueue(24);
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        queue.enqueue(98);
        queue.displayQueue();
        queue.enqueue(45);
        queue.displayQueue();
        queue.enqueue(23);
        queue.displayQueue();
        queue.enqueue(435);
        queue.displayQueue();

    }
}

package MD2.Bai11.ThucHanh.Bai2;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(10);
        myLinkedListQueue.enqueue(20);
        myLinkedListQueue.enqueue(30);
        myLinkedListQueue.dequeue();
        myLinkedListQueue.dequeue();
        myLinkedListQueue.enqueue(40);
        myLinkedListQueue.enqueue(50);
        System.out.println("Dequeued item: " + myLinkedListQueue.dequeue().key);
    }
}

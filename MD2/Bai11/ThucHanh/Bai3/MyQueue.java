package MD2.Bai11.ThucHanh.Bai3;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head = 0;
    public int tail = -1;
    public int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        return this.currentSize == this.capacity;
    }

    public boolean isQueueEmpty() {
        return this.currentSize == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element: " + item);
            return;
        }
        tail = (tail + 1) % capacity;
        queueArr[tail] = item;
        currentSize++;
        System.out.println("Element " + item + " is pushed to Queue !");
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
            return;
        }
        System.out.println("Pop operation done ! removed: " + queueArr[head]);
        head = (head + 1) % capacity;
        currentSize--;
    }

    public void displayQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty!");
            System.out.println("------------");
            return;
        }

        System.out.print("Current Queue: ");

        int index = head;
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queueArr[index] + " ");
            index = (index + 1) % capacity;
        }

        System.out.println();
        System.out.println("------------");
    }
}

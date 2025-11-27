package MD2.Bai11.BaiTap.Bai3;

public class Solution {
    public void enQueue(int element, Queue queue) {
        Node newNode = new Node(element);
        if (queue.isEmpty()) {
            queue.front = queue.rear = newNode;
            queue.rear.link = queue.front;
        } else {
            queue.rear.link = newNode;
            queue.rear = newNode;
            queue.rear.link = queue.front;
        }
    }

    public Integer deQueue(Queue queue) {
        if (queue.isEmpty()) {
            return null;
        }
        int element = queue.front.data;
        if (queue.front ==  queue.rear) {
            queue.front = queue.rear = null;
        } else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        return element;
    }

    public void displayQueue(Queue queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = queue.front;
        System.out.print("Queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != queue.front);
        System.out.println();
    }
}

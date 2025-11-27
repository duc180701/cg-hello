package MD2.Bai11.BaiTap.Bai3;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Solution solution = new Solution();

        solution.enQueue(10, queue);
        solution.enQueue(20, queue);
        solution.enQueue(30, queue);

        solution.displayQueue(queue);

        System.out.println("DeQueue: " + solution.deQueue(queue));
        solution.displayQueue(queue);

        solution.enQueue(40, queue);
        solution.displayQueue(queue);
    }
}

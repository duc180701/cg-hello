package MD2.Bai10.ThucHanh.Bai2;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.add(4,14);
        myLinkedList.add(4,9);
        myLinkedList.printList();
    }
}

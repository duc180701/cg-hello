package MD2.Bai10.BaiTap.Bai2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>(5);
        myLinkedList.printLinkedList();

        myLinkedList.add(1, 1);
        myLinkedList.add(2, 2);
        myLinkedList.add(3, 3);
        myLinkedList.add(2, 7);
        myLinkedList.printLinkedList();

        myLinkedList.addFirst(8);
        myLinkedList.printLinkedList();

        myLinkedList.addLast(11);
        myLinkedList.printLinkedList();

        System.out.println("Removed: " + myLinkedList.remove(6));
        myLinkedList.printLinkedList();

        System.out.println("Removed item: " + myLinkedList.remove((Object) 5));
        myLinkedList.printLinkedList();

        System.out.println("Size: " + myLinkedList.size());
        System.out.println("------------");

        MyLinkedList<Integer> cloneList = myLinkedList.clone();
        cloneList.printLinkedList();

        System.out.println(myLinkedList.contains(5));
        System.out.println(myLinkedList.contains(3));
        System.out.println("------------");

        System.out.println(myLinkedList.indexOf(8));
        System.out.println(myLinkedList.indexOf(3));
        System.out.println("------------");

        myLinkedList.add(4);
        myLinkedList.add(11);
        myLinkedList.printLinkedList();

        System.out.println(myLinkedList.get(6));
        System.out.println("------------");

        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
        System.out.println("------------");

        myLinkedList.clear();
        myLinkedList.printLinkedList();
    }
}

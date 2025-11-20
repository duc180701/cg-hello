package MD2.Bai10.ThucHanh.Bai1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        System.out.println("Element 4: " + myList.get(4));
        System.out.println("Element 1: " + myList.get(1));
        System.out.println("Element 2: " + myList.get(2));

        myList.get(6);
        System.out.println("Element 6: " + myList.get(6));

        myList.get(-1);
        System.out.println("element -1: " + myList.get(-1));
    }
}

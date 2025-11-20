package MD2.Bai10.BaiTap.Bai1;

public class MyListTest {
    public static void main(String[] args) {

        MyList<Integer> emptyList = new MyList<Integer>();
        emptyList.printElements();

        MyList<Integer> myList = new MyList<Integer>(5);
        myList.printElements();

        myList.add(0, 5);
        myList.add(1, 3);
        myList.add(3, 7);
        myList.add(9, 7);
        myList.printElements();

        Integer intRemoved1 = myList.remove(2);
        System.out.println("Removed: " + intRemoved1);
        myList.printElements();

        System.out.println("Size: " + myList.size());

        MyList<Integer> cloneElements = myList.clone();
        cloneElements.printElements();

        System.out.println(myList.contains(3));
        System.out.println(myList.indexOf(3));

        System.out.println(myList.add(4));
        myList.printElements();

        System.out.println(myList.get(3));

        myList.clear();
        myList.printElements();
    }
}

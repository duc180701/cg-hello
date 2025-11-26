package MD2.Bai11.ThucHanh.Bai4;

public class MyStack {
    public int[] arr;
    public int size = 0;
    public int index = 0;

    public MyStack(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void push(int element) {
        if (index == size) {
            System.out.println("Overflow ! Unable to add element: " + element);
            return;
        }
        arr[index] = element;
        index++;
        System.out.println("Element " + element + " is pushed to Stack !");
    }

    public int pop() {
        if (index == 0) {
            System.out.println("Underflow ! Unable to pop element from Stack");
            return 0;
        }
        return arr[--index];
    }

    public int size() {
        return this.index;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }
}

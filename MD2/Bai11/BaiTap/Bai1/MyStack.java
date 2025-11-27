package MD2.Bai11.BaiTap.Bai1;

public class MyStack<T> {
    private int index = 0;
    private int size = 0;
    private T[] arr;

    public MyStack(int size) {
        arr = (T[]) new Object[size];
        this.size = size;
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public void push(T element) {
        if (isFull()) {
            throw new StackOverflowError("Overflow ! Unable to add element " + element);
        }
        arr[index] = element;
        index++;
        System.out.println("Element " + element + " is pushed to Stack !");
    }

    public T pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Underflow ! Unable to pop element from Stack!");
        }
        return arr[--index];
    }

    public int size() {
        return this.index;
    }
}

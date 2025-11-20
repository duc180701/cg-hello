package MD2.Bai10.ThucHanh.Bai1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(Object[] elements) {
        this.elements = elements;
    }

    public void ensureCapa() {
        int newSize = size * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public E get(int i) {
        if (i < 0 || i >= elements.length) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size + ", Element length: " + elements.length);
        }
        return (E) elements[i];
    }
}

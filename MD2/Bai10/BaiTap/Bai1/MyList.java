package MD2.Bai10.BaiTap.Bai1;

import java.text.ParseException;
import java.util.Arrays;

public class MyList<E> implements Cloneable {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size + ", Length: " + elements.length);
        }
        ensureCapacity(index);
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= elements.length) {
            this.elements = Arrays.copyOf(this.elements, minCapacity + 1);
        }
    }

    public E remove(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size + ", Length: " + elements.length);
        }
        E removedElement = (E) elements[index];
        for (int i = index; i < this.elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[this.elements.length - 1] = null;
        if (removedElement != null) {
            size--;
        }
        Object[] tempElements = new Object[this.elements.length - 1];
        for (int i = 0; i < tempElements.length; i++) {
            tempElements[i] = this.elements[i];
        }
        this.elements = tempElements;
        return removedElement;
    }

    public int size() {
        return this.size;
    }

    public MyList<E> clone() {
        try {
            MyList<E> newList = (MyList<E>) super.clone();
            newList.elements = new Object[this.elements.length];
            for (int i = 0; i < this.elements.length; i++) {
                newList.elements[i] = this.elements[i];
            }
            return newList;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean contains(E o) {
        if (o == null) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (o.equals((E) this.elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        if (o == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (o.equals((E) this.elements[i])) {
                return i + 1;
            }
        }
        return -1;
    }

    public boolean add (E e) {
        ensureCapacity(this.elements.length);
        this.elements[this.elements.length - 1] = e;
        size++;
        return true;
    }

    public E get(int i) {
        return (E) this.elements[i];
    }

    public void clear() {
        this.size = 0;
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void printElements() {
        if (size == 0) {
            System.out.println("Elements Empty!");
        } else {
            for (int i = 0; i < this.elements.length; i++) {
                System.out.print(this.elements[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Size: " + this.size + "\nLength: " + this.elements.length);
        System.out.println("--------------");
    }
 }

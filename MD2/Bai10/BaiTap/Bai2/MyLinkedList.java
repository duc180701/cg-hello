package MD2.Bai10.BaiTap.Bai2;

public class MyLinkedList<E> {

    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
        head = null;
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("------------");
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }

        if (head == null) {
            head = new Node(element);
            numNodes = 1;
            return;
        }

        if (index == 0) {
            Node newNode = new Node(element);
            newNode.next = head;
            head = newNode;
            numNodes++;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node holder = temp.next;
        temp.next = new Node(element);
        (temp.next).next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        if (head == null) {
            head = new Node(e);
            numNodes = 1;
            return;
        }
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            head = new Node(e);
            numNodes = 1;
            return;
        }
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        if (head == null) {
            throw new IndexOutOfBoundsException("Index: " + index + "; LinkedList is null");
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Object removeElement = temp.next.getData();
        temp.next = temp.next.next;
        numNodes--;
        return (E) removeElement;
    }

    public boolean remove(Object e) {
        if (head == null) {
            throw new IndexOutOfBoundsException("LinkedList is null");
        }
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (e.equals(temp.getData())) {
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        if (head == null) {
            return null;
        }
        MyLinkedList<E> newLinkedList = new MyLinkedList<>(head.data);
        Node tempGoc = head;
        Node tempClone = newLinkedList.head;
        for (int i = 0; i < numNodes - 1; i++) {
            tempClone.next = tempGoc.next;
        }
        newLinkedList.numNodes = numNodes;
        return newLinkedList;
    }

    public boolean contains(E o) {
        if (head == null) {
            return false;
        }
        if (o == null) {
            return false;
        }
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E o) {
        if (head == null) {
            return -1;
        }
        if (o == null) {
            return -1;
        }
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(o)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(E o) {
        if (head == null) {
            Node newNode = new Node(o);
            numNodes = 1;
            return true;
        }

        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = new Node(o);
        numNodes++;
        return true;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst() {
        if (head == null) {
            return null;
        }
        return (E) head.data;
    }

    public E getLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    private static class Node {
        private Node next;
        private Object data;

        public Node (Object data) {
            this.data = data;
        }

        private Object getData() {
            return this.data;
        }
    }
}

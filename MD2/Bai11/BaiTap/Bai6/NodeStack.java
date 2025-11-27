package MD2.Bai11.BaiTap.Bai6;

public class NodeStack<T> {
    public T data;
    public NodeStack<T> next;

    public NodeStack() {
        this.data = null;
        this.next = null;
    }

    public NodeStack(T data) {
        this.data = data;
        this.next = null;
    }
}

package MD2.Bai11.BaiTap.Bai5;

public class NodeQueue<T> {
    public T data;
    public NodeQueue<T> link;

    public NodeQueue() {
        this.data = null;
        this.link = null;
    }

    public NodeQueue(T data) {
        this.data = data;
        this.link = null;
    }
}

package MD2.Bai18.BaiTap.Bai1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("N1", Thread.MIN_PRIORITY);
        NumberGenerator numberGenerator2 = new NumberGenerator("N2", Thread.MAX_PRIORITY);
    }
}

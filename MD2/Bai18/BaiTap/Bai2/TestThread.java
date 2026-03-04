package MD2.Bai18.BaiTap.Bai2;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread("OddThread");
        EvenThread evenThread = new EvenThread("EvenThread");

        oddThread.start();
        oddThread.join();
        evenThread.start();
    }
}

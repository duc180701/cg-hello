package MD2.Bai18.BaiTap.Bai2;

public class EvenThread implements Runnable {
    private Thread thread;
    private final String name;
    public EvenThread(String name) {
        this.name = name;
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this, name);
        }
        thread.start();
    }

    public void join() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(this.thread.getName() + " interrupted");
        }
    }

    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println(this.thread.getName() + " printing even number: " + i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            System.out.println(this.thread.getName() + " interrupted");
        }
        System.out.println(this.thread.getName() + " run is over");
    }
}

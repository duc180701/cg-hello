package MD2.Bai18.BaiTap.Bai1;

public class NumberGenerator implements Runnable {
    private Thread thread;

    public NumberGenerator(String name, int priority) {
        thread = new Thread(this, name);
        thread.setPriority(priority);
        System.out.println("Thread " + thread.getName() + " created with priority = " + priority);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(this.thread.getName() +
                        " printing the count " + i + ", hashCode: " + this.thread.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(this.thread.getName() + " interrupted");
        }
        System.out.println(this.thread.getName() + " run is over");
    }
}

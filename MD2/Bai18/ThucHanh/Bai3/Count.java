package MD2.Bai18.ThucHanh.Bai3;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("Thread " + myThread.getName() + " created!");
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(getMyThread().getName() + " interrupted");
        }
        System.out.println(getMyThread().getName() + " run is over");
    }
}

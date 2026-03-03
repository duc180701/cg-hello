package MD2.Bai18.ThucHanh.Bai3;

public class Count implements Runnable {
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "my runnable thread");
        System.out.println("Thread " + myThread.getName() + "created!");
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }
}

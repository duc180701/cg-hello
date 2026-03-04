package MD2.Bai18.BaiTap.Bai3;

import MD2.Bai11.ThucHanh.Bai3.MyQueue;

public class OptimizedPrimeFactorization implements Runnable {
    private Thread thread;
    private final String name;
    private final int number;
    public OptimizedPrimeFactorization(String name, int number) {
        this.name = name;
        this.number = number;
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
        for (int i = 0; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(this.name + ", prime number: " + i);
            }
        }
        System.out.println(this.thread.getName() + " run is over");
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package MD2.Bai18.ThucHanh.Bai2;

public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        Car car1 = new Car("Ferrari");
        Car car2 = new Car("Lexus");
        Car car3 = new Car("Kia");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);

        System.out.println("DISTANCE: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

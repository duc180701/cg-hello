package MD2.Bai5.ThucHanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactiv 3");
        System.out.println("Number of cars: " + Car.numberOfCars);
        Car car2 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println("Number of cars: " + Car.numberOfCars);
    }
}

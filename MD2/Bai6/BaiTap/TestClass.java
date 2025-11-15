package MD2.Bai6.BaiTap;

public class TestClass {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "blue");
        System.out.println("Area = " + circle.getArea());
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(5.7, "black", 7.3);
        System.out.println("Volume = " + cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}

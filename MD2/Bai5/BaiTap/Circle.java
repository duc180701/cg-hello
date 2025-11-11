package MD2.Bai5.BaiTap;

public class Circle {
    private double radius = 1.0;
    public String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.round((3.14 * Math.pow(radius, 2)) * 100.00) / 100.00;
    }
}

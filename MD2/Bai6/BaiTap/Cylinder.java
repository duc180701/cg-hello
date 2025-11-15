package MD2.Bai6.BaiTap;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * super.getRadius() * super.getRadius() * height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height = " + height + " with radius = " + super.getRadius() + " and color is " + super.getColor();
    }
}

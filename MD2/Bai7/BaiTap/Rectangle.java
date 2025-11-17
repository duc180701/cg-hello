package MD2.Bai7.BaiTap;

import java.text.DecimalFormat;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }

    DecimalFormat df = new DecimalFormat("#.00");
    @Override
    public void resize (double percent) {
        String beforeChange = "Area of Rectangle before change width and length: " + df.format(this.getArea());
        this.width = this .width + this.width * (percent / 100);
        this.length = this .length + this.length * (percent / 100);
        String afterChange = "Area of Rectangle after increase " + df.format(percent) + "% width and length: " + df.format(this.getArea());
        System.out.println(beforeChange + "\n" + afterChange);
    }
}
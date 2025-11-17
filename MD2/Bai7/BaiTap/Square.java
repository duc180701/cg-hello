package MD2.Bai7.BaiTap;

import java.text.DecimalFormat;

public class Square extends Shape implements Resizeable, Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "A Rectangle with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    DecimalFormat df = new DecimalFormat("#.00");
    @Override
    public void resize (double percent) {
        String beforeChange = "Area of Square before change side: " + df.format(this.getArea());
        this.side = this .side + this.side * (percent / 100);
        String afterChange = "Area of Square after increase " + df.format(percent) + "% side: " + df.format(this.getArea());
        System.out.println(beforeChange + "\n" + afterChange);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

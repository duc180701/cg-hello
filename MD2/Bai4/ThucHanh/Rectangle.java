package MD2.Bai4.ThucHanh;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public void display() {
        System.out.println("Display rectangle with length = " + this.length + " and width = " + this.width);
        System.out.println("-----------------------------------");
        for (int j = 0; j < this.width; j++) {
            for (int i = 0; i < this.length; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

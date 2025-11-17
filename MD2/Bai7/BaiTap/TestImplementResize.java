package MD2.Bai7.BaiTap;

public class TestImplementResize {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.5, "blue", true);
        shapes[1] = new Rectangle(5.6, 6.7, "black", false);
        shapes[2] = new Square("green", true, 3.6);

        for (Shape shape : shapes) {
            Resizeable resizeable;
            System.out.println("-------------");
            if (shape instanceof Circle) {
                resizeable = (Circle) shape;
            } else if (shape instanceof Rectangle) {
                resizeable = (Rectangle) shape;
            } else {
                resizeable = (Square) shape;
            }
            resizeable.resize(Math.random() * 100 + 1);

            if (shape instanceof Colorable colorable) {
                System.out.println("----------");
                colorable.howToColor();
            }
        }
    }
}

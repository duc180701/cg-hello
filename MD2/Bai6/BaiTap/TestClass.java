package MD2.Bai6.BaiTap;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("-----------------");
        Circle circle = new Circle(2.5, "blue");
        System.out.println("Area = " + circle.getArea());
        System.out.println(circle.toString());

        System.out.println("-----------------");
        Cylinder cylinder = new Cylinder(5.7, "black", 7.3);
        System.out.println("Volume = " + cylinder.getVolume());
        System.out.println(cylinder.toString());

        System.out.println("-----------------");
        Point2D point2D = new Point2D(1, 2);
        System.out.println(point2D.toString());
        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println(point3D.toString());

        System.out.println("-----------------");
        Point point = new Point(2, 3);
        System.out.println(point.toString());
        point.setXY(5, 6);
        System.out.println(point.getXY()[0] + " " + point.getXY()[1]);
        System.out.println(point.toString());
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}

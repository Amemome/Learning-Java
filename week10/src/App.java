public class App {
    public static void main(String[] args) throws Exception {
        //Shape s = new Shape(); // Cannot instantiate the type Shape - abstract class
        Shape s = new Rectangle(ShapeColor.RED, new ShapeRect(0, 0, 10, 20));
        s.print();
        s = new Triangle(ShapeColor.GREEN, new ShapeRect(10, 10, 10, 20));
        s.print();
        s = new Square(ShapeColor.BLUE, new ShapeRect(20, 20, 10, 20));
        s.print();
        s = new Circle(ShapeColor.BLUE, new ShapeRect(30, 30, 10, 20));
        s.print();

        Shape[] shapes = {
            new Rectangle(ShapeColor.RED, new ShapeRect(0, 0, 10, 20)),
            new Triangle(ShapeColor.GREEN, new ShapeRect(10, 10, 10, 20)),
            new Square(ShapeColor.BLUE, new ShapeRect(20, 20, 10, 20)),
            new Circle(ShapeColor.BLUE, new ShapeRect(30, 30, 10, 20))
        };
        System.out.println("\n\n\n");
        for (Shape shape : shapes) {
            shape.print();
            System.out.printf("area=%.3f perimeter=%.3f\n", shape.area(), shape.perimeter());
        }

        System.out.println("\n\n\n");
        for (Shape shape : shapes) {
            shape.move(10, 10);
            shape.scale(3, 4);
            shape.print();
            System.out.printf("area=%.3f perimeter=%.3f\n", shape.area(), shape.perimeter());
        }
    }
}

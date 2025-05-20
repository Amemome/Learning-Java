public class Circle extends Square {
    public Circle(ShapeColor color, ShapeRect bound) {
        super(color, bound); // Square
        type = ShapeType.CIRCLE;
    }

    @Override
    public double area() {
        boundRecalculation();
        double radius = bound.getWidth() / 2.0;
        return Math.PI * radius * radius; // pi r^2
    }

    @Override
    public double perimeter() {
        boundRecalculation();
        double radius = bound.getWidth() / 2.0;
        return 2 * Math.PI * radius; // 2 pi r
    }
}

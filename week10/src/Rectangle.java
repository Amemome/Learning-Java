public class Rectangle extends Shape {
    public Rectangle(ShapeColor color, ShapeRect bound) {
        super(ShapeType.RECTANGLE, color, bound);
    }

    @Override
    public double area() {
        return bound.getWidth() * bound.getHeight();
    }

    @Override
    public double perimeter() {
        return 2 * (bound.getWidth() + bound.getHeight());
    }
}

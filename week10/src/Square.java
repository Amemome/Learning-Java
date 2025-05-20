public class Square extends Shape {
    public Square(ShapeColor color, ShapeRect bound) {
        super(ShapeType.SQUARE, color, bound);
        // bound recaculation
        boundRecalculation();
    }

    protected void boundRecalculation() {
        if (bound.getWidth() > bound.getHeight()) {
            bound.setWidth(bound.getHeight());
            System.out.printf("Width is changed to %d\n", bound.getWidth());
        } else {
            bound.setHeight(bound.getWidth());
            System.out.printf("Height is changed to %d\n", bound.getHeight());
        }
    }
    @Override
    public double area() {
        boundRecalculation();
        return bound.getWidth() * bound.getWidth();
    }

    @Override
    public double perimeter() {
        boundRecalculation();
        return 4 * bound.getWidth();
    }
}

public class Rectangle extends Square {
    protected double height = 1.0;

    public Rectangle(double bottom, double height) {
        super(bottom);
        this.type = FigureType.RECTANGLE;
    }

    @Override
    public double getArea() {
        return bottom * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (bottom + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height + "\n"
                + super.toString();
    }
}

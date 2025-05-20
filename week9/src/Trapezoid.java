public class Trapezoid extends Parallelogram {
    protected double top;
    public Trapezoid(double top, double bottom, double height, double side) {
        super(bottom, height, side);
        this.top = top;
        this.type = FigureType.TRAPEZOID;
    }
    @Override
    public double getArea() {
        return (top + bottom) * height / 2.0;
    }
    @Override
    public double getPerimeter() {
        return top + bottom + 2 * side;
    }

    @Override
    public String toString() {
        return " top=" + top + "\n"+ super.toString();
    }


}

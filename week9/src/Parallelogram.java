public class Parallelogram extends Rectangle {
    protected double side;

    public Parallelogram(double bottom, double height, double side) {
        super(bottom, height);
        this.side = side;
        this.type = FigureType.PARALLELOGRAM;
    }
    /*
    @Override
    public double getArea() {
        return super.getArea();
    }
    */

    @Override
    public double getPerimeter() {
        return 2 * (bottom + side);
    }

    @Override
    public String toString() {
        return "side=" + side + "\n" +
                super.toString();
    }
}

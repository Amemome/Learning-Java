public class Rhombus extends AbstractFigure {
    private double horizontalDiagonal;
    private double verticalDiagonal;
    private double side;

    public Rhombus (double horizontalDiagonal, double verticalDiagonal, double side) {
        this.horizontalDiagonal = horizontalDiagonal;
        this.verticalDiagonal = verticalDiagonal;
        this.side = side;
        this.type = FigureType.RHOMBUS;
    }

    @Override
    public double getArea() {
        return horizontalDiagonal * verticalDiagonal / 2;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return
                "horizontalDiagonal=" + horizontalDiagonal + "\n" +
                ", verticalDiagonal=" + verticalDiagonal + "\n" +
                ", side=" + side + "\n" +
                super.toString() ;
    }
}

public class Square extends AbstractFigure{
    // 상속 받으면 추상메서드를 구현해야됨.
    protected double bottom = 1.0;

    public Square() {
        this(1.0);
    }
    public Square(double bottom) {
        this.bottom = bottom;
        this.type = FigureType.SQUARE;
    }


    @Override
    public double getArea() {
        return bottom * bottom;
    }

    @Override
    public double getPerimeter() {
        return bottom * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "bottom=" + bottom + "\n" +
                super.toString();
    }
}

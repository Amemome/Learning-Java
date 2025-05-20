public abstract class AbstractFigure {
    protected FigureType type; // 하위 클래스에서 사용가능하도록 protected

    public abstract double getArea(); // 추상 메서드 정의 - 함수만 정의하고 끝. 몸통 X
    public abstract double getPerimeter();

    public FigureType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "AbstractFigure{" +
                "type=" + getType() + "\n" +
                "area=" + getArea() + "\n" +
                "perimeter=" + getPerimeter() + "\n" +
                '}';
    }
}

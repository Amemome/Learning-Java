public class Triangle extends Shape {
    public Triangle(ShapeColor color, ShapeRect bound) {
        super(ShapeType.TRIANGLE, color, bound);
    }

    @Override
    public double area() {
        return bound.getWidth() * bound.getHeight() / 2.0;
    }

    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(bound.getWidth()*bound.getWidth() + bound.getHeight()*bound.getHeight()); // 직각삼각형 빗변
        return bound.getWidth() + bound.getHeight() + hypotenuse;
    }
}

import java.util.Objects;

public abstract class Shape implements IMoveable, IScalable, IArea, IPerimeter {
    protected ShapeType type;
    protected ShapeColor color;
    protected ShapeRect bound;

    public Shape() {
        this(null, null, null);
    }

    public Shape(ShapeType type, ShapeColor color, ShapeRect bound) {
        this.type = type;
        this.color = color;
        this.bound = bound;
    }

    public void print() {
        System.out.printf("Shape: %s %s %s\n", color, type, bound);
    }

    @Override
    public void scale(int sx, int sy) {
        bound.setWidth(bound.getWidth() * sx);
        bound.setHeight(bound.getHeight() * sy);
    }

    @Override
    public void move(int dx, int dy) {
        bound.setX(bound.getX() + dx);
        bound.setY(bound.getY() + dy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, bound);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Shape) {
            return this.type.equals(((Shape) o).type) && this.color.equals(((Shape) o).color) && this.bound.equals(((Shape) o).bound);
        } else {
            return false;
        }
    }

}

public class TripleValue {
    private int x;
    private int y;
    private int z;

    // constructor 는 special method
    public TripleValue(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public TripleValue(TripleValue other) {
        this.x = other.getX();
        this.y = other.getY();
        this.z = other.getZ();
    }

    public TripleValue() {
        this(0,0,0); // constructor overloading
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void set(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

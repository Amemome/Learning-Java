public class ArithmeticCalculator {
    private int x;
    private int y;
    private char op;
    private int result;

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

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public ArithmeticCalculator(int x, int y, char op) {
        this.x = x;
        this.y = y;
        this.op = op;
        this.result = calc(x, y, op);
    }

    @Override
    public String toString() {
        return "ArithmeticCalculator{" +
                "x=" + x +
                ", y=" + y +
                ", op=" + op +
                ", result=" + result +
                '}';
    }

    // util 은 static으로.
    private static int calc(int x, int y, char op) {
        return switch (op) {
            case '+' -> x + y;
            case '-' -> x - y;
            case '*' -> x * y;
            case '/' -> x / y;
            case '%' -> x % y;
            default -> 0;
        };
    }
}

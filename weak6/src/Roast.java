public class Roast {
    private int degree;

    public int getDegree() {
        return degree;
    }

    public Roast(int degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Roast{" +
                "degree=" + degree +
                '}';
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}

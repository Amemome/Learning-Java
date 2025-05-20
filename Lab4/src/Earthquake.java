public class Earthquake extends NaturalHazard {
    private int depth;
    private double magnitude;

    public Earthquake(int year, int month, int day, String location, double latitude, double longitude, int depth, double magnitude) {
        super(year, month, day, location, latitude, longitude);
        this.depth = depth;
        this.magnitude = magnitude;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "Earthquake{" +
                "depth=" + depth +
                ", magnitude=" + magnitude +
                '}';
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }
}

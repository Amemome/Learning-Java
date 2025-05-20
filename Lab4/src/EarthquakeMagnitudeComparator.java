import java.util.Comparator;

public class  EarthquakeMagnitudeComparator implements Comparator<Earthquake> {
    @Override
    public int compare(Earthquake a, Earthquake b) {
        return Double.compare(a.getMagnitude(), b.getMagnitude());
    }
}

import java.util.Comparator;

public class EarthquakeDepthComparator implements Comparator<Earthquake> {
    @Override
    public int compare(Earthquake a, Earthquake b) {
        return a.getDepth() - b.getDepth();
    }
}

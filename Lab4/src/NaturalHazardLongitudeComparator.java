import java.util.Comparator;

public class NaturalHazardLongitudeComparator implements Comparator<NaturalHazard> {
    @Override
    public int compare(NaturalHazard a, NaturalHazard b) {
        return Double.compare(a.getLongitude(), b.getLongitude());
    }
}

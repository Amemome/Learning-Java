import java.util.Comparator;

public class NaturalHazardLatitudeComparator implements Comparator<NaturalHazard> {
    @Override
    public int compare(NaturalHazard a, NaturalHazard b) {
        return Double.compare(a.getLatitude(), b.getLatitude());
    }
}

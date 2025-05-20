import java.util.Comparator;

public class VolcanoElevationComparator implements Comparator<Volcano> {
    @Override
    public int compare(Volcano a, Volcano b) {
        return a.getElevation() - b.getElevation();
    }
}

import java.util.Comparator;

public class NaturalHazardLocationComparator implements Comparator<NaturalHazard> {
    public int compare(NaturalHazard a, NaturalHazard b) {
        return a.getLocation().compareTo(b.getLocation());
    }
}

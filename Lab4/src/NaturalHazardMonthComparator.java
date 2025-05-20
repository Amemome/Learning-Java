import java.util.Comparator;

public class NaturalHazardMonthComparator implements Comparator<NaturalHazard> {
    @Override
    public int compare(NaturalHazard a, NaturalHazard b) {
        return a.getMonth() - b.getMonth();
    }
}

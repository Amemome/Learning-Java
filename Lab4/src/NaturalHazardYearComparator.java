import java.util.Comparator;

public class NaturalHazardYearComparator implements Comparator<NaturalHazard> {
    @Override
    public int compare(NaturalHazard a, NaturalHazard b) {
        return a.getYear() - b.getYear();
    }
}
import java.util.Comparator;

public class NaturalHazardDayComparator implements Comparator<NaturalHazard> {
    @Override
    public int compare(NaturalHazard a, NaturalHazard b) {
        return a.getDay() - b.getDay();
    }
}

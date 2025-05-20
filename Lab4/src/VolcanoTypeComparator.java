import java.util.Comparator;

public class VolcanoTypeComparator implements Comparator<Volcano> {
    @Override
    public int compare(Volcano a, Volcano b) {
        return a.getType().compareTo(b.getType());
    }
}

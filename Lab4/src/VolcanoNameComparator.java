import java.util.Comparator;

public class VolcanoNameComparator implements Comparator<Volcano> {
    @Override
    public int compare(Volcano a, Volcano b) {
        return a.getName().compareTo(b.getName());
    }
}

import java.util.Comparator;

public class VolcanoCountryComparator implements Comparator<Volcano> {
    @Override
    public int compare(Volcano a, Volcano b) {
        return a.getCountry().compareTo(b.getCountry());
    }
}

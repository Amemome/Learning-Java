import java.util.Comparator;

public class VolcanoVeiComparator implements Comparator<Volcano>{
    @Override
    public int compare(Volcano a, Volcano b) {
        return a.getVei().getInteger()  - b.getVei().getInteger();
    }
}

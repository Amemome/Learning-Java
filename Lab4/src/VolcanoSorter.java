import java.util.Arrays;
import java.util.Collections;

public class VolcanoSorter {
    public static void sort(Volcano[] volcanoes, int index) {
        if(index == 0) {
            Arrays.sort(volcanoes, new NaturalHazardYearComparator());
        } else
        if(index == 10) {
            Arrays.sort(volcanoes, new VolcanoVeiComparator());
        }
    }
}

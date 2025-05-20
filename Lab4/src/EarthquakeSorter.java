import java.util.Arrays;

public class EarthquakeSorter {
    public static void sort(Earthquake[] earthquakes, int index) {
        if (index == 0) {
            Arrays.sort(earthquakes, new NaturalHazardYearComparator());
        } else
        if(index == 7) {
            Arrays.sort(earthquakes, new EarthquakeMagnitudeComparator());
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class EarthquakeDepthFinder implements IEarthquakeFinder {
    int min, max;
    public EarthquakeDepthFinder(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public Earthquake[] find(Earthquake[] earthquakes) {
        List<Earthquake> result = new ArrayList<>();
        for (var earthquake : earthquakes) {
            if(min <= earthquake.getDepth() && earthquake.getDepth() <= max) {
                result.add(earthquake);
            }
        }
        return result.toArray(new Earthquake[0]);
    }
}

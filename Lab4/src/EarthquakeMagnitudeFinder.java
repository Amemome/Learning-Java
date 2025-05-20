import java.util.ArrayList;
import java.util.List;

public class EarthquakeMagnitudeFinder implements IEarthquakeFinder {
    double min, max;
    public EarthquakeMagnitudeFinder(double min, double max) {
        this.min = min;
        this.max = max;
    }
    public Earthquake[] find(Earthquake[] earthquakes) {
        List<Earthquake> result = new ArrayList<>();
        for (var earthquake : earthquakes) {
            if(min <= earthquake.getMagnitude() && earthquake.getMagnitude() <= max) {
                result.add(earthquake);
            }
        }
        return result.toArray(new Earthquake[0]);
    }
}

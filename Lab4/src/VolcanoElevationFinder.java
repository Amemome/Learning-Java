import java.util.ArrayList;
import java.util.List;

public class VolcanoElevationFinder implements IVolcanoFinder{
    int min, max;
    public VolcanoElevationFinder(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public Volcano[] find(Volcano[] volcanoes) {
        List<Volcano> result = new ArrayList<>();
        for (var volcano : volcanoes) {
            if(min <= volcano.getElevation() && volcano.getElevation() <= max) {
                result.add(volcano);
            }
        }
        return result.toArray(new Volcano[0]);
    }
}

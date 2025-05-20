import java.util.ArrayList;
import java.util.List;

public class NaturalHazardElevationFinder implements INaturalHazardFinder {
    double minLat, maxLat, minLon, maxLon;

    public NaturalHazardElevationFinder() {
        this.minLat = minLat;
        this.maxLat = maxLat;
        this.minLon = minLon;
        this.maxLon = maxLon;
    }

    @Override
    public NaturalHazard[] find(NaturalHazard[] hazards) {
        List<NaturalHazard> result = new ArrayList<>();
        for(var hazard : hazards) {
            if(minLat <= hazard.getLatitude() && hazard.getLatitude() <= maxLat &&
            minLon <= hazard.getLongitude() && hazard.getLongitude() <= maxLon) {
                result.add(hazard);
            }
        }
        return result.toArray(new NaturalHazard[0]);
    }
}

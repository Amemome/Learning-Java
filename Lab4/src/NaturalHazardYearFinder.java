import java.util.ArrayList;
import java.util.List;

public class NaturalHazardYearFinder implements INaturalHazardFinder {
    int min, max;

    public NaturalHazardYearFinder(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public NaturalHazard[] find(NaturalHazard[] hazards) {
        List<NaturalHazard> result = new ArrayList<>();
        for (var hazard : hazards) {
            if(hazard.getYear() >= min && hazard.getYear() <= max) {
                result.add(hazard);
            }
        }
        return result.toArray(new NaturalHazard[0]);
    }
}

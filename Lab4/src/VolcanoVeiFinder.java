import java.util.ArrayList;
import java.util.List;

public class VolcanoVeiFinder implements IVolcanoFinder {
    VolcanicExplosiveIndex vei;
    public VolcanoVeiFinder(VolcanicExplosiveIndex vei) {
        this.vei = vei;
    }
    public Volcano[] find(Volcano[] volcanoes) {
        List<Volcano> result = new ArrayList<>();
        for (var volcano : volcanoes) {
            if(volcano.getVei() == vei) {
                result.add(volcano);
            }
        }
        return result.toArray(new Volcano[0]);
    }
}

import java.util.ArrayList;
import java.util.List;

public class VolcanoTypeFinder implements  IVolcanoFinder {
    String type;
    public VolcanoTypeFinder(String type){
        this.type = type;
    }
    public Volcano[] find(Volcano[] volcanoes) {
        List<Volcano> result = new ArrayList<>();
        for (var volcano : volcanoes) {
            if(volcano.getType().equals(type)) {
                result.add(volcano);
            }
        }
        return result.toArray(new Volcano[0]);
    }
}

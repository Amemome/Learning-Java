import java.util.ArrayList;
import java.util.List;

public class VolcanoCountryFinder implements IVolcanoFinder{
    String country;
    public VolcanoCountryFinder(String country){
        this.country = country;
    }

    public Volcano[] find(Volcano[] volcanoes) {
        List<Volcano> result = new ArrayList<>();
        for (var volcano : volcanoes) {
            if(volcano.getCountry().equals(country)) {
                result.add(volcano);
            }
        }
        return result.toArray(new Volcano[0]);
    }
}

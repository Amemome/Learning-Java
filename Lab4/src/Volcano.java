public class Volcano extends NaturalHazard {
    private String name, country;
    private int elevation;
    private String type;
    private VolcanicExplosiveIndex vei;

    public Volcano(int year, int month, int day, String name, String location, String country, double latitude, double longitude, int elevation, String type, VolcanicExplosiveIndex vei) {
        super(year, month, day, location, latitude, longitude);
        this.name = name;
        this.country = country;
        this.elevation = elevation;
        this.type = type;
        this.vei = vei;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Volcano{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", elevation=" + elevation +
                ", type='" + type + '\'' +
                ", vei=" + vei +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public VolcanicExplosiveIndex getVei() {
        return vei;
    }

    public void setVei(VolcanicExplosiveIndex vei) {
        this.vei = vei;
    }
}

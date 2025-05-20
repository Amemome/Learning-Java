public class ChocolateBrand {
    private String name;
    private String country;
    public ChocolateBrand(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "ChocolateBrand{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
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
}

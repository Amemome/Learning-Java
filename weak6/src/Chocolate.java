public class Chocolate {
    private ChocolateBrand brand;
    private ChocolateType type;

    public ChocolateBrand getBrand() {
        return brand;
    }

    public void setBrand(ChocolateBrand brand) {
        this.brand = brand;
    }

    public ChocolateType getType() {
        return type;
    }

    public void setType(ChocolateType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "brand=" + brand +
                ", type=" + type +
                '}';
    }

    public Chocolate(ChocolateBrand brand, ChocolateType type) {
        this.brand = brand;
        this.type = type;
    }
}

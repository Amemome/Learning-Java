public class Origin {
    private String name;

    public Origin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Origin{" +
                "name='" + name + '\'' +
                '}';
    }
}

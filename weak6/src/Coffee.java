public class Coffee { // coffee has origin and roast
    private Origin origin;
    private Roast roast;

    public Coffee(Origin origin, Roast roast) {
        this.origin = origin;
        this.roast = roast;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Roast getRoast() {
        return roast;
    }

    public void setRoast(Roast roast) {
        this.roast = roast;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "origin=" + origin +
                ", roast=" + roast +
                '}';
    }


}

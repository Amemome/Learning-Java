import java.util.Comparator;

public abstract class NaturalHazard {
    protected int year, month, day;
    protected String location;
    protected double latitude, longitude;

        public NaturalHazard(int year, int month, int day, String location, double latitude, double longitude) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "NaturalHazard{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", location='" + location + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}



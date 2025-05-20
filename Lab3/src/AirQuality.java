/* Lab번호: 3
 * 분반번호: 1분반
 * 제출일: 2025-04-11
 * 학번: 32241484
 * 이름: 류지성
 */
import java.time.LocalDateTime;

public class AirQuality {
    private LocalDateTime measurementDateTime; // 측정일시
    private String measurementStationName; // 측정소명
    private double pm25; // 초미세먼지 PM-2.5 (μg/m3)
    private double pm10; // 미세먼지 PM-10 (μg/m3)
    private double o3; // 오존 O3 (ppm)
    private double no2; // 이산화질소 NO2 (ppm)
    private double co; // 일산화탄소 CO (ppm)
    private double so2; // 아황산가스 SO2 (ppm)
    private AirQualityLevel pm25Level; // 초미세먼지의 대기질 정도
    private AirQualityLevel pm10Level; // 미세먼지의 대기질 정도
    private AirQualityLevel o3Level; // 오존의 대기질 정도

    // AirQuality 클래스의 생성자입니다. 각 측정값과 측정 정보를 초기화합니다. 데이터에서 주어진 필드만 인자로 받아서 생성자를 만듭니다.
    public AirQuality(LocalDateTime measurementDateTime, String measurementStationName, double pm25, double pm10, double o3, double no2, double co, double so2) {
        this.measurementDateTime = measurementDateTime;
        this.measurementStationName = measurementStationName;
        this.pm25 = pm25;
        this.pm10 = pm10;
        this.o3 = o3;
        this.no2 = no2;
        this.co = co;
        this.so2 = so2;

        // enum 에 정의딘 getLevel~ 을 사용하여 초미세먼지 level을 초기화합니다.
        this.pm25Level = AirQualityLevel.getPm25Level(pm25);
        this.pm10Level = AirQualityLevel.getPm10Level(pm10);
        this.o3Level = AirQualityLevel.getO3Level(o3);
    }
    
    // 속성 이름(String)을 받아서 해당 속성의 값을 반환하는 메서드입니다.
    public double getValueByProperty(String property) {
        return switch (property) {
            case "pm25" -> this.pm25;
            case "pm10" -> this.pm10;
            case "o3" -> this.o3;
            case "no2" -> this.no2;
            case "co" -> this.co;
            case "so2" -> this.so2;
            default -> throw new IllegalStateException("Unexpected value: " + property);
        };
    }
    // 속성 이름(String)을 받아서 해당 속성의 대기질 레벨을 반환하는 메서드입니다.
    public AirQualityLevel getLevelByProperty(String property) {
        return switch (property) {
            case "pm25" -> this.pm25Level;
            case "pm10" -> this.pm10Level;
            case "o3" -> this.o3Level;
            default -> throw new IllegalStateException("Unexpected value: " + property);
        };
    }

    public LocalDateTime getMeasurementDateTime() {
        return measurementDateTime;
    }

    public void setMeasurementDateTime(LocalDateTime measurementDateTime) {
        this.measurementDateTime = measurementDateTime;
    }

    public String getMeasurementStationName() {
        return measurementStationName;
    }

    public void setMeasurementStationName(String measurementStationName) {
        this.measurementStationName = measurementStationName;
    }

    public double getSo2() {
        return so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public double getNo2() {
        return no2;
    }

    public void setNo2(double no2) {
        this.no2 = no2;
    }

    public double getPm25() {
        return pm25;
    }

    public void setPm25(double pm25) {
        this.pm25 = pm25;
    }

    public double getPm10() {
        return pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public double getO3() {
        return o3;
    }

    public void setO3(double o3) {
        this.o3 = o3;
    }

    public double getCo() {
        return co;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public AirQualityLevel getPm25Level() {
        return pm25Level;
    }

    public void setPm25Level(AirQualityLevel pm25Level) {
        this.pm25Level = pm25Level;
    }

    public AirQualityLevel getPm10Level() {
        return pm10Level;
    }

    public void setPm10Level(AirQualityLevel pm10Level) {
        this.pm10Level = pm10Level;
    }

    public AirQualityLevel getO3Level() {
        return o3Level;
    }

    public void setO3Level(AirQualityLevel o3Level) {
        this.o3Level = o3Level;
    }

    @Override
    public String toString() {
        return "AirQuality{" +
                "measurementDateTime=" + measurementDateTime +
                ", measurementStationName='" + measurementStationName + '\'' +
                ", pm25=" + pm25 +
                ", pm10=" + pm10 +
                ", o3=" + o3 +
                ", no2=" + no2 +
                ", co=" + co +
                ", so2=" + so2 +
                ", pm25Level=" + pm25Level +
                ", pm10Level=" + pm10Level +
                ", o3Level=" + o3Level +
                '}';
    }
}

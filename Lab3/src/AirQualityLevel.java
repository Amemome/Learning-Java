/* Lab번호: 3
 * 분반번호: 1분반
 * 제출일: 2025-04-11
 * 학번: 32241484
 * 이름: 류지성
 */
public enum AirQualityLevel {
    GOOD, NORMAL, BAD, VERY_BAD; // 대기질 정보를 좋음, 보통, 나쁨, 매우 나쁨으로 구분합니다.

    // Pm25 초미세먼지 값을 받아서 대기질 정도를 반환합니다.
    public static AirQualityLevel getPm25Level(double pm25) {
        if (pm25 <= 15) return GOOD;
        else if (pm25 <= 35) return NORMAL;
        else if (pm25 <= 75) return BAD;
        else return VERY_BAD;
    }

    // Pm10 미세먼지 값을 받아서 대기질 정도를 반환합니다.
    public static AirQualityLevel getPm10Level(double pm10) {
        if (pm10 <= 30) return GOOD;
        else if (pm10 <= 80) return NORMAL;
        else if (pm10 <= 150) return BAD;
        else return VERY_BAD;
    }

    // o3 오존 값을 받아서 대기질 정도를 반환합니다.
    public static AirQualityLevel getO3Level(double o3) {
        if (o3 <= 0.03) return GOOD;
        else if (o3 <= 0.09) return NORMAL;
        else if (o3 <= 0.15) return BAD;
        else return VERY_BAD;
    }
}

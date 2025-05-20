/* Lab번호: 3
 * 분반번호: 1분반
 * 제출일: 2025-04-11
 * 학번: 32241484
 * 이름: 류지성
 */
import java.util.ArrayList;
import java.util.List;

public class AirQualityFinder {
    // pm25 의 범위와 pm10 의 범위를 받아서 둘의 범위를 모두 만족하는 결과 값만 배열에 담아서 반환합니다.
    public static AirQuality[] find(AirQuality[] data, double minPm25, double maxPm25, double minPm10, double maxPm10) {
        // 결과를 저장할 ArrayList 를 생성합니다.
        List<AirQuality> resultList = new ArrayList<>();

        // 입력된 AirQuality 배열을 순회합니다.
        for(AirQuality aq : data) {
            // 현재 AirQuality 객체에서 pm25 값을 가져옵니다.
            double pm25 = aq.getPm25();
            // 현재 AirQuality 객체에서 pm10 값을 가져옵니다.
            double pm10 = aq.getPm10();

            // 값이 주어진 범위 내에 있는지 확인합니다.
            boolean isPm25InRange = minPm25 <= pm25 && pm25 <= maxPm25;
            boolean isPm10InRange = minPm10 <= pm10 && pm10 <= maxPm10;

            // pm25 랑 pm10 이 모두 주어진 범위 내에 있다면 결과 리스트에 추가합니다.
            if (isPm25InRange && isPm10InRange) {
                resultList.add(aq);
            }
        }
        // 결과 리스트를 AirQuality 배열로 변환하여 반환합니다.
        return resultList.toArray(new AirQuality[0]);
    }

    // 특정 속성(property)의 값이 주어진 범위(min ~ max) 내에 있는 AirQuality 객체들을 찾아 배열로 반환합니다.
    public static AirQuality[] findByRange(AirQuality[] data, String property, double min, double max) {
        // 결과를 저장할 ArrayList 를 생성합니다.
        List<AirQuality> resultList = new ArrayList<>();

        // 입력된 AirQuality 배열을 순회합니다.
        for(AirQuality aq : data) {
            // 주어진 속성 이름(property)을 이용하여 현재 AirQuality 객체의 값을 가져옵니다.
            double value = aq.getValueByProperty(property);

            // 가져온 값이 주어진 범위 내에 있는지 확인합니다.
            boolean isInRange = min <= value && value <= max;

            // 값이 범위 내에 있다면 결과 리스트에 추가합니다.
            if (isInRange) {
                resultList.add(aq);
            }
        }
        // 결과 리스트를 AirQuality 배열로 변환하여 반환합니다.
        return resultList.toArray(new AirQuality[0]);
    }
    // 특정 속성(property)의 값이 주어진 공기질 정도와 동일한 AirQuality 객체들을 찾아 배열로 반환합니다.
    public static AirQuality[] findByLevel(AirQuality[] data, String property, AirQualityLevel level) {
        // 결과를 저장할 ArrayList 를 생성합니다.
        List<AirQuality> resultList = new ArrayList<>();

        // 입력된 AirQuality 배열을 순회합니다.
        for(AirQuality aq : data) {
            // 주어진 속성 이름(property)을 이용하여 현재 AirQuality 객체의 AirQualityLevel 을 가져옵니다.
            AirQualityLevel value = aq.getLevelByProperty(property);

            // 가져온 AirQualityLevel 이 주어진 level 과 동일한지 확인합니다.
            if (value == level) {
                resultList.add(aq);
            }
        }
        
        // 결과 리스트를 AirQuality 배열로 변환하여 반환합니다.
        return resultList.toArray(new AirQuality[0]);
    }
}

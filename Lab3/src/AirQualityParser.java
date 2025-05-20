/* Lab번호: 3
* 분반번호: 1분반
* 제출일: 2025-04-11
* 학번: 32241484
* 이름: 류지성
*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AirQualityParser {
    // 날짜 및 시간 형식을 지정하기 위한 DateTimeFormatter 를 선언하고 초기화합니다. 
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    // 2차원 String 배열 형태의 데이터를 파싱하여 AirQuality 객체 배열로 변환하는 메서드입니다.
    public static AirQuality[] parse(String[][] data) {
        // 입력된 데이터의 길이를 저장합니다.
        int len = data.length;
            // 파싱된 AirQuality 객체들을 저장할 배열을 입력 데이터 길이-1 만큼 생성합니다.
        AirQuality[] airQuality = new AirQuality[len-1];
        // 첫 번째 요소는 평균을 나타내기 때문에 파싱할 때 제외하고 해줍니다.
        for (int i = 1; i < len; i++) {
            airQuality[i] = new AirQuality(
                    // 날짜 및 시간 데이터를 LocalDateTime 객체로 파싱합니다.   
                    LocalDateTime.parse(data[i][0], formatter),
                    // 측정 지역 정보를 저장합니다.
                    data[i][1],
                    // pm25, pm10, o3, no2, co, so2 의 데이터를 순서대로 double 형으로 파싱하여 저장합니다.
                    Double.parseDouble(data[i][2]),
                    Double.parseDouble(data[i][3]),
                    Double.parseDouble(data[i][4]),
                    Double.parseDouble(data[i][5]),
                    Double.parseDouble(data[i][6]),
                    Double.parseDouble(data[i][7])
            );
        }
        // 파싱이 완료된 AirQuality 객체 배열을 반환합니다.
        return airQuality;
    }
}


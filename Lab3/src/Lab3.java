/* Lab번호: 3
 * 분반번호: 1분반
 * 제출일: 2025-04-11
 * 학번: 32241484
 * 이름: 류지성
 */
public class Lab3 {
    // 클래스당 여러개 있을 필요 없으니 static 으로 2차원 String 배열 data 를 초기화해줍니다.
    public static String[][] data = {
            {"2025-04-10 08:00", "평균", "39", "54", "0.0176", "0.0320", "0.57", "0.0029"},
            {"2025-04-10 08:00", "강남구", "44", "59", "0.0177", "0.0356", "0.50", "0.0024"},
            {"2025-04-10 08:00", "강동구", "41", "56", "0.0116", "0.0387", "0.77", "0.0026"},
            {"2025-04-10 08:00", "강북구", "31", "40", "0.0282", "0.0204", "0.49", "0.0024"},
            {"2025-04-10 08:00", "강서구", "41", "61", "0.0095", "0.0422", "0.56", "0.0039"},
            {"2025-04-10 08:00", "관악구", "32", "42", "0.0141", "0.0407", "0.62", "0.0029"},
            {"2025-04-10 08:00", "광진구", "38", "52", "0.0165", "0.0361", "0.59", "0.0028"},
            {"2025-04-10 08:00", "구로구", "50", "57", "0.0170", "0.0299", "0.47", "0.0028"},
            {"2025-04-10 08:00", "금천구", "36", "55", "0.0102", "0.0481", "0.56", "0.0031"},
            {"2025-04-10 08:00", "노원구", "36", "51", "0.0161", "0.0333", "0.58", "0.0028"},
            {"2025-04-10 08:00", "도봉구", "34", "50", "0.0272", "0.0225", "0.61", "0.0033"},
            {"2025-04-10 08:00", "동대문구", "41", "60", "0.0207", "0.0261", "0.56", "0.0025"},
            {"2025-04-10 08:00", "동작구", "39", "54", "0.0269", "0.0296", "0.49", "0.0028"},
            {"2025-04-10 08:00", "마포구", "40", "46", "0.0219", "0.0233", "0.50", "0.0029"},
            {"2025-04-10 08:00", "서대문구", "42", "52", "0.0162", "0.0255", "0.74", "0.0041"},
            {"2025-04-10 08:00", "서초구", "47", "68", "0.0143", "0.0363", "0.50", "0.0025"},
            {"2025-04-10 08:00", "성동구", "42", "56", "0.0143", "0.0354", "0.52", "0.0025"},
            {"2025-04-10 08:00", "성북구", "33", "49", "0.0239", "0.0235", "0.66", "0.0031"},
            {"2025-04-10 08:00", "송파구", "32", "49", "0.0139", "0.0413", "0.51", "0.0038"},
            {"2025-04-10 08:00", "양천구", "43", "62", "0.0100", "0.0422", "0.60", "0.0032"},
            {"2025-04-10 08:00", "영등포구", "42", "51", "0.0149", "0.0342", "0.55", "0.0026"},
            {"2025-04-10 08:00", "용산구", "41", "56", "0.0155", "0.0323", "0.56", "0.0034"},
            {"2025-04-10 08:00", "은평구", "38", "53", "0.0108", "0.0272", "0.68", "0.0028"},
            {"2025-04-10 08:00", "종로구", "43", "59", "0.0246", "0.0243", "0.56", "0.0029"},
            {"2025-04-10 08:00", "중구", "43", "53", "0.0280", "0.0225", "0.56", "0.0024"},
            {"2025-04-10 08:00", "중랑구", "34", "53", "0.0158", "0.0281", "0.53", "0.0025"}};

    public static void main(String[] args) {

        // AirQuality 인스턴스 배열을 선언하고, AirQualityParser클래스의 parse 메서드를 사용하여 data 를 파싱하여 넣어줍니다.
        AirQuality[] airQualityData = AirQualityParser.parse(data) ;

        // 제대로 파싱 되었는지 각 요소들을 출력해봅니다. 오버라이딩 된 toString 메서드가 호출되어 실행됩니다.
        for(var ac : airQualityData) {
            System.out.println(ac);
        }
        System.out.print("\n");


        // 필터링 된 데이터를 담을 배열을 선언합니다.
        AirQuality[] filteredData;

        // pm25는 30~40 사이, pm10은 40~50 사이의 값을 충족시키는 결과만 반환합니다.
        System.out.println("Pm25, Pm10 필터가 적용된 결과.");
        filteredData = AirQualityFinder.find(airQualityData, 30 , 40, 40, 50);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // Pm25 특정 범위에 해당하는 값을 찾아 출력합니다.
        System.out.println("Pm25의 범위에 해당하는 값 찾기");
        filteredData = AirQualityFinder.findByRange(airQualityData, "pm25", 20, 30);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // Pm10 특정 범위에 해당하는 값을 찾아 출력합니다.
        System.out.println("Pm10의 범위에 해당하는 값 찾기");
        filteredData = AirQualityFinder.findByRange(airQualityData, "pm10", 45, 50);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // 오존(o3) 특정 범위에 해당하는 값을 찾아 출력합니다.
        System.out.println("오존의 범위에 해당하는 값 찾기");
        filteredData = AirQualityFinder.findByRange(airQualityData, "o3", 0.02, 0.03);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // 이산화 질소(no2) 특정 범위에 해당하는 값을 찾아 출력합니다.
        System.out.println("이산화 질소의 범위에 해당하는 값 찾기");
        filteredData = AirQualityFinder.findByRange(airQualityData, "no2", 0.02, 0.025);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // 일산화 탄소(co) 특정 범위에 해당하는 값을 찾아 출력합니다.   
        System.out.println("일산화 탄소의 범위에 해당하는 값 찾기");
        filteredData = AirQualityFinder.findByRange(airQualityData, "co", 0.5, 0.55);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // 아황산 가스(so2) 특정 범위에 해당하는 값을 찾아 출력합니다.
        System.out.println("아황산 가스의 범위에 해당하는 값 찾기");
        filteredData = AirQualityFinder.findByRange(airQualityData, "so2", 0.002, 0.0025);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // 초미세먼지가 특정 수준에 해당하는 값을 찾아 출력합니다.   
        System.out.println("초미세먼지가 나쁨 인 값 찾기");
        filteredData = AirQualityFinder.findByLevel(airQualityData, "pm25", AirQualityLevel.BAD);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // 미세먼지가 특정 수준에 해당하는 값을 찾아 출력합니다.   
        System.out.println("미세먼지가 보통 인 값 찾기");
        filteredData = AirQualityFinder.findByLevel(airQualityData, "pm10", AirQualityLevel.NORMAL);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
        // 오조이 특정 수준에 해당하는 값을 찾아 출력합니다.   
        System.out.println("오존이 좋음 인 값 찾기");
        filteredData = AirQualityFinder.findByLevel(airQualityData, "o3", AirQualityLevel.GOOD);
        for(var ac : filteredData) {
            System.out.println(ac);
        }
        System.out.print("\n");
    }
}
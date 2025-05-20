/* Lab번호: 1
 * 분반번호: 1분반
 * 제출일: 2025-03-24
 * 학번: 32241484
 * 이름: 류지성
 */
public enum Color {
    // Color enum 에 상수를 정의.
    RED(255, 0, 0, "RED"),
    GREEN(0, 255, 0, "GREEN"),
    BLUE(0, 0, 255, "BLUE"),
    YELLOW(255, 255, 0, "YELLOW"),
    WHITE(255, 255, 255, "WHITE"),
    BLACK(0, 0, 0, "BLACK");
    
    // r g b 값을 저장할 정수
    public int r,g,b;

    // final 키워드로 상수 만들기
    public final String name;

    // enum 의 생성자. 상수를 초기화해주기 위함.
    Color(int r, int g, int b, String name) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.name = name;
    }
}
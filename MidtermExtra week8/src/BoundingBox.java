/* Lab번호: MidtermExtra
 * 분반번호: 1분반
 * 제출일: 2025-04-24
 * 학번: 32241484
 * 이름: 류지성
 */
// 모든 점을 포함하는 가장 작은 직사각형을 반환한다.
public class BoundingBox {
    // 왼쪽 하단 점이랑 오른쪽 상단 점을 min, max 로 갖는다.
    private Point min;
    private Point max;

    // Point 두 개를 인자로 받는 생성자이다.
    public BoundingBox(Point min, Point max) {
        this.min = min;
        this.max = max;
    }

    public Point getMin() {
        return min;
    }

    public void setMin(Point min) {
        this.min = min;
    }

    public Point getMax() {
        return max;
    }

    public void setMax(Point max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "{ min=" + min + ", max=" + max + " }";
    }
}

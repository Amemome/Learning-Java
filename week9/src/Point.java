/* Lab번호: MidtermExtra
 * 분반번호: 1분반
 * 제출일: 2025-04-24
 * 학번: 32241484
 * 이름: 류지성
 */
// 정수형 x,y 을 멤버로 가지며 좌표를 표현하는 클래스. 2차원 좌표평면의 점을 표현한다.
public class Point {
    private int x; // instance member field
    private int y; // instance member field

    // full argument constructor
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    // 기본 생성자. 생성자 오버로딩.
    public Point() {
        this(0, 0);
    }

    // static method - Euclidean distance
    public static double getDistance(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    // static method - 삼각형 내각 구하기 공식
    public static double getAngle(Point a, Point b, Point c) {
        double dot = ((b.x - a.x) * (c.x - b.x)) + ((b.y - a.y) * (c.y - b.y));
        double magAB = getDistance(a, b);
        double magBC = getDistance(b, c);
        return Math.toDegrees(Math.acos(dot / (magAB * magBC)));
    }

    // 평행인지 아닌지 확인.
    public static boolean areParallel(Point a, Point b, Point c, Point d) {
        double slopeAB = (b.y - a.y) / (double) (b.x - a.x); // AB의 기울기
        double slopeCD = (d.y - c.y) / (double) (d.x - c.x); // CD의 기울기
        // 기울기가 무한인 경우에 대해서 확인. 무한-무한은 정의되지 않기 때문에.
        if(Double.isInfinite(slopeAB) && Double.isInfinite(slopeCD)) {
            return true;
        }
        return Math.abs(slopeAB - slopeCD) < 1e-6; // slopeAB == slopeCD 오차감안해서 확인.
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

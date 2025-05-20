/* Lab번호: MidtermExtra
 * 분반번호: 1분반
 * 제출일: 2025-04-24
 * 학번: 32241484
 * 이름: 류지성
 */
import java.util.Arrays;
// 점 4개에 대한 도형과 정보를 관리하는 클래스.
public class Figure {
    // 점 4개, 변 4개, 각 4개를 멤버로 가진다.
    private Point[] points;
    private double[] sides;
    private double[] angles;

    // Point[4] 를 받아서 기본 정보를 초기화하는 생성자이다.
    public Figure(Point[] points) {
        // 인자로 받은 배열은 레퍼런스이기 때문에 진짜 복사를 해준다.
        this.points = Arrays.copyOf(points, points.length);
        sides = new double[4];
        angles = new double[4];
        // 4번 반복하면서, static 함수를 사용하여 변화 각을 초기화한다.
        for (int i = 0; i < 4; i++) {
            sides[i] = Point.getDistance(points[i], points[(i+1)%4]);
            angles[i] = Point.getAngle(points[(i+3)%4], points[i], points[(i+1)%4]);
        }
    }
    // (5) 전부 같은 길이의 변인지 확인한다.
    public boolean allEqualSides() {
        return sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3] && sides[3] == sides[0];
    }

    // 전부 반대편의 변의 길이가 같은지 확인한다.
    public boolean oppositeEqualSides() {
        return sides[0] == sides[2] && sides[1] == sides[3];
    }

    // (6) 각이 전부 직각인지 확인한다.
    public boolean allRightAngles() {
        return Math.abs(angles[0] - 90) < 1e-6 &&
                Math.abs(angles[1] - 90) < 1e-6 &&
                Math.abs(angles[2] - 90) < 1e-6 &&
                Math.abs(angles[3] - 90) < 1e-6;
    } // 각은 double 형이기 때문에 angle == 90 를 쓰면 안된다.

    // 반대편이 같은 각인지 학인한다.
    public boolean oppositeEqualAngles() {
        return Math.abs(angles[0] - angles[2]) < 1e-6 &&
                Math.abs(angles[1] - angles[3]) < 1e-6;
    }

    // 평행인 변이 두 쌍인지 확인
    public boolean bothPairsParallel() { // 두 쌍 모두 만족해야 true.
        return Point.areParallel(points[0], points[1], points[2], points[3]) &&
                Point.areParallel(points[1], points[2], points[3], points[0]);
    }

    // 평행인 변이 한 쌍 이상 인지 확인
    public boolean onePairsParallel() { // 한 쌍만이라도 만족하면 true.
        return Point.areParallel(points[0], points[1], points[2], points[3]) ||
                Point.areParallel(points[1], points[2], points[3], points[0]);
    }

    // 도형의 정보를 토대로 FigureType 을 반환하는 함수.
    public FigureType getFigureType() {
        // 모든 변의 길이가 같고, 모든 각이 직각이면
        if (allEqualSides() && allRightAngles()) {
            return FigureType.SQUARE;

        // 마주보는 변의 길이가 같고, 모든 각이 직각이면
        } else if (allRightAngles() && oppositeEqualSides()) {
            return FigureType.RECTANGLE;

        // 모든 변의 길이가 같고, 마주보는 각이 같으면
        } else if (allEqualSides() && oppositeEqualAngles()) {
            return FigureType.RHOMBUS;

        // 마주보는 변의 길이가 같고, 마주보는 각이 같고, 모든 변들이 평행이면
        } else if (oppositeEqualSides() && oppositeEqualAngles() && bothPairsParallel()) {
            return FigureType.PARALLELOGRAM;

        // 한 쌍만 평행이면
        } else if (onePairsParallel()) {
            return FigureType.TRAPEZOID;
        } else {
            return null;
        }
    }

    // 모든 점을 포함하는 제일 작은 직사각형을 BoundingBox 클래스로 반환.
    public BoundingBox getBoundingBox() {
        // 가장 작은 x, y 좌표, 가장 큰 x, y 좌표를 정의한다. 비교를 위하여 최솟값은 MAX_VALUE 로 초기화, 최댓값은 MIN_VALUE 로 초기화.
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        // foreach 문으로 points 순회.
        for (Point p : points) {
            // 최솟값 최댓값 갱신.
            minX = Math.min(minX, p.getX());
            minY = Math.min(minY, p.getY());
            maxX = Math.max(maxX, p.getX());
            maxY = Math.max(maxY, p.getY());
        }
        // 최소, 최대 점 모아서 Point 객체 만들고, BoundingBox 생성자에 넣어서 반환.
        return new BoundingBox(new Point(minX, minY), new Point(maxX, maxY));
    }

    // 둘레를 반환하는 함수.
    public double getPerimeter() {
        double perimeter = 0;
        // for 문으로 순회하면서 모든 변의 길이를 더함.
        for (int i = 0; i < 4; i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }

    public double getArea() {
        // 어느 도형에 속하는지 switch 문에 넣음.
        switch(this.getFigureType()) {
            // 정사각형이면, 변*변
            case SQUARE: return sides[0]*sides[0];
            // 직사각형이면 길이 다른 변 각각 곱하면 됨.
            case RECTANGLE: return sides[0]*sides[1];
            // 마름모면, 대각선 * 다른 대각선 / 2
            case RHOMBUS: return 0.5*(Point.getDistance(points[0], points[2]) * Point.getDistance(points[1], points[3]));
            // 평행사변형이면, 밑변 * 높이
            case PARALLELOGRAM: return (Point.getDistance(points[0],points[1])*Math.abs(points[3].getY()-points[1].getY()));
            // 사다리꼴이면, (밑변 + 윗변) * 높이 / 2
            case TRAPEZOID: return (Point.getDistance(points[0], points[1]) + Point.getDistance(points[2], points[3])) *
                    Math.abs(points[3].getY()-points[0].getY()) / 2;
            default:
                return 0.0;
        }
    }

    public Point[] getPoints() {
        return points;
    }

    public double[] getSides() {
        return sides;
    }

    public double[] getAngles() {
        return angles;
    }

    @Override
    public String toString() {
        return "{\n" +
                " points=" + Arrays.toString(getPoints()) + "\n" +
                " sides=" + Arrays.toString(getSides()) + "\n" +
                " angles=" + Arrays.toString(getAngles()) + "\n" +
                " type=" + getFigureType() + "\n" +
                " Bounding Box=" + getBoundingBox() + "\n" +
                " Perimeter=" + getPerimeter() + "\n" +
                " Area=" + getArea() + "\n" +
                "}";
    }
}

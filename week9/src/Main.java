 /* Lab번호: MidtermExtra
 * 분반번호: 1분반
 * 제출일: 2025-04-24
 * 학번: 32241484
 * 이름: 류지성
 */
public class Main {
    public static void main(String[] args) {
        // 모든 FigureType 출력 (1) do-while
//        int iter = 0;
//        FigureType[] figures = FigureType.values();
//        do {
//            System.out.println(figures[iter]);
//            iter++;
//        } while (iter < figures.length);
//
//        // foreach
//        for (var type : FigureType.values()) {
//            System.out.println(type);
//        }
//        // (2) 인스턴스 메서드랑 스태틱 메서드
//
//        Point p1 = new Point(0, 0);
//        // static method - Point class 의 getDistance 메소드 공유해서 사용
//        System.out.println(Point.getDistance(new Point(0, 0), new Point(1, 2)));
//        // instance method -  toString();
//        System.out.println(p1.toString());
//
//        Point p2 = new Point(0,1);
//        Point p3 = new Point(1,0);
//        Point p4 = new Point(1,1);
//
//        // (3) 생성자 오버로딩 -
//        Point pp = new Point(1,2); // constructor using all fields
//        Point pp2 = new Point(); // default constructor
//
//        // (4) Point getDistance, getAngle, areParallel 출력결과
//        System.out.println("getDistance: " + Point.getDistance(p1, p4));
//        System.out.println("getAngle: " + Point.getAngle(p1, p2, p3));
//        System.out.println("areParallel: " + Point.areParallel(p1, p2, p3, p4));
//
//        Point[][] figurePoints = {
//            {new Point(0, 0), new Point(2, 0), new Point(2, 2), new Point(0, 2)},
//            {new Point(-2, -1), new Point(2, -1), new Point(2, 1), new Point(-2 ,1)},
//            {new Point(-1, 0), new Point(0, -2), new Point(1, 0), new Point(0, 2)},
//            {new Point(0, 0), new Point(2, 0), new Point(3, 2), new Point(1, 2)},
//            {new Point(0, 0), new Point(4, 0), new Point(3, 2), new Point(1, 2)},
//        };
//        // 위의 point 4개씩 담은 배열에 대해서 figure 객체 생성 후 도형 정보 출력.
//        for (var points : figurePoints) {
//            Figure figure = new Figure(points);
//            System.out.println(figure);
//        }
//
//        System.out.println(new Figure(figurePoints[1]));

        AbstractFigure figure = new Square();
        System.out.println(figure);
        figure = new Rectangle(2.0, 3.5);
        System.out.println(figure);
        figure = new Rhombus(2.0, 3.5, 4.0);
        System.out.println(figure);
        figure = new Parallelogram(2.0, 3.5, 4.0);
        System.out.println(figure);
        figure = new Trapezoid(2.0, 3.5, 4.0, 5.0);
        System.out.println(figure);
    }
}
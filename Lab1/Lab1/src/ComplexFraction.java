/* Lab번호: 1
 * 분반번호: 1분반
 * 제출일: 2025-03-24
 * 학번: 32241484
 * 이름: 류지성
 */
public class ComplexFraction {
    // 분자와 분모를 가집니다.
    private int numerator;
    private int denominator;

    //생성자
    public ComplexFraction(int numerator, int denominator) {
        // 0인 분수는 정의될 수 없습니다.
        if(denominator == 0) {
            throw new IllegalArgumentException("분수는 0이 될 수 없습니다.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    //나누기 메서드
    public ComplexFraction divide (ComplexFraction other) {
        int returnNumerator = this.numerator * other.denominator;
        int returnDenominator = other.numerator * this.denominator;
        return new ComplexFraction(returnNumerator, returnDenominator);
    }
    //분수를 string format으로 반환합니다.
    public String toString() {
        return numerator + " / " + denominator;
    }
    //분수의 대소비교
    public boolean greaterThan(ComplexFraction other) {
        return this.numerator * other.denominator > other.numerator * this.denominator;
    }
    //분수가 같은지 확인
    public boolean equalsTo(ComplexFraction other) {
        return this.numerator * other.denominator == other.numerator * this.denominator;
    }
    //분수를 double 로 출력
    public void print() {
        System.out.println( (double) numerator / denominator ) ;
    }
} 
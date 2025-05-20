/* Lab번호: 1
 * 분반번호: 1분반
 * 제출일: 2025-03-24
 * 학번: 32241484
 * 이름: 류지성
 */
public class FastExponentiation {
    // 지수를 분할정복으로 계산하는 함수
    public static int power(int base, int exponent, int mod) {
        // base case. 지수가 0이면 1을 반환한다.
        if (exponent == 0) return 1;

        // 분할정복. 지수를 반으로 나눈 값을 구하기 위해 재귀호출 한다.
        int half = power(base, exponent / 2, mod);
        
        // 만약 지수가 홀수면 추가적으로 곱해준다.
        if (exponent % 2 == 0) {
            return half * half % mod;
        } else {
            return half * half * base % mod;
        }
    }
}

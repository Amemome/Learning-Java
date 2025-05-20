/* Lab번호: 1
 * 분반번호: 1분반
 * 제출일: 2025-03-24
 * 학번: 32241484
 * 이름: 류지성
 */
public class IsMultipleOfThree {
    // task2 를 수행하는 함수.
    public static void task2 (int n) {
        //3의 배수인지 검사
        if(n % 3 == 0) {
            System.out.printf("The number %d is a multiple of 3\n", n);
        } else {
            System.out.printf("The number %d is NOT a multiple of 3\n", n);
        }
    }
}

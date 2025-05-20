/* Lab번호: 1
 * 분반번호: 1분반
 * 제출일: 2025-03-24
 * 학번: 32241484
 * 이름: 류지성
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1 실행

        // 복합 분수 클래스의 인스턴스를 생성
        ComplexFraction A = new ComplexFraction(3,7);
        ComplexFraction B = new ComplexFraction(2, 15);

        // 메서드를 사용하여 나눗셈 계산
        ComplexFraction C = A.divide(B);

        // print 메서드로 출력
        C.print();

        // toString 메서드를 정의하여 분수를 문자열 형태로 계산
        System.out.println(C.toString());

        //Task 2 실행

        // 1 ~ 100 까지의 랜덤 정수 생성.
        int randomValue = getRandom().nextInt(100) + 1;

        // 3의 배수인지 확인한다. 외부 클래스의 task2 메서드를 사용한다.
        IsMultipleOfThree.task2(randomValue);

        //Task 3 실행

        // 랜덤 값을 뽑는다.
        int base = getRandom().nextInt(10) + 1;
        int exp = getRandom().nextInt(6) + 1;
        int mod = 1000000007;
        System.out.printf("base: %d exp: %d, mod: %d, result: %d\n",base,exp,mod,FastExponentiation.power(base, exp, mod));

        //Task 4 실행
        
        // 입력을 받기 위한 Scanner 인스턴스를 생성한다.
        Scanner sc = new Scanner(System.in);
        
        int num;

        // do while 문으로 2 ~ 20 의 값이 들어올 때 까지 반복한다.
        do {
            System.out.println("Enter an Integer between 2 and 20 (inclusive)");
            num = sc.nextInt();
        } while (!(2 <= num && num <= 20));

        // 반복문으로 곱셈 표를 출력한다.
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

        //Task 5 실행

        // 위의 nextInt 는 정수만 읽고 개행은 읽지 않기 때문에 개행을 제거해줘야 한다.
        sc.nextLine();

        // 사용자로부터 색을 입력받는다.
        System.out.println("Enter a color name (e.g., RED): ");
        String userColor = sc.nextLine();

        // Color enum 상수 배열을 정의한다.
        Color[] colors = Color.values();
        Color randomColor = colors[getRandom().nextInt(colors.length)];

        // 같은지 검사한다.
        if (userColor.equals(randomColor.name)) {
            System.out.println("The user selected const color and the random enum color is the same.");
        } else {
            System.out.println("The user selected const color and the random enum color is different.");
        }

        //Your code

        // 사용자로부터 정수를 입력받는다.
        System.out.println("Enter a Integer: ");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.printf("%d is a prime!", number);
        } else {
            System.out.printf("%d is not a prime!", number);
        }

    }

    // 소수판정 메서드
    public static boolean isPrime (int n) {
        if (n < 2) return false;
        for(int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static Random getRandom() {
        //랜덤 객체 생성
        Random random = new Random();

        //시드값을 현재시간으로 설정
        random.setSeed(System.currentTimeMillis());

        return random;
    }
}

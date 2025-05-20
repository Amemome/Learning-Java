import java.util.Random;
import java.util.Scanner;

public class Java25Week4 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

	public static int gcd(int x, int y) {
		if (y == 0) {
			return x;
		}
	    else {
        	return gcd(y, (x % y));
		}
	}

	private static int getRandomIntBetween(int min, int max) {
		return rand.nextInt((max-min)+1)+min;
	}


	public static int rollDice() {
		return getRandomIntBetween(1,6);
	}

	private static void printCalc(int x, int y, char op) {
		switch (op) {
			case '+' -> System.out.printf("%d + %d = %d\n", x, y, x+y);
			case '-' -> System.out.printf("%d - %d = %d\n", x, y, x-y);
			case '*' -> System.out.printf("%d * %d = %d\n", x, y, x*y);
			case '/' -> System.out.printf("%d / %d = %d\n", x, y, x/y);
			case '%' -> System.out.printf("%d %% %d = %d\n", x, y, x%y);
		}
	}

//	private static void getUserInput

    public static void main(String[] args) throws Exception {
		int xx = 24;
		int yy = 36;
		while (yy != 0) {
			int r = xx % yy;
			xx = yy;
			yy = r;
		}	
		System.out.println("GCD=" + xx);
		System.out.println("GCD=" + gcd(xx, yy));

		int a = 5;
		System.out.println("a=" + a);
		System.out.println(System.identityHashCode(a));


		// (4) int,int parameter & int return
        System.out.println("2~20:" + getRandomIntBetween(2, 20));
        System.out.println("2~20:" + getRandomIntBetween(2, 20));
        System.out.println("-10~10:" + getRandomIntBetween(-10, 10));
        System.out.println("-10~10:" + getRandomIntBetween(-10, 10));
		// (4) no parameter & int return
        System.out.println("roll(1~6)=" + rollDice()); // rollDice use getRandomIntBetween
        System.out.println("roll(1~6)=" + rollDice()); // rollDice use getRandomIntBetween

		// (5) int, int, char paramater & void return
        char[] ops = { '+', '-', '*', '/', '%' };
        for (var op : ops) {
            printCalc(5, 4, op);
        }
		int[][] values = { {4,5}, {10,12}, {100,500} };
		for (var value : values) {
			for (var op : ops) {
				printCalc(value[0], value[1], op);
			}
        }
        
		// (6) String parameter & int return
		//int x = getUserInputInt("Please enter the first number: ");
		//int y = getUserInputInt("Please enter the second number: ");
		// (6) no parameter & char return
		//char op = getUserInputOp();
		// (7) int, int, char paramater & int return
		//int z = calc(x, y, op);
		//System.out.printf("%d %s %d = %d\n", x, op, y, z);

		// (8) String parameter & float return
		//float tempC = getUserInputFloat("Please enter temperature (Celsius): ");
		// (8) float paramater & float return
	    //float tempFFloat = fromCelsiusToFahrenheit(tempC);
	    //System.out.printf("C = %f => F = %f\n", tempC, tempFFloat);
		//float tempF = getUserInputFloat("Please enter temperature (Fahrenheit): " );
		// (8) float paramater & float return
		//float tempCFloat = fromFahrenheitToCelsius(tempF);
		//System.out.printf("F = %f => C = %f\n", tempF, tempCFloat);		

		// returning an array from a method vs passing an array as parameter to a method
		// (9) int paramater & int[] return
		// returning an array from a method
		//int[] arr1 = assignArray(3);
		//int[] arr2 = assignArray(5);
		//for (int e : arr1)	System.out.println(e); // 0 1 2
		//for (int e : arr2)	System.out.println(e); // 0 1 2 3 4

		// (9) int[] paramater & int return
		// passing an array as parameter to a method
		int[] array1 = {100, 200, 300};
		int[] array2 = {50, 60, 70, 80, 90};
		//int sum1 = sumArray(array1);
		//int sum2 = sumArray(array2);
		//System.out.println("array1 sum=" + sum1); // 100 + 200 + 300 = 600
		//System.out.println("array2 sum=" + sum2); // 50 + 60 + 70 + 80 + 90 = 350

    }
}

import java.util.Random;
import java.util.Scanner;

public class Java25Week3 {
    public static Scanner scan = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) throws Exception {
        // 1. if & random (if num is positive/negative/zero)
        System.out.println("if & random");
        int num = random.nextInt(201) - 100; // -100 ~ 100
        if (num > 0) {
            System.out.println("The number " + num + " is positive");
        } else
        if (num < 0) {
            System.out.println("The number " + num + " is negative");
        } else {
            System.out.println("The number " + num + " is zero");
        }
        

        // 2. for (print i = 0,1,2,3,4)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        
        // 2. while (print i = 0,1,2,3,4)
        {
        int i = 0;
        while(i < 5) {
            System.out.println(i);
            i++;
        }
        }
        
        
        // 2. do-while (print i = 0,1,2,3,4)
        {       
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i < 5);
        }
        

        // 3. break (print x = 0,1,2,3,4)
        System.out.println("break");
        int x = 0;
        while(true) {
            if(x >= 5) {
                break;
            }
            System.out.println("x="+x);
            x++;
        }
        

        // 3. continue (print y = 2,4)
        System.out.println("continue");
		int y = 0;
        while( y < 5) {
            y++;
            if (y%2 == 1) {
                continue;
            }
            System.out.println("y=" +y);
        }

        // 4. for-for (print width=1.0 height=1.0 ... width=5.0 height=10.0)
        System.out.println("for-for");
        double width = 1.0; // 1~5 (+0.5)
        double height = 1.0; // 1~10 (+0.5)
        for(double i = width; i <= 5.0; i += 0.5) {
            for(double j = height; j <= 10.0; j += 0.5) {
                System.out.printf("width: %.3f height: %.3f \n", i,j);
            }
        }


        // 4. if & for (print dice roll number & if roll==6 then re-rolling within 5 times rolling)
        System.out.println("if-for");
        for (int i = 0; i < 5; i++) {			
            int roll = random.nextInt(6) + 1;
            if(roll == 6) {
                System.out.println("re-rolling!");
                continue;
            } else {
                System.out.println("roll="+roll);
            }
        }

        // 4. switch & for (print a month has b days)
        System.out.println("switch-for");
        for (int month = 1; month <= 12; month++) {
            int days = 31;
            switch(month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
                    days = 31;
                    break;
                
                case 2: 
                    days = 28; // 윤년 안 한다.
                    break;
                
                default: {
                    days = 30;
                    break;
                }
            }
            System.out.printf("month: %d has days: %d\n",month, days);
        } 

        // 5. for-each & 1D array (int)
        System.out.println("for-each int[]");
        int[] numbers = {1,2,3,5,8,4,47};
        for(int number : numbers) System.out.println(number);
        
        // 5. for-each & 1D array (char)
        System.out.println("for-each char[]");
        char[] chars = {'h','뷁','뛣','쬟'};
        for(char ch: chars) System.out.println(ch);
        // 5. for-each & 1D array (String)
        System.out.println("for-each String[]");
        String[] tokens = {"hi", "non", "null", "except"};
        for(var token: tokens) System.out.println(token);
        
        // 5. for & 2D array (int) + - * / %
        int[][] nums = {{49,5}, {36,2}, {88,6}};
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d + %d = %d\n", nums[i][0], nums[i][1], nums[i][0] + nums[i][1]);
            System.out.printf("%d - %d = %d\n", nums[i][0], nums[i][1], nums[i][0] - nums[i][1]);
            System.out.printf("%d * %d = %d\n", nums[i][0], nums[i][1], nums[i][0] * nums[i][1]);
            System.out.printf("%d / %d = %d\n", nums[i][0], nums[i][1], nums[i][0] / nums[i][1]);
            System.out.printf("%d %% %d = %d\n", nums[i][0], nums[i][1], nums[i][0] % nums[i][1]);
        }
        // 6. user input
        System.out.print("Please enter the first number:");
        x = Integer.parseInt(scan.nextLine());
        System.out.print("Please enter the second number:");
        y = Integer.parseInt(scan.nextLine());
        System.out.printf("%d + %d = %d\n", x, y, x + y);
        System.out.printf("%d - %d = %d\n", x, y, x - y);
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        System.out.printf("%d / %d = %d\n", x, y, x / y);
        System.out.printf("%d %% %d = %d\n", x, y, x % y);
    }
}

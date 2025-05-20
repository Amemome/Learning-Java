import java.util.Scanner;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();
        while(t-- != 0) {
            int cnt = 0;
            int j, n;
            j = sc.nextInt();
            n = sc.nextInt();
            Integer[] arr = new Integer[n];
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arr[i] = x*y;
            }

            Arrays.sort(arr, Collections.reverseOrder());
            while(j > 0) {
                j -= arr[cnt++];
            }
            System.out.println(cnt);

        }


    }
}

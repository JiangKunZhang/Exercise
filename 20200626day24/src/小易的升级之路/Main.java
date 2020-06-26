package 小易的升级之路;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/26 23:01
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int tmp = sc.nextInt();
                if (tmp <= a) {
                    a += tmp;
                }else {
                    a += gcd(a,tmp);
                }
            }
            System.out.println(a);
        }
    }

    public static int gcd(int a, int b) {
        int max = a > b ? a : b;
        int min = a <= b ? a : b;
        if (min == 0) {
            return max;
        }
        return gcd(min, max % min);
    }
}

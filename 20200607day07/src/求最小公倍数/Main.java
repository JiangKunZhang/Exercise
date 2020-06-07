package 求最小公倍数;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/8 0:06
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int max = A >= B ? A : B;
        for (int i = max; i <= A * B; i++) {
            if (i % A == 0 && i % B == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}

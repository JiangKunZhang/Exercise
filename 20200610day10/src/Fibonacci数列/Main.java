package Fibonacci数列;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/10 21:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        int f2 = 1;
        int res = 0;
        for (int i = 2; i < 32; i++) {
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
            if (n <= f2) {
                res = Math.min(f2 - n, n - f0);
                break;
            }
        }
        System.out.println(res);
    }
}

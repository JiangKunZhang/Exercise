package 数字之和;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/29 22:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int nn = (int) Math.pow(n,2);
            int sumN = 0;
            int sumNN = 0;
            while (n > 0) {
                sumN += n % 10;
                n = n / 10;
            }
            while (nn > 0) {
                sumNN += nn % 10;
                nn = nn / 10;
            }
            System.out.println(sumN + " " + sumNN);
        }
    }
}

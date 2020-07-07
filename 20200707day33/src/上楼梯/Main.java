package 上楼梯;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/7 23:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(func(n) % 1000000007);
        }
    }

    public static int func(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }
        return (func(n-1) % 1000000007 + func(n - 2) % 1000000007 + func(n - 3) % 1000000007) % 1000000007;
    }
}

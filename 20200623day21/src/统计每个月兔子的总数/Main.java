package 统计每个月兔子的总数;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/23 21:13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = func(n);
            System.out.println(count);
        }
    }

    static int func(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return func(n-1) + func(n-2);
    }
}

package two的个数;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/6 22:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += func(i);
        }
        System.out.println(res);
    }

    public static int func(int n) {
        String s = n + "";
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') {
                res++;
            }
        }
        return res;
    }
}

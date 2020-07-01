package 守形数;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/1 20:24
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            fun(len(n), n);
        }
    }

    public static void fun(int len, int n) {
        int nn = (int) Math.pow(n,2);
        int tmp = 1;
        while (len != 0) {
            len--;
            tmp *= 10;
        }
        if (nn % tmp == n) {
            System.out.println("Yes!");
        }else {
            System.out.println("No!");
        }
    }

    public static int len(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num -= num % 10;
            num = num / 10;
        }
        return len;
    }
}

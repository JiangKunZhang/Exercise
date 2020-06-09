package 末尾0的个数;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/9 22:52
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = n; i >= 5; i--) {
            int tmp = i;
            while (tmp % 5 == 0) {
                count++;
                tmp = tmp / 5;
            }
        }
        System.out.println(count);
    }
}

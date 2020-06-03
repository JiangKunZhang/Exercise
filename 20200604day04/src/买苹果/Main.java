package 买苹果;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/4 0:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = n;
        int res = 0;
        //贪心，先贪8
        if (n >= 8) {
            while (n >= 8) {
                n = n - 8;
                res++;
            }
            //一直往回退，找到能买6的那个最小的数
            while (n % 6 != 0) {
                if (n >= number) break;
                n = n + 8;
                res--;
            }
        }
        if (n >= 6) {
            while (n >= 6) {
                n = n - 6;
                res++;
            }
        }
        if (n == 0) {//恰好买够
            System.out.println(res);
        }else {//不能恰好买 n 个
            System.out.println(-1);
        }
    }
}

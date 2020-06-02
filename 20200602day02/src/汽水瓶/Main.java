package 汽水瓶;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/2 15:49
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int res = 0;
        while (scanner.hasNext()) {
            res = 0;
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            if (n == 2) {
                res = 1;
            }else {
                while ( n >= 2) {
                    if (n == 2) {
                        res++;
                        break;
                    }
                    res = res + n / 3;
                    n = n % 3 + n / 3;
                }
            }
            System.out.println(res);
        }
    }
}

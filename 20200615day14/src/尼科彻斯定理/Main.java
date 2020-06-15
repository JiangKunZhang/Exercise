package 尼科彻斯定理;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/15 22:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int start = n * (n - 1) + 1;
            for (int i = 0; i < n; i++,start += 2) {
                System.out.print(start);
                if (i != n - 1) {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}

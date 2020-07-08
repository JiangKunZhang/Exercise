package 球的半径和体积;

import java.util.Map;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/8 19:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int aa = sc.nextInt();
            int bb = sc.nextInt();
            int cc = sc.nextInt();

            double r = Math.sqrt(Math.pow(a - aa, 2) + Math.pow(b - bb, 2) + Math.pow(c - cc, 2));
            double v = 4.0 / 3.0 * Math.acos(-1) * r * r * r;

            System.out.printf("%.3f %.3f%n", r, v);
        }
    }
}

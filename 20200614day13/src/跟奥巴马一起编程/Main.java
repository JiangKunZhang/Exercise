package 跟奥巴马一起编程;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/14 21:07
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strings = s.split(" ");
        int n = Integer.valueOf(strings[0]);
        char ch = strings[1].charAt(0);
        int height = (n + 1) / 2;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == height - 1 || j == n - 1) {
                    System.out.print(ch);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}

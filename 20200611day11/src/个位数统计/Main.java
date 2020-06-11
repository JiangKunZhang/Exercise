package 个位数统计;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/11 22:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] ret = new int[10];
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            ret[ch-'0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (ret[i] != 0) {
                System.out.println(i + ":" + ret[i]);
            }
        }
    }
}

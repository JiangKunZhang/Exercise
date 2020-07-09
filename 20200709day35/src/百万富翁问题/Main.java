package 百万富翁问题;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/9 23:33
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rich = 0;
        int poor = 0;
        int temp = 1;
        for (int i = 1; i <= 30; i++) {
            rich += 10;
            poor += temp;
            //System.out.print(poor + " ");
            temp *= 2;
        }
        System.out.println(rich + " " + poor);
    }
}

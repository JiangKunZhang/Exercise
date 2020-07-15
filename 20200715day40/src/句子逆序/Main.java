package 句子逆序;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/15 22:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            for (int i = strings.length - 1; i >= 0; i--) {
                System.out.print(strings[i]);
                if (i != 0) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

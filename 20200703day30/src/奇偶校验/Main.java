package 奇偶校验;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/3 22:03
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            for (char ch : chars) {
                String s1 = Integer.toBinaryString(ch);
                String s2 = String.format("%07d",Integer.parseInt(s1));
                int count = 0;
                for (int i = 0; i < 7; i++) {
                    if (s2.charAt(i) == '1') {
                        count++;
                    }
                }
                System.out.println(count % 2 == 0 ? "1" + s2 : "0" + s2);
            }
        }
    }
}

package 最难的问题;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/23 21:28
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == ' ') {
                    stringBuilder.append(' ');
                }else {
                    char c = (char) (ch - 5);
                    if (c < 65) c = (char) (c + 26);
                    stringBuilder.append(c);
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}

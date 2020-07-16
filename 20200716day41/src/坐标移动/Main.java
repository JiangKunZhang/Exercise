package 坐标移动;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/16 23:23
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] strings = s.split(";");
            int x = 0;
            int y = 0;
            for (int i = 0; i < strings.length; i++) {
                if (strings[i] == null || strings[i].length() == 0) continue;
                if (check(strings[i])) {
                    char c = strings[i].charAt(0);
                    int num = 0;
                    String s1 = strings[i].substring(1);
                    if (s1 == null || s1.length() == 0) {
                        num = 0;
                    }else {
                        num = Integer.parseInt(s1);
                    }
                    if (c == 'W') {
                        y += num;
                    }
                    if (c == 'S') {
                        y -=num;
                    }
                    if (c == 'A') {
                        x -= num;
                    }
                    if (c == 'D') {
                        x += num;
                    }
                }
            }
            System.out.println(x + "," + y);
        }

    }

    public static boolean check(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                count++;
            }
        }
        return count <= 1;
    }
}

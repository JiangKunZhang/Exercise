package 字符串中找出连续最长的数字串;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/2 23:24
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  s = scanner.nextLine();
        int count = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count++;
                if (max < count) {
                    max = count;
                    end = i;
                }
            }else {
                count = 0;
            }
        }
        System.out.println(s.substring(end - max + 1, end + 1));
    }
}

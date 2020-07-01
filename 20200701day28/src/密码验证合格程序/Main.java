package 密码验证合格程序;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/1 20:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string = sc.nextLine();
            if (string.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            int a = 0, b = 0, c = 0, d = 0;
            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    a = 1;
                } else if (ch >= 'A' && ch <= 'Z') {
                    b = 1;
                } else if (ch >= '0' && ch <= '9') {
                    c = 1;
                } else {
                    d = 1;
                }
            }
            if (a + b + c + d < 3) {
                System.out.println("NG");
                continue;
            }
            if (judgeSubStr(string) == false) {
                System.out.println("OK");
            }else {
                System.out.println("NG");
            }
        }
    }

    public static boolean judgeSubStr(String str) {
        String subStr1 = "";
        String subStr2 = "";
        for(int i = 0; i < str.length() - 3; i++) {
            subStr1 = str.substring(i, i + 3);
            for(int j = i+3; j < str.length() - 3; j++) {
                subStr2 = str.substring(j, j + 3);
                if(subStr1.equals(subStr2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

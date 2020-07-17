package 字符串加解密;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/18 0:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(add(a));
            System.out.println(sub(b));
        }
    }

    public static String add(String a) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= '0' && ch <= '9') {
                if (ch == '9') {
                    ch = '0';
                }else {
                    ch = (char) (ch + 1);
                }
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'z') {
                    ch = 'A';
                }else {
                    ch = Character.toUpperCase((char) (ch + 1));
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'Z') {
                    ch = 'a';
                }else {
                    ch = Character.toLowerCase((char) (ch + 1));
                }
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public static String sub(String b) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if (ch >= '0' && ch <= '9') {
                if (ch == '0') {
                    ch = '9';
                }else {
                    ch = (char) (ch - 1);
                }
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a') {
                    ch = 'Z';
                }else {
                    ch = Character.toUpperCase((char) (ch - 1));
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A') {
                    ch = 'z';
                }else {
                    ch = Character.toLowerCase((char) (ch - 1));
                }
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}

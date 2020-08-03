package 字符串中找出连续最长的数字串;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/8/3 9:56
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String result = getString(s);
            System.out.println(result);
        }
    }

    public static String getString(String s) {
        ArrayList<String> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isNumber(chars[i])) {
                sb.append(chars[i]);
                continue;
            }
            if (sb.length() != 0) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        if (isNumber(chars[s.length() - 1])) {
            list.add(sb.toString());
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return list.get(list.size() - 1);
    }

    public static boolean isNumber(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
}

package 删除公共字符;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/4 0:13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Set<Character> set = new HashSet<>();
        StringBuffer stringBuffer = new StringBuffer();
        char[] chars2 = s2.toCharArray();
        for (char ch : chars2) {
            set.add(ch);
        }
        for (int i = 0; i < s1.length(); i++) {
            if (!set.contains(s1.charAt(i))) {
                stringBuffer.append(s1.charAt(i));
            }
        }
        System.out.println(stringBuffer.toString());
    }
}

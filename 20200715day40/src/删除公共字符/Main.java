package 删除公共字符;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/15 22:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String find = sc.nextLine();
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < find.length(); i++) {
                set.add(find.charAt(i));
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (!set.contains(c)) {
                    stringBuilder.append(c);
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}

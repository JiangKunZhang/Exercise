package 字母统计;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/10 23:12
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    map.put(ch,map.getOrDefault(ch,0) + 1);
            }
            char c = 'A';
            for (int i = 0; i < 26; i++) {
                if (map.containsKey(c)) {
                    System.out.println(c + ":" + map.get(c));
                }else {
                    System.out.println(c + ":" + 0);
                }
                c++;
            }
        }
    }
}

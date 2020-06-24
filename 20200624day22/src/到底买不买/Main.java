package 到底买不买;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/24 22:32
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int res = 0;
            Map<Character,Integer> mapA = new HashMap<>();
            Map<Character,Integer> mapB = new HashMap<>();
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                mapA.put(ch,mapA.getOrDefault(ch,0) + 1);
            }
            for (int i = 0; i < b.length(); i++) {
                char ch = b.charAt(i);
                mapB.put(ch,mapB.getOrDefault(ch,0) + 1);
            }
            for(Map.Entry entry : mapB.entrySet()) {
                char ch = (char) entry.getKey();
                int count = (int) entry.getValue();
                if (!mapA.containsKey(ch)) {
                   res += count;
                }else if (mapA.get(ch) < count) {
                    res += count - mapA.get(ch);
                }
            }
            if (res != 0) {
                System.out.println("No " + res);
            }else {
                System.out.println("Yes " + (a.length() - b.length()));
            }
        }
    }
}

package 乒乓球框;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/21 22:18
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string1 = sc.next();
            String string2 = sc.next();
            Map<Character,Integer> mapA = new HashMap<>();
            for (int i = 0; i < string1.length(); i++) {
                char ch = string1.charAt(i);
                mapA.put(ch,mapA.getOrDefault(ch, 0) + 1);
            }

            boolean flg = true;
            Map<Character,Integer> mapB = new HashMap<>();
            for (int i = 0; i < string2.length(); i++) {
                char ch = string2.charAt(i);
                mapB.put(ch,mapB.getOrDefault(ch, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : mapB.entrySet()) {
                char ch = entry.getKey();
                int count = entry.getValue();
                if (mapA.getOrDefault(ch,0) > 0) {
                    if (count <= mapA.getOrDefault(ch, 0)) {
                        continue;
                    }else {
                        flg = false;
                        break;
                    }
                }else {
                    flg = false;
                    break;
                }
            }

            if (flg) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}

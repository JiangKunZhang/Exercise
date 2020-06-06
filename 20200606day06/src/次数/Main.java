package 次数;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/6 23:08
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int n = 0;
        int num = 0;
        while (sc.hasNext()) {
            num = sc.nextInt();
            map.put(num,map.getOrDefault(num,0) + 1);
            n++;
        }

        for (Map.Entry<Integer,Integer> en : map.entrySet()) {
            if (en.getValue() >= (n / 2)) {
                System.out.println(en.getKey());
                break;
            }
        }
    }
}

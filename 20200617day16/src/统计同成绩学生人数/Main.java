package 统计同成绩学生人数;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/17 21:17
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int tmp = sc.nextInt();
                map.put(tmp,map.getOrDefault(tmp,0) + 1);
            }
            int key = sc.nextInt();
            System.out.println(map.getOrDefault(key, 0));
        }
    }
}

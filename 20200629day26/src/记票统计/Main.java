package 记票统计;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/29 22:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n1 = sc.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n1; i++) {
                String name = sc.next();
                if (name != null && name.length() > 0 && !list.contains(name)) {
                    list.add(name);
                }
            }

            int n2 = sc.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n2; i++) {
                String name = sc.next();
                if (name != null && name.length() > 0) {
                    map.put(name,map.getOrDefault(name,0) + 1);
                }
            }

            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i) + " : " + map.getOrDefault(list.get(i), 0));
                count += map.getOrDefault(list.get(i), 0);
            }
            System.out.println("Invalid : " + (n2 - count));
        }
    }
}

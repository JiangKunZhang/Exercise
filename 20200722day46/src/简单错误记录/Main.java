package 简单错误记录;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/22 23:14
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            int index = s.lastIndexOf("\\");
            String name = index < 0 ? s : s.substring(index + 1);
            int n = sc.nextInt();
            String key = name + " " + n;
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue() - o1.getValue() == 0) ? (o1.getValue() - o2.getValue()) : (o2.getValue() - o1.getValue());
            }
        });
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            count++;
            if (count <= 8) {
                String[] strings = entry.getKey().split(" ");
                String k = strings[0].length() > 16 ? strings[0].substring(strings[0].length() - 16) : strings[0];
                String v = strings[1];

                System.out.println(k + " " + v + " " + entry.getValue());
            } else {
                break;
            }
        }
    }
}

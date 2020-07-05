package 简单错误记录;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/5 21:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNext()) {
            String s = sc.next();
            int lastIndex = s.lastIndexOf("\\");
            String name = lastIndex < 0 ? s : s.substring(lastIndex + 1);
            int number = sc.nextInt();
            String key = name + " " + number;
            map.put(key,map.getOrDefault(key,0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>( map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue() - o1.getValue()) == 0 ? (o1.getValue() - o2.getValue()) : (o2.getValue() - o1.getValue());
            }
        });

        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            if (count < 8) {
                String[] str = entry.getKey().split(" ");
                String k = str[0].length() > 16 ? str[0].substring(str[0].length() - 16) : str[0];
                String n = str[1];
                System.out.println(k + " " + n + " " + entry.getValue());
            }else {
                break;
            }
            count++;
        }
    }
}

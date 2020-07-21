package 查找兄弟单词;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/21 22:43
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = sc.next();
            }
            String string = sc.next();
            int index = sc.nextInt();
            LinkedList<String> linkedList = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (check(string,strings[i])) {
                    linkedList.add(strings[i]);
                }
            }
            linkedList.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            System.out.println(linkedList.size());
            if (linkedList.size() >= index) {
                System.out.println(linkedList.get(index - 1));
            }
        }
    }

    public static boolean check(String a, String b) {
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        if (a.equals(b) || a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            mapA.put(ch,mapA.getOrDefault(ch,0) + 1);
        }
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            mapB.put(ch,mapB.getOrDefault(ch,0) + 1);
        }
        for (Map.Entry<Character,Integer> entry : mapB.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (mapA.getOrDefault(ch,0) != count) {
                return false;
            }
        }
        return true;
    }
}

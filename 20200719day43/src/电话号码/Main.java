package 电话号码;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/19 21:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Set<String> set = new TreeSet<String>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String s = sc.nextLine();
                set.add(func(s));
            }
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println();
        }
    }

    public static String func(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                stringBuilder.append(ch);
                count++;
            } else if (ch >= 'A' && ch <= 'Z'){
                stringBuilder.append(getNum(ch));
                count++;
            } else {
                continue;
            }

            if (count == 3) {
                stringBuilder.append('-');
            }
        }
        return stringBuilder.toString();
    }

    public static int getNum(char ch) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"ABC");
        map.put(3,"DEF");
        map.put(4,"GHI");
        map.put(5,"JKL");
        map.put(6,"MNO");
        map.put(7,"PQRS");
        map.put(8,"TUV");
        map.put(9,"WXYZ");
        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            if (entry.getValue().contains(ch + "")) {
                return entry.getKey();
            }
        }
        return 1;
    }
}

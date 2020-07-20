package 数组中值出现了一次的数字;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/20 17:05
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Set<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            for (int i = 0; i < n; i++) {
                if (!set.contains(array[i])) {
                    set.add(array[i]);
                } else {
                    set.remove(array[i]);
                }
            }
            int index = set.size();
            Iterator iterator = set.iterator();
            int i = 0;
            while (iterator.hasNext()) {
                System.out.print(iterator.next());
                if (i != index - 1) {
                    System.out.print(" ");
                }
                i++;
            }
            System.out.println();
        }
    }
}

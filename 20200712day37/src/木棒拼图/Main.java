package 木棒拼图;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/12 22:20
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 1) {
                list.add(b);
                sum += b;
            } else {
                list.remove(list.indexOf(b));
                sum -= b;
            }
            Collections.sort(list);

            if(list.size() > 0){
                max = list.get(list.size()-1);
            }
            if (sum - max <= max) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
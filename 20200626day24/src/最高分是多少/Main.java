package 最高分是多少;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/26 23:11
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] array = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                array[i] = sc.nextInt();
            }
            sc.nextLine();
            for (int i = 0; i < m; i++) {
                String s = sc.nextLine();
                String[] strings = s.split(" ");
                char ch = strings[0].charAt(0);
                int a = Integer.valueOf(strings[1]);
                int b = Integer.valueOf(strings[2]);
                if (ch == 'Q') {
                    int max = Math.max(a,b);
                    int min = Math.min(a,b);
                    System.out.println(getMax(array, min, max));
                } else {
                    array[a] = b;
                }
            }
        }
    }

    public static int getMax(int[] array, int left, int right) {
        int max = array[left];
        for (int i = left + 1; i <= right; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }
}

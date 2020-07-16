package 最大连续和;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/16 23:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i] += Math.max(array[i - 1], 0);
            max = Math.max(max, array[i]);
        }
        System.out.println(max);
    }
}

package 单调栈结构;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/20 17:32
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
            int[][] res = func(array);
            for (int i = 0; i < res.length; i++) {
                System.out.println(res[i][0] + " " + res[i][1]);
            }
        }
    }

    public static int[][] func(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int[][] res = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            while (!stack.empty() && array[stack.peek()] > array[i]) {
                int popIndex = stack.pop();
                int left = stack.empty() ? -1 : stack.peek();
                res[popIndex][0] = left;
                res[popIndex][1] = i;
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int popIndex = stack.pop();
            int left = stack.empty() ? -1 : stack.peek();
            res[popIndex][0] = left;
            res[popIndex][1] = -1;
        }
        return res;
    }
}

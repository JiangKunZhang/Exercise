package 数字颠倒;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/9 23:11
 */
public class Main {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }

    }

    public static void print(int n) {
        if (n > 9) {
            print(n/10);
        }
        stack.push(n%10);
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        while (n != 0) {
            int tmp = n % 10;
            queue.offer(tmp);
            n = n / 10;
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll());
        }
    }
}

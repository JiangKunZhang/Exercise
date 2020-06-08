package n个数里最小的k个;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/8 23:15
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (sc.hasNext()) {
            stack.push(sc.nextInt());
        }
        int[] array = new int[stack.pop()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        creatHeap(array);
        while (!stack.empty()) {
            int num = stack.pop();
            if (num < array[0]) {
                array[0] = num;
                adjustDown(array,0,array.length);
            }
        }
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i]);
            if (i != 0) System.out.print(" ");
            else System.out.println();
        }
    }

    public static void creatHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    public static void adjustDown(int[] array, int root, int len) {
        int parent = root;
        int child = parent*2+1;
        while (child < len) {
            if (child+1 < len && array[child+1] > array[child]) {
                child++;
            }
            if (array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = parent*2+1;
            }else {
                break;
            }
        }
    }
}

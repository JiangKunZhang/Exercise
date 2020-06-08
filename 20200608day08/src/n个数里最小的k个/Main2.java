package n个数里最小的k个;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/8 23:42
 */
public class Main2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            stack.push(sc.nextInt());
        }
        int k = stack.pop();
        int[] array = new int[stack.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        quickSort(array);
        for (int i = 0; i < k; i++) {
            System.out.print(array[i]);
            if (i != k - 1) System.out.print(" ");
        }

    }

    public static void quickSort(int[] array) {
        quick(array,0,array.length-1);
    }

    public static void quick(int[] array, int left, int right) {
        if (left >= right) return;
        int par = partition(array, left, right);
        quick(array, left, par - 1);
        quick(array, par + 1, right);
    }

    public static int partition(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (low < high && array[high] >= tmp) {
                high--;
            }
            array[low] = array[high];
            while (low < high && array[low] <= tmp) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }
}

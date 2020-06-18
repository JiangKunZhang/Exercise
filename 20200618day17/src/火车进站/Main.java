package 火车进站;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/18 23:17
 */
public class Main {
    public static List<int[]> list = new LinkedList<>();
    public static List<String> res = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            getArray(array,0,n - 1);
            for (int[] num : list) {
                if (check(array,num)) {
                    res.add(print(num));
                }
            }

            Collections.sort(res);

            for (int i = 0; i < res.size(); i++) {
                System.out.println(res.get(i));
            }
        }
    }

    public static String print(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i != array.length - 1) {
                stringBuilder.append(" ");
            }
        }
       return stringBuilder.toString();
    }

    public static boolean check(int[] arrayIn, int[]arrayOut ) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < arrayIn.length; i++) {
            stack.push(arrayIn[i]);
            while (!stack.empty() && arrayOut[j] == stack.peek()) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }

    public static void getArray(int[] array, int start, int end) {
        if (start == end) {
            int[] tmp = array.clone();
            list.add(tmp);
            return;
        }
        for (int i = start; i <= end; i++) {
            swap(array,i,start);
            getArray(array,start + 1,end);
            swap(array,i,start);

        }
    }

    public static void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}

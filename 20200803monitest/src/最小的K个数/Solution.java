package 最小的K个数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/8/3 9:48
 */
public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k <= 0 || k > input.length) return list;
        PriorityQueue<Integer> queue = new PriorityQueue<>(4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (i < k) {
                queue.offer(input[i]);
            } else {
                if (input[i] < queue.peek()) {
                    queue.poll();
                    queue.offer(input[i]);
                }
            }
        }

        for (int i = 0; i < k; i++) {
            list.add(queue.poll());
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] array = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(array,4);
        System.out.println(list.toString());
    }
}

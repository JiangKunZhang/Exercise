package 数组中出现次数超过一半的数字;

import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/22 22:58
 */
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        Arrays.sort(array);
        int target = array[array.length / 2];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return target;
        }
        return 0;
    }
}

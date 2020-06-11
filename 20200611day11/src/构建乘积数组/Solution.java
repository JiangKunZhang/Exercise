package 构建乘积数组;

import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/11 22:26
 */
public class Solution {
    public static int[] multiply(int[] A) {
        int mul = 1;
        int[] ret = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            mul = 1;
            for (int j = 0; j < A.length; j++) {
                if (j != i) {
                    mul = mul * A[j];
                }
            }
            ret[i] = mul;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = multiply(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ret));
    }
}

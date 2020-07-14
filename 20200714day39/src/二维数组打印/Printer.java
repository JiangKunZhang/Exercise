package 二维数组打印;

import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/14 23:04
 */
public class Printer {
    public static int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int[] res = new int[n * n];
        int index = 0;

        int x;
        int y;
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                x = 0;
                y = n - i - 1;
                while (x < n && y < n) {
                    res[index++] = arr[x][y];
                    x++;
                    y++;
                }
            }else {
                x = i - n + 1;
                y = 0;
                while (x < n && y < n) {
                    res[index++] = arr[x][y];
                    x++;
                    y++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[] res = arrayPrint(arr, 5);
        System.out.println(Arrays.toString(res));
    }
}

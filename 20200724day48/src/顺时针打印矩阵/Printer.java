package 顺时针打印矩阵;

import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/24 22:49
 */
public class Printer {
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int[] result = new int[n * m];
        int index = 0;
        if (mat == null) return result;
        if (m == 0) return result;
        int layers = (Math.min(n,m) - 1) / 2 + 1;
        for (int i = 0; i < layers; i++) {
            for (int j = i; j < m-i; j++) {
                result[index++] = mat [i][j];
            }
            for (int k = i+1; k < n-i; k++) {
                result[index++] = mat[k][m-i-1];
            }
            for (int j = m-i-2; (j >= i) && (n-i-1 != i); j--) {
                result[index++] = mat[n-i-1][j];
            }
            for (int k = n-i-2; (k > i) && (m-i-1 != i); k--) {
                result[index++] = mat[k][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int[] res = clockwisePrint(mat,2,2);
        System.out.println(Arrays.toString(res));
    }
}

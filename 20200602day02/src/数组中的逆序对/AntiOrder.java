package 数组中的逆序对;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/2 16:11
 */
public class AntiOrder {
    public static int count(int[] A, int n) {
        // write code here
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (A[i] > A[j]) res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,0};
        System.out.println(count(a,8));
    }
}

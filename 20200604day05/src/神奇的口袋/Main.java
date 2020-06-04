package 神奇的口袋;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/4 21:57
 */
public class Main {

    public static int Pocket(int[] array, int k, int m) {
        if (m == 0) {
            return 1;   //要凑够重量为0，只有一种方式：什么都不选
        }
        if (k <= 0) {
            return 0;   //当没有物品时，可选方案为0，巧妇难成无米之炊
        }
        return Pocket(array,k-1, m-array[k]) + Pocket(array,k-1, m);    //Pocket(k-1, m-a[k])为必须要第k个物品时可选方案数
        //Pocket(k-1, m)为不必要第k个物品时可选方案数
    }

    public static void main(String[] args) {
        int[] array = new int[21];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(Pocket(array,n,40));
    }
}


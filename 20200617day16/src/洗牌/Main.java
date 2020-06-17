package 洗牌;

import java.util.*;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/17 20:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()) {
            int T = sc.nextInt();
            while (T-- > 0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] res = new int[2*n];
                for(int i = 0; i < 2 * n; i++){
                    int index = i + 1;
                    for(int j = 0; j < k; j++){
                        if (index <= n) index = 2 * index - 1;
                        else index = 2 * (index - n);
                    }
                    res[index - 1] = sc.nextInt();
                }
                for(int i = 0; i < 2 * n; i++){
                    System.out.print(res[i]);
                    if (i != 2 * n - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            //System.out.println();
        //}
    }
}

package 不要二;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/7 23:53
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[1000][1000];
        int W,H;
        W = sc.nextInt();
        H = sc.nextInt();
        int count = 0;
        int left = 0,right = 0,up = 0,down = 0;
        for (int i = 0; i < W; i++) {
            for (int j = 0; j < H; j++) {
                if (array[i][j] == 0) {
                    count++;
                    left = j - 2;
                    right = j + 2;
                    up = i - 2;
                    down = i + 2;
                    if (left >= 0) {
                        array[i][left] = -1;
                    }
                    if (right <= H-1) {
                        array[i][right] = -1;
                    }
                    if (up >= 0) {
                        array[up][j] = -1;
                    }
                    if (down <= W-1) {
                        array[down][j] = -1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

package 机器人走方格I;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/10 21:42
 */
public class Robot {
    public int countWays(int x, int y) {
        // write code here
        return count(x, y);
    }

    //递归版本
    public static int count(int x, int y) {
        if (x == 1 || y == 1) {
            return 1;
        }
        return count(x-1,y) + count(x,y-1);
    }

    //非递归版本
    private static int count1(int m, int n){
        int state[][] = new int [m + 1][n + 1];
        //进行初始化
        for(int i = 0; i <= m; i++){
            state[i][1] = 1;
        }
        for(int i = 0; i <= n; i++){
            state[1][i] = 1;
        }
        //从第二行与第二列进行填充
        for(int i = 2; i <= m; i++){
            for(int j = 2; j <= n; j++){
                state[i][j] = state[i - 1][j] + state[i][j - 1];
            }
        }
        return state[m][n];
    }

}
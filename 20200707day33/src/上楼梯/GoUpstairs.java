package 上楼梯;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/7 23:38
 */
public class GoUpstairs {
    public static int countWays(int n) {
        // write code here
        int a = 1;
        int b = 2;
        int c = 4;
        if(n < 1) return 0;
        if(n == 1) return a;
        if(n == 2) return b;
        if(n == 3) return c;
        for(int i = 4;i <= n;i++){
            int temp = ((a + b) % 1000000007 + c) % 1000000007;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(countWays(20));
    }
}

package two的个数;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/6 22:46
 */
public class Count2 {
    public static int countNumberOf2s(int n) {
        // write code here
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i,b = n % i;
            //之所以补8，是因为当百位为0，则a/10==(a+8)/10，
            //当百位>=2，补8会产生进位位，效果等同于(a/10+1)
            count += (a + 7) / 10 * i + ((a % 10 == 2) ? b + 1 : 0);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOf2s(20));
    }
}

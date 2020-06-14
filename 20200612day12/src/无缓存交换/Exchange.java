package 无缓存交换;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/12 22:37
 */
public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[1] ^ AB[0];
        return AB;
    }
}

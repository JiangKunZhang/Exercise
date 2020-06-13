package 商品折扣后的最终价格;

import java.util.Arrays;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/13 22:37
 */
public class Solution {
    public static int[] finalPrices(int[] prices) {
        int next = 1;
        int[] ret = new int[prices.length];
        if (prices.length == 1) return prices;
        for (int i = 0; i < prices.length; i++) {
            next = i + 1;
            while (next < prices.length) {
                if (prices[next] <= prices[i]) {
                    break;
                }
                next++;
            }
            if (next == prices.length) {
                ret[i] = prices[i];
            }else {
                ret[i] = prices[i] - prices[next];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] prices = {10,1,1,6};
        int[] ret = finalPrices(prices);
        System.out.println(Arrays.toString(ret));
    }
}

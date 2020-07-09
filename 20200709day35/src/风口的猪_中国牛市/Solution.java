package 风口的猪_中国牛市;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/9 23:40
 */
public class Solution {
    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     *
     * 先正序遍历一遍记录第k天时第一次交易可以获得的最大收益，
     * 然后再后序遍历一次，记录第k天时后面有第二次交易可获的最大收益。
     * 再将第k天的两次交易最大值相加比较即可获得结果。
     * 注意，正序遍历时表示在第k天之前可以获得的最大收益，后序遍历表示第k天后面可以获得的最大收益。
     */
    public static int calculateMax(int[] prices) {
        int leftPrice = prices[0];
        int[] leftMax = new int[prices.length];
        leftMax[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            leftPrice = Math.min(leftPrice,prices[i]);
            leftMax[i] = Math.max(leftMax[i - 1],prices[i] - leftPrice);
        }

        int rightPrice = prices[prices.length - 1];
        int[] rightMax = new int[prices.length];
        rightMax[prices.length - 1] = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            rightPrice = Math.max(rightPrice, prices[i]);
            rightMax[i] = Math.max(rightMax[i + 1], rightPrice - prices[i]);
        }

        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, leftMax[i] + rightMax[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {3,8,5,1,7,8};
        System.out.println(calculateMax(array));
    }
}

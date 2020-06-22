package 微信红包;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/22 21:59
 */
public class Gift {
    public static int getValue(int[] gifts, int n) {
        // write code here
        Map<Integer,Integer> map = new HashMap<>();
        for (int gift : gifts) {
            map.put(gift,map.getOrDefault(gift,0) + 1);
        }

        for (int gift : gifts) {
            if (map.get(gift) > n / 2) {
                return gift;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] gifts = {1,2,3,2,2};
        System.out.println(getValue(gifts,5));
    }
}

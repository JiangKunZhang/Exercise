package 最近公共祖先;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/13 22:57
 */
public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        while (a != b) {
            if (a > b) {
                a = a / 2;
            }else {
                b = b / 2;
            }
        }
        return a;
    }
}

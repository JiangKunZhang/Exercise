package 子串判断;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/21 21:31
 */
public class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] res = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (s.contains(p[i])) {
                res[i] = true;
            }else {
                res[i] = false;
            }
        }
        return res;
    }
}

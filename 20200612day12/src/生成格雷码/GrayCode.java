package 生成格雷码;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/12 22:41
 */
public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        //0,1
        //00,01,11,10
        //000,001,011,010,110,111,101,100
        if (n == 1) {
            String[] ret = new String[2];
            ret[0] = "0";ret[1] = "1";
            return ret;
        }

        String[] tmp = getGray(n-1);
        String[] ret = new String[tmp.length * 2];//后一个是前一个的两倍
        //前一半是 “0” + 顺序 （从头到尾）
        for (int i = 0; i < tmp.length; i++) {
            ret[i] = "0" + tmp[i];
        }
        //后一半是 “1” + 逆序 （从尾到头）
        for (int i = 0; i < tmp.length; i++) {
            ret[i + tmp.length] = "1" + tmp[tmp.length - 1 - i];
        }

        return ret;
    }
}

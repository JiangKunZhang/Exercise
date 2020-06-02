package 统计回文;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/5/31 23:11
 */
public class Main {

    public static boolean isHuiWen(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {//记得是小于号，不能等于
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        String fin = "";
        int res = 0;
        char[] bArray = B.toCharArray();
        StringBuffer stringBuffer;

        //看一下A+B这种可以不
        fin = A + B;
        if (isHuiWen(fin) == true) {
            res++;
        }
        //从0到length-1往进加
        for (int i = 0; i < A.length(); i++) {
            stringBuffer = new StringBuffer();
            for (int j = 0; j < A.length(); j++) {
                if (j == i) {
                    stringBuffer.append(bArray);
                }
                stringBuffer.append(A.charAt(j));
            }
            fin = stringBuffer.toString();
            if (isHuiWen(fin) == true) {
                res++;
            }
        }

        System.out.println(res);
    }
}

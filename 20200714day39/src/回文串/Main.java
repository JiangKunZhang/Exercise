package 回文串;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/14 23:29
 *
 */

/**
 *  既然能通过增加一个字符变成回文串，
 *  那一定也可以通过删除一个字符变成回文串。
 *  用一个循环，每次循环依次删掉一个字符，
 *  然后检查新串是否是回文串，看起来简单方便许多。
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String tmp = s;
            boolean flg = false;
            for (int i = 0; i < s.length(); i++) {
                tmp = s;
                tmp = tmp.replace(s.charAt(i),' ');
                tmp = tmp.replace(" ","");
                if (isPa(tmp)) {
                    flg = true;
                }
            }
            if (flg) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPa(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}

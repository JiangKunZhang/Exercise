package 找x;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/1 0:06
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int res = sc.nextInt();
            boolean flg = true;
            for (int i = 0; i < n; i++) {
                if (list.get(i) == res) {
                    System.out.println(i);
                    flg = false;
                    break;
                }
            }
            if (flg) {
                System.out.println(-1);
            }
        }
    }
}

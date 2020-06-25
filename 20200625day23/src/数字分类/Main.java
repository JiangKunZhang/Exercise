package 数字分类;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/25 23:43
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int N = sc.nextInt();
        int A1 = 0;
        int A2 = 0;
        int A3 = 0;
        int A4 = 0;
        int A5 = 0;
        int flg = 1;
        int count = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            list.add(tmp);
            if (tmp % 5 == 0) {
                if (tmp % 2 == 0) {
                    A1 += tmp;
                }
            }
            if (tmp % 5 == 1) {
                A2 += flg * tmp;
                flg = -flg;
            }
            if (tmp % 5 == 2) {
                A3++;
            }
            if (tmp % 5 == 3) {
                A4 += tmp;
                count++;
            }
            if (tmp % 5 == 4) {
                if (tmp > A5) {
                    A5 = tmp;
                }
            }
        }
        if (A1 != 0) {
            System.out.print(A1 + " ");
        }else {
            System.out.print('N' + " ");
        }
        if (A2 != 0) {
            System.out.print(A2 + " ");
        }else {
            System.out.print('N' + " ");
        }
        if (A3 != 0) {
            System.out.print(A3 + " ");
        }else {
            System.out.print('N' + " ");
        }
        if (A4 != 0) {
            //System.out.printf("%.1f ",(A4 * 1.0) / count);
            System.out.print(A4 / count + "." + (int)((A4%count*100/count+5)/10) + " ");
        }else {
            System.out.print('N' + " ");
        }
        if (A5 != 0) {
            System.out.print(A5);
        }else {
            System.out.println('N' + " ");
        }
    }
}

package 计算糖果;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/6 22:52
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,n4,A,B,C;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        A = (n1 + n3) / 2;
        B = A - n1;
        C = B - n2;
        if (B + C == n4) {
            System.out.println(A + " " + B + " " +C);
        }else {
            System.out.println("No");
        }
    }
}

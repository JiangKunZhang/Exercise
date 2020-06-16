package 另类加法;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/16 21:59
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(add(a,b));
    }

    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        int xor = a ^ b;//不考虑进位
        int and = (a & b) << 1;// & 得到进位，左移到应该的位置
        return add(xor,and);//递归直到进位为 0 也就是 b 为 0
    }
}

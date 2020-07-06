package 在霍格沃兹找零钱;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/6 22:20
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String[] strings1 = s1.split("\\.");
        String[] strings2 = s2.split("\\.");
        long num1 = (((Integer.parseInt(strings1[0]) * 17) + Integer.parseInt(strings1[1])) * 29) + Integer.parseInt(strings1[2]);
        long num2 = (((Integer.parseInt(strings2[0]) * 17) + Integer.parseInt(strings2[1])) * 29) + Integer.parseInt(strings2[2]);
        long num = num2 - num1;
        String pre = "";
        if (num < 0) pre = "-";
        num = Math.abs(num);
        long a = num / (17 * 29);
        num = num % (17 * 29);
        long b = num / 29;
        num = num % 29;
        long c = num;
        String res = pre + a + "." + b + "." + c;
        System.out.println(res);

    }
}

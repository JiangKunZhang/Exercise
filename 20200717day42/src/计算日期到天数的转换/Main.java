package 计算日期到天数的转换;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/17 23:41
 */
public class Main {
    public static void main(String[] args) {
        int[] date = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] dates = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            int res = 0;
            res += dates[month - 1];
            res += day;
            if (isLeapYear(year)) {
                res += 1;
            }
            System.out.println(res);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

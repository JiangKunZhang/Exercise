package 整数与IP地址之间的转换;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/1 0:10
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] strings1 = s1.split("\\.");
            StringBuffer stringBuffer1 = new StringBuffer();
            for (String s : strings1) {
                String tmp = tenToTwo(Integer.parseInt(s));
                stringBuffer1.append(tmp);
            }
            System.out.println(twoToTen(stringBuffer1.toString()));
            String string = tenToTwo32(Integer.parseInt(s2));
            String[] strings2 = new String[4];
            for (int i = 0; i < 4; i++) {
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = 0; j < 8; j++) {
                    stringBuffer.append(string.charAt((i * 8) + j));
                }
                strings2[i] = stringBuffer.toString();
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < 4; i++) {
                String tmp = twoToTen(strings2[i]);
                stringBuffer.append(tmp);
                if (i != 3) stringBuffer.append(".");
            }
            System.out.println(stringBuffer.toString());
        }
    }

    public static String tenToTwo ( int number){
        StringBuffer res = new StringBuffer();
        int count = 0;
        while (number > 0) {
            res.append(number % 2 + "");
            number = number / 2;
            count++;
        }
        for (int i = count; i < 8; i++) {
            res.append(0 + "");
        }
        return res.reverse().toString();
    }

    public static String tenToTwo32 ( int number){
        StringBuffer res = new StringBuffer();
        int count = 0;
        while (number > 0) {
            res.append(number % 2 + "");
            number = number / 2;
            count++;
        }
        for (int i = count; i < 32; i++) {
            res.append(0 + "");
        }
        return res.reverse().toString();
    }

    public static String twoToTen (String number){
        int res = 0;
        int e = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int tmp = (int) Math.pow(2, e);
            res += ((number.charAt(i) - '0') * tmp);
            e++;
        }
        return String.valueOf(res);
    }
}
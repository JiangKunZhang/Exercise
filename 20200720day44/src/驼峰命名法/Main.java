package 驼峰命名法;

import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/20 23:30
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] strings = s.split("_");
            String res = strings[0];
            for (int i = 1; i < strings.length; i++) {
                res += (char)(strings[i].charAt(0) - 'a' + 'A');
                for (int j = 1; j < strings[i].length(); j++) {
                    res += strings[i].charAt(j);
                }
            }
            System.out.println(res);
        }
    }
}

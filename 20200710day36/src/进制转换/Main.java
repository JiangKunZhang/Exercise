package 进制转换;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/10 23:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        map.put('A',10);
        map.put('B',11);
        map.put('C',12);
        map.put('D',13);
        map.put('E',14);
        map.put('F',15);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            s = s.substring(2);
            int length = s.length();
            int res = 0;
            for (int i = 0; i < length; i++) {
                char ch = s.charAt(i);
                if (ch - '0' <= 9) {
                    res += (ch-'0') * Math.pow(16, length - i - 1);
                }else {
                    res += map.getOrDefault(ch,0) * Math.pow(16, length - i - 1);
                }
            }
            System.out.println(res);
        }
    }
}

package BrokenKeyboard;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/8 19:21
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String old = sc.next();
        String res = sc.next();
        old = old.toUpperCase();
        res = res.toUpperCase();
        Set<Character> resSet = new HashSet<>();
        for (int i = 0; i < res.length(); i++) {
            resSet.add(res.charAt(i));
        }
        Set<Character> oldSet = new HashSet<>();
        for (int i = 0; i < old.length(); i++) {
            char ch = old.charAt(i);
            if (resSet.contains(ch)) continue;
            if (oldSet.contains(ch)) continue;
            System.out.print(ch);
            oldSet.add(ch);
        }
    }
}

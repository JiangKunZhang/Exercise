package 说反话;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/7/5 21:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            Stack<String> stack = new Stack<>();
            for (String string : strings) {
                stack.push(string);
            }
            int max = stack.size();
            for (int i = 0; i < max; i++) {
                System.out.print(stack.pop());
                if (i != max - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

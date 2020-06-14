package 超长正整数相加;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/14 21:33
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String num1 = sc.nextLine();
            String num2 = sc.nextLine();
            Stack<String> stack = new Stack<>();
            String longNum;
            String shortNum;
            if (num1.length() >= num2.length()) {
                longNum = num1;
                shortNum = num2;
            }else {
                longNum = num2;
                shortNum = num1;
            }
            int shortLen = shortNum.length() - 1;
            int tmpRes = 0;
            int tmpHigh = 0;
            int tmpLow = 0;
            for (int i = longNum.length() - 1; i >= 0; i--,shortLen--) {
                if (shortLen >= 0) {
                    int number1 = longNum.charAt(i) - '0';
                    int number2 = shortNum.charAt(shortLen) - '0';
                    tmpRes = number1 + number2 + tmpHigh;
                    tmpHigh = tmpRes / 10;
                    tmpLow = tmpRes % 10;
                    stack.push(String.valueOf(tmpLow));
                }else {
                    int number1 = longNum.charAt(i) - '0';
                    int number2 = 0;
                    tmpRes = number1 + number2 + tmpHigh;
                    tmpHigh = tmpRes / 10;
                    tmpLow = tmpRes % 10;
                    stack.push(String.valueOf(tmpLow));
                }
            }
            if (tmpHigh > 0) {
                stack.push(String.valueOf(tmpHigh));
            }
            StringBuffer stringBuffer = new StringBuffer();
            while (!stack.empty()) {
                stringBuffer.append(stack.pop());
            }
            System.out.println(stringBuffer.toString());
        }
    }
}

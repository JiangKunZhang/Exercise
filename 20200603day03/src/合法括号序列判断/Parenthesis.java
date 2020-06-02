package 合法括号序列判断;

import java.util.Stack;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/2 23:54
 */
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        char[] chars = A.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (chars[i] == '(') {
                stack.push(chars[i]);
            }else {
                if (chars[i] != ')') {
                    return false;
                }
                if (!stack.empty() && chars[i] == ')') {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }else {
            return false;
        }
    }
}
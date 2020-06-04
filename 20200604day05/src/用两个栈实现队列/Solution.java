package 用两个栈实现队列;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/4 21:59
 */
import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //让stack1始终存放数据，stack2来辅助
    //放进来数据的时候，先把stack1里的数据全部放在stack2
    //然后给stack1放进来，再把stack2的数据倒进stack1
    //此时，stack1里面的数据顺序就是队列中的情况
    public void push(int node) {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(node);
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }
}

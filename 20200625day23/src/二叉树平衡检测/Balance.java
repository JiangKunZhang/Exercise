package 二叉树平衡检测;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/25 23:33
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Balance {
    public static void main(String[] args) {
        
    }

    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null) return true;
        if (Math.abs(getDeep(root.left) - getDeep(root.right)) <= 1) {
            return isBalance(root.left) && isBalance(root.right);
        }else {
            return false;
        }
    }

    public static int getDeep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getDeep(root.left),getDeep(root.right)) + 1;
    }
}

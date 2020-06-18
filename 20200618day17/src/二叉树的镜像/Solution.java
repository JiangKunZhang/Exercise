package 二叉树的镜像;

/**
 * @author PineappleSnow
 * @version 1.0
 * @date 2020/6/18 23:26
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public void Mirror(TreeNode root) {
        MirrorChild(root);
    }
    public void  MirrorChild(TreeNode root) {
        if (root == null) return;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        MirrorChild(root.left);
        MirrorChild(root.right);
    }
}

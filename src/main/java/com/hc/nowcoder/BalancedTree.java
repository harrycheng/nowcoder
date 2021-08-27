package com.hc.nowcoder;

public class BalancedTree {
    public boolean IsBalanced_Solution(TreeLinkNode root) {
        if (root == null){
            return true;
        }

        return java.lang.Math.abs(treeDepth(root.left) - treeDepth(root.right)) <= 1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    public int treeDepth(TreeLinkNode root) {
        if (root != null) {
            int leftDepth = 1 + treeDepth(root.left);
            int rightDepth = 1 + treeDepth(root.right);
            return leftDepth > rightDepth ? leftDepth : rightDepth;
        } else {
            return 0;
        }
    }
}

package com.hc.nowcoder;

public class TreeNodeDepth {

    public static void main(String[] args) {
        System.out.println("");
    }

    public int TreeDepth(TreeNode root) {
        return FindTreeDepth(root);
    }

    public int FindTreeDepth(TreeNode root) {
        if (root != null) {
            int leftDepth = 1 + FindTreeDepth(root.left);
            int rightDepth = 1 + FindTreeDepth(root.right);
            return leftDepth > rightDepth ? leftDepth : rightDepth;
        } else {
            return 0;
        }
    }
}
